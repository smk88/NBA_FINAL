package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.*

@Transactional(readOnly = true)
class ProgramController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("in program controller index")
        params.max = Math.min(max ?: 10, 100)
        respond Program.list(params), model:[programInstanceCount: Program.count()]
    }

    def show(Program programInstance) {
        println("in program controller show")
        respond programInstance
    }

    def create() {
        println("in program controller create")
        respond new Program(params)
    }

    @Transactional
    def save(Program programInstance) {
        println("in program controller save")
        if (programInstance == null) {
            notFound()
            return
        }

        if (programInstance.hasErrors()) {
            respond programInstance.errors, view:'create'
            return
        }

        programInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'programInstance.label', default: 'Program'), programInstance.id])
                redirect programInstance
            }
            '*' { respond programInstance, [status: CREATED] }
        }
    }

    def edit(Program programInstance) {
        println("in program controller edit")
        respond programInstance
    }

    @Transactional
    def update(Program programInstance) {
        println("in program controller update")
        if (programInstance == null) {
            notFound()
            return
        }

        if (programInstance.hasErrors()) {
            respond programInstance.errors, view:'edit'
            return
        }

        programInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Program.label', default: 'Program'), programInstance.id])
                redirect programInstance
            }
            '*'{ respond programInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Program programInstance) {
        println("in program controller delete")
        if (programInstance == null) {
            notFound()
            return
        }

        programInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Program.label', default: 'Program'), programInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'programInstance.label', default: 'Program'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
