package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class COPOMappingController {
    def InformationService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond COPOMapping.list(params), model:[COPOMappingInstanceCount: COPOMapping.count()]
    }

    def show(COPOMapping COPOMappingInstance) {
        respond COPOMappingInstance
    }

    def create() {
        println("Now in COPOMapping create")
        println(session)
        List cos = InformationService.getCOforCourse(session.course)
        println(cos)
        respond new COPOMapping(params)
    }

    @Transactional
    def save(COPOMapping COPOMappingInstance) {
        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        if (COPOMappingInstance.hasErrors()) {
            respond COPOMappingInstance.errors, view:'create'
            return
        }

        COPOMappingInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'COPOMappingInstance.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect COPOMappingInstance
            }
            '*' { respond COPOMappingInstance, [status: CREATED] }
        }
    }

    def edit(COPOMapping COPOMappingInstance) {
        respond COPOMappingInstance
    }

    @Transactional
    def update(COPOMapping COPOMappingInstance) {
        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        if (COPOMappingInstance.hasErrors()) {
            respond COPOMappingInstance.errors, view:'edit'
            return
        }

        COPOMappingInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'COPOMapping.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect COPOMappingInstance
            }
            '*'{ respond COPOMappingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(COPOMapping COPOMappingInstance) {

        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        COPOMappingInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'COPOMapping.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'COPOMappingInstance.label', default: 'COPOMapping'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
