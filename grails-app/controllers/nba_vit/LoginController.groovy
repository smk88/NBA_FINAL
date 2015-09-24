package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class LoginController {
    
    def loginService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("now in index")
        params.max = Math.min(max ?: 10, 100)
        respond Login.list(params), model:[loginInstanceCount: Login.count()]
       // redirect(action:authenticate)
        //redirect(action:LogForm)
    }

    def show(Login loginInstance) {
        respond loginInstance
    }

    def create() {
        respond new Login(params)
    }

    @Transactional
    def save(Login loginInstance) {
        if (loginInstance == null) {
            notFound()
            return
        }

        if (loginInstance.hasErrors()) {
            respond loginInstance.errors, view:'create'
            return
        }

        loginInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'loginInstance.label', default: 'Login'), loginInstance.id])
                redirect loginInstance
            }
            '*' { respond loginInstance, [status: CREATED] }
        }
    }

    def edit(Login loginInstance) {
        respond loginInstance
    }

    @Transactional
    def update(Login loginInstance) {
        if (loginInstance == null) {
            notFound()
            return
        }

        if (loginInstance.hasErrors()) {
            respond loginInstance.errors, view:'edit'
            return
        }

        loginInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Login.label', default: 'Login'), loginInstance.id])
                redirect loginInstance
            }
            '*'{ respond loginInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Login loginInstance) {

        if (loginInstance == null) {
            notFound()
            return
        }

        loginInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Login.label', default: 'Login'), loginInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
//        println("not found")
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'loginInstance.label', default: 'Login'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    def forgotpassword={
        println("In forgot password")
    }
    def find={              
        println("Now in find "+params)
       
        def userFlag=loginService.getUser(params)
        if(userFlag == false)
        {
            println("user not found")
            render(view:"/login/login")
        }
        else
        {
            println("user found")
            println("User = "+session.user)
            println("Usertype = "+session.usertype)
            println("User role = "+session.role)
            if(session.usertype.toString()=="Employee")
            {
                println("sending to employee page")
                redirect(controller:'EmployeeHome',action:'home')
                // render(view:"/employee/EmployeeHome")
               
            }
            else if(session.usertype.toString()=="Student")
            {
                redirect(controller:'EmployeeHome',action:'student')
                println("sending to student page")
            }
            else
                println("oops!!!")
//            render(view:"/login/authenticate")
            
        }
//        println("Session in contr:"+session)
    }
}
