package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)
class LoginController {
    def SendMailService   
    def loginService
    def ResetPasswordService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("now in index of login controller")
        //params.max = Math.min(max ?: 10, 100)
       // respond Login.list(params), model:[loginInstanceCount: Login.count()]
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

    def find={              
        println("Now in find "+params)
       
        def userFlag=loginService.getUser(params)
        if(userFlag == false)
        {
//            println("user not found")
            render(view:"/login/login")
            
        }
        else
        {
            println("user found")
            session.isValid = true
//            println("User = "+session.user)
//            println("Usertype = "+session.usertype)
//            println("User role = "+session.role)
            if(session.usertype.toString()=="Employee")
            {
                println("sending to employee page")
                redirect(controller:'EmployeeHome',action:'home')
                // render(view:"/employee/EmployeeHome")
               
            }
            else if(session.usertype.toString()=="Student")
            {
                println("sending to student page")
                redirect(controller:'EmployeeHome',action:'student')
            }
            else
                println("oops!!!")
            //            render(view:"/login/authenticate")
            
        }
        if(params.Forgot.toString()=="Forgot Password")
        {
            println("clicked on forgot")
            render(view:"/login/forgotpassword")
        }       

        
        
        //        println("Session in contr:"+session)
    }
    
    
    def submitotp={
        println("in submit otp")
        String username=session.user
        def otpcompareflag=SendMailService.compareOTP(params,username)
        if(otpcompareflag==true) 
        {
            render(view:"/login/resetpassword")
        }                
        else
        {
            println("wrong OTP")
            flash.message="Please Enter Valid OTP..."
            render(view:"/login/submitotp")
        }
    }
    def resetpassword={
        println("in reset password of forgot password:"+session.user)              
        def passwordFlag=ResetPasswordService.setPassword(params,session.user)
        if(passwordFlag == false)
        {
            println("Password cannot change...")
            render(view:"/login/resetpassword")
        }
        if(passwordFlag==true)
        {     
            render(view:"/login/login")
        }       
    }
    def forgotpassword={
        println("I am in forgot password trying to send mail...")
        def mailFlag=SendMailService.sendMail(params)
        if(mailFlag == false)
        {
            println("Mail Not Sent")
            render(view:"/login/forgotpassword")
        }
        if(mailFlag == true)
        {
            println("Mail Sent Successfully...");             
            //OTP page Here
            render(view:"/login/submitotp")
        }
    }

    def logout()
    {
        println("logging out of session")
        session.invalidate()
//        session.isValid = false
        redirect(controller:"Login" ,action : "login")
//        redirect(view : "NBA_VIT/login")
    }
    
    def login()
    {
        println("now in login controller login funct")
    }
    def checkSession()
    {
        println("Checking session")
        println(session)
        if(session.isValid != null)
        {
               println("session is valid")
               println(session.user)
        }
        else
        {
//               redirect(controller:"Login", action:"login")
            println("session is invalid")
//            redirect(view : "/NBA_VIT")
        }
            
    }
    
    def customerQuery()
    {
        //render("done")
    }
    def complainLogs()
    {
       // println("in complain:"+params)
        println("in complain:"+params.email)
        CustomerComplain cc = new CustomerComplain()
        cc.setEid(params.eid.toString())
        cc.setEname(params.ename.toString())
        cc.setDept(params.edept.toString())
        cc.setContact(params.emob.toString())
        cc.setEmail(params.email.toString())
        cc.setProbDescription(params.pdesp.toString())
        cc.setSuggestion(params.sugg.toString())
       // SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss")
       def time = new java.util.Date().getTime()
       def cy =time + " | " +Calendar.getInstance().get(Calendar.DATE)+ "/" +Calendar.getInstance().get(Calendar.MONTH)+ "/" +  Calendar.getInstance().get(Calendar.YEAR);
         
         
        println("Date:"+cy)
        cc.setDate(cy.toString())
        cc.setStatus("In progress")
        cc.save(flush: true)
        redirect(controller: "Login", action: "find")
    }
    def lastComplainStatus()
    {
        
        def pd =CustomerComplain.findAllByEid(params.eid).probDescription
      // println("in last:"+lc)
        def sug =CustomerComplain.findAllByEid(params.eid).suggestion
      // println("in last:"+lc1)
        def  sts =CustomerComplain.findAllByEid(params.eid).Status
      // println("in last:"+lc2)
       [pd:pd,sug:sug,sts:sts]
       //println("in last:"+lc.suggestion)
      // println("in last:"+lc.Status)
    }
    def allLogs()
    {
        def all = CustomerComplain.findAll()
        println("All:"+all)
        [all:all]
    }
    def complainLogsEdit()
    {
        println("Edit:"+params)
        def eid = params.eid
        def status = params.status
        def date = params.date
        for(int i=0;i<eid.size();i++){
        String query = "update CustomerComplain set status='"+status[i]+"' where eid='"+eid[i]+"' and date='"+date[i]+"'"
        println("Q...."+query)
        CustomerComplain.executeUpdate(query);
        }
    }
}
