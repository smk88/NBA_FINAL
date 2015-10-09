package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class POController {

    def InformationService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("in po index")
        params.max = Math.min(max ?: 10, 100)
        
//        params.add(Program,"B.Tech-Computer")
        println(params)
        def po = PO.list(params)
        println(po)
        respond po, model:[POInstanceCount: PO.count()]
    }

    def show(PO POInstance) {
        println("in po show")
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

        session.program = programs
//        Program prog = Program.findByName(emp.program)
        session.department = prog.department
        println(session)
        int count = PO.count();
        println("count = "+count)
        count+=1
        [count:count]
//        def po = new PO(params)
//        println("po="+po)
//        respond po
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

    @Transactional
    def update(PO POInstance) {
        println("in po update")
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
            '*'{ respond POInstance, [status: OK] }
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
   
}
