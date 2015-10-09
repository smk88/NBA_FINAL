package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class COController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CO.list(params), model:[COInstanceCount: CO.count()]
    }

    def show(CO COInstance) {
        respond COInstance
    }

    def create() {
        respond new CO(params)
    }

    @Transactional
    def save(CO COInstance) {
        if (COInstance == null) {
            notFound()
            return
        }

        if (COInstance.hasErrors()) {
            respond COInstance.errors, view:'create'
            return
        }

        COInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'COInstance.label', default: 'CO'), COInstance.id])
                redirect COInstance
            }
            '*' { respond COInstance, [status: CREATED] }
        }
    }

    def edit(CO COInstance) {
        respond COInstance
    }

    @Transactional
    def update(CO COInstance) {
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
                redirect COInstance
            }
            '*'{ respond COInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CO COInstance) {

        if (COInstance == null) {
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
        }
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
}
