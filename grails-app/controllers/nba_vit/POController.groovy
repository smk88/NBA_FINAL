package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import nba_vit.PO
import grails.converters.JSON

@Transactional(readOnly = true)
class POController {

    def InformationService
    def InsertService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("in po index")
        params.max = Math.min(max ?: 10, 100)

        println(params)
        def po = PO.list(params)
        println(session)
        //        def po = PO.list()
        println(po)
        def programs = InformationService.getProgramsFromEmp(session.employee)
        println(programs)
        session.programs = programs
        List po1 = new ArrayList();
        println("Filtering list")
        for(Program p : session.programs)
        {
            println(p)
            po1.addAll(po.findAll({it.program!=null && it.program.name == p.name}))
            println(po1.size())
        }
        
        println("PO1 = "+po1)
        respond po1, model:[POInstanceCount: PO.count()]
    }

    def show(PO POInstance) {
        println("in po show")
        println(POInstance)
        respond POInstance
    }
    def showGA(PO POInstance) {
        println("in po showGA")
        println(POInstance)
        respond POInstance
    }

    def create() {
        println("in po create")
        //        params.program="B.Tech-Information Technology"
        println("params = "+params)
        Employee emp = Employee.findByEmployee_code(session.user)
        Program prog = Program.findByName(emp.program)
        def programs = Program.findAllByDepartment(prog.department)
        def pos = PO.findAll{ program == prog}
        int count = pos.size()
        println("count = "+count)
        count+=1
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%2000)+1);
        println("ay="+ay)
        
        [count:count,academic_year:ay]
        //        def po = new PO(params)
        //        println("po="+po)
        //        respond po
        session.program = programs
        //        Program prog = Program.findByName(emp.program)
        session.department = prog.department
        println(session)
    }

    @Transactional
    def save(PO POInstance) {
        println("in po save")
        if (POInstance == null) {
            notFound()
            return
        }

        if (POInstance.hasErrors()) {
            respond POInstance.errors, view:'create'
            return
        }

        POInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'POInstance.label', default: 'PO'), POInstance.id])
                redirect POInstance
            }
            '*' { respond POInstance, [status: CREATED] }
        }
    }

    def edit(PO POInstance) {
        println("in po edit")
        respond POInstance
    }
    def editGA(PO POInstance) {
        println("in po editGA")
        session.count = POInstance.po_code
        respond POInstance
    }

    @Transactional
    def update(PO POInstance) {
        println("in po update original")
        if (POInstance == null) {
            notFound()
            return
        }

        if (POInstance.hasErrors()) {
            respond POInstance.errors, view:'edit'
            return
        }

        POInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PO.label', default: 'PO'), POInstance.id])
//                redirect POInstance
             redirect(controller:"EmployeeHome" , action:"HOD")
            }
//            '*'{ respond POInstance, [status: OK] }
        }
    }

    @Transactional
    def updateGA(PO POInstance) {
        println("in po updateGA")
        POInstance.program = null
        println(POInstance.program)
        if (POInstance == null) {
            notFound()
            return
        }

        if (POInstance.hasErrors()) {
            respond POInstance.errors, view:'edit'
            return
        }

        POInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PO.label', default: 'PO'), POInstance.id])
                redirect POInstance
            }
            redirect(action:"index1")
//            '*'{ respond POInstance, [status: OK] }
        }
        
    }

    @Transactional
    def delete(PO POInstance) {
        println("in po DELETE")
        
        if (POInstance == null) {
            notFound()
            return
        }

        POInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PO.label', default: 'PO'), POInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'POInstance.label', default: 'PO'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
   
    def createPO()
    {
        println("Now in createPO")
        //println(session)
        def programs = InformationService.getProgramsFromEmp(session.employee)
        session.programs = programs
        render(template:"select_form")
    }
    def setProgram()
    {
        //InformationService.setProgramInSession(params)
        println("now setProgram")
        println(params)
        def program = Program.get(params.id)
        println(program)
        session.program = program
        def poList = PO.findAllByProgram(program)
        println(poList)
        println(poList.size())
        session.count = poList.size()+1
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%1000)+1);
        println("ay="+ay)
        session.ay = ay
        render(template: "Myform")
    }
    
    @Transactional//(readOnly = false)
    def savePO(String po_code, String po_statement, String is_lock, String is_current, String revision_year )
    {
        println("saving PO")
        try{
        def res = InsertService.insertPO(po_code,po_statement,session.program,is_lock,is_current,revision_year)
        }catch(Exception e)
        {}
        def result = [:]
//        if(res > 0)
//            result['success']="record inserted"
//        else
//            result['fail']="record not inserted"
            result <<[fail:'record not inserted',var: 'post']
        
//        def jResult = result as JSON
        [json: [results: result]]
        redirect(action:"index")
    }
    
    def createGA()
    {
        println("Now in create GA")
//        Program program = Program.findByName("All Department")
        def poList = PO.findAllByProgram(null)
        def count = poList.size()
        println(poList)
        println(count)
        session.count = count + 1 
        
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%2000)+1);
        println("ay="+ay)
        session.ay = ay
//        [count:count]
        render(template:"formCreateGA")
    }
    
    @Transactional
    def saveGA(String po_code, String po_statement, String is_lock, String is_current, String revision_year )
    {
        println("saving GA")
        try{
        def res = InsertService.insertPO(po_code,po_statement,null,is_lock,is_current,revision_year)
        }catch(Exception e)
        {
            println(e)
        }
//        def result = [:]
//        if(res > 0)
//            result['success']="record inserted"
//        else
//            result['fail']="record not inserted"
//            result <<[fail:'record not inserted',var: 'post']
//        
////        def jResult = result as JSON
//        [json: [results: result]]
        redirect(action:"index1")
    }
    
    def index1()
    {
        println("in index1")
        Program prog =null
        def po = PO.findAllByProgram(prog)
        println(po)
        session.pos = po
//        [po:po]
        
        respond po, model:[POInstanceCount: PO.count(),POInstanceList:po]
//        redirect(action:"index")
        render(template:"GAList")
//        respond po, model:[POInstanceCount: PO.count()]
    }
    
    
}
