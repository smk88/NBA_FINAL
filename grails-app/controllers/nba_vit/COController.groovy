package nba_vit

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import groovy.xml.MarkupBuilder

@Transactional(readOnly = true)
class COController { 
    def InformationService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
        println(params)
        
        def co = CO.list(params)
        //        def po = PO.list()
        println(session.courses)
        List co1 = new ArrayList();
        println("Filtering list")
        int count=0;
        for(Course c : session.courses)
        {
            println(c)
//            co1.addAll(co.findAll({it.course.course_name == c.course_name}))
            co1.addAll(co.findAll({it.course.course_name == c.course_name}))
            
            println(co1.size())
//           for(CO cc : co1)
//           {
//                print(cc.co_statement+" ,")
//           }
        } 
        println(co1)
        respond co1, model:[COInstanceCount: CO.count()]
    }

    def show(CO COInstance) {
        respond COInstance
    }

    def create() {
        println("create method of CO controller")
        
        println("Function called")
        println(params)
        def course = Course.get(params.course.id)
        println("Course="+course)
        session.course = course
        def cos = InformationService.getCOsfromCourse(course)
        println("cos= "+cos)
        int count = cos.size()+1
        println("count="+count)
        session.count = count
        //        Course course = Course.findByCourse_code("CS20105")
        //        def cos = InformationService.getCOsfromCourse(course);
        //        println(cos)
        //        int count = cos.size()
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%1000)+1);
        println("ay="+ay)
        //                session.count = count+1
        session.academic_year = ay
        //                [count:count,academic_year:ay]
        respond new CO(params)

    }

    @Transactional
    def save(CO COInstance) {
        println("Now in save    method of CO-Controller")
        println(COInstance)
        if (COInstance == null) {
            notFound()
            return
        }

        if (COInstance.hasErrors()) {
            println("error in COInstance")    
            respond COInstance.errors, view:'create'
            return
        }
        println("saving CO")
        COInstance.save flush:true
        redirect(controller:'employeeHome',action:'courseOwner')
//        request.withFormat {
//            form {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'COInstance.label', default: 'CO'), COInstance.id])
//                redirect COInstance
//            }
//            '*' { respond COInstance, [status: CREATED] }
//        }
    }

    def edit(CO COInstance) {
        respond COInstance
    }

    @Transactional
    def update(CO COInstance) {
        println("Update co original")
        if (COInstance == null) {
            notFound()
            return
        }

        if (COInstance.hasErrors()) {
            respond COInstance.errors, view:'edit'
            return
        }

        COInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CO.label', default: 'CO'), COInstance.id])
                if(session.role == "Course Owner")
                    redirect(action:'index1')
                else
                    redirect(controller:'EmployeeHome',action:'listCOs')
            }
            '*'{ respond COInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CO COInstance) {
        println("now in CO delete function")
        println(COInstance)
        COInstance.delete flush:true
        //CO is used in COassessment_mapping so can not delete directly
        
       /* if (COInstance == null) {
            notFound()
            return
        }

        COInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CO.label', default: 'CO'), COInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }*/
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'COInstance.label', default: 'CO'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    
    def myudpateFunction()  
    {
        println("Function called")
        println(params)
        def course = Course.get(params.id)
        println("Course="+course)
        session.course = course
        def cos = InformationService.getCOsfromCourse(course)
        println("cos= "+cos)
        int count = cos.size()+1
        println("count="+count)
        session.count = count
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%1000)+1);
        session.ay = ay
        println("rendering form_1 now")
        println(CO.list(params))
        respond co:"co statements"
//        respond CO.list(params), model:[COInstanceCount: CO.count()]
        render( template: "form_1" )
    }
    
    def myCreatePage()
    {
        println("now in my create page")
    }
    
    def form_create()
    {
        println("now in form_create ")
    }
    
    @Transactional
    def save1(String co_statement, String  co_code,String is_current,String is_lock,String revision_year)
    {
        println("now in save1 of CO-Controller")

        def co = new CO()  
        co.co_code = co_code
        co.co_statement = co_statement
        co.course = session.course 
        co.revision_year = revision_year
//        co.is_lock = is_lock
//        co.is_current = is_current
        co.save(flush: true, failOnError: true);
//        
        redirect(action:"index1")   
//        r(action:"index")
        
        
    }
//    def save1()
//    {
//        println("now in save1 of CO-Controller")
//        println(params)
//        def co = new CO()  
//        co.co_code = params.co_code
//        co.co_statement = params.co_statement
//        co.course = session.course 
//        co.revision_year = params.revision_year
//        co.is_lock = params._is_lock
//        co.is_current = params._is_current
//        co.save(flush: true, failOnError: true);
//        
//        redirect(action:"index")
//        
//        
//    }

    
    
    def getCOs()
    {
        println("getCos in co-controller")
        println(params)
        def program = Program.get(params.program.id)
        println("program = "+program)
        def clist = InformationService.getCoursesForProgram(program)   
        session.courses = clist
        redirect(action:'index1')
    }
    
    
    def index1(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
        println(params)
        
        def co = CO.list(params)
        //        def po = PO.list()
        println(session.courses)
        List co1 = new ArrayList();
        println("Filtering list")
        int count=0;
        for(Course c : session.courses)
        {
            println(c)
//            co1.addAll(co.findAll({it.course.course_name == c.course_name}))
            co1.addAll(co.findAll({it.course.course_name == c.course_name}))
            
            println(co1.size())
//           for(CO cc : co1)
//           {
//                print(cc.co_statement+" ,")
//           }
        } 
        println(co1)
        respond co1, model:[COInstanceCount: CO.count()]
    }

}
