package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OTPController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OTP.list(params), model:[OTPInstanceCount: OTP.count()]
    }

    def show(OTP OTPInstance) {
        respond OTPInstance
    }

    def create() {
        respond new OTP(params)
    }

    @Transactional
    def save(OTP OTPInstance) {
        if (OTPInstance == null) {
            notFound()
            return
        }

        if (OTPInstance.hasErrors()) {
            respond OTPInstance.errors, view:'create'
            return
        }

        OTPInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'OTPInstance.label', default: 'OTP'), OTPInstance.id])
                redirect OTPInstance
            }
            '*' { respond OTPInstance, [status: CREATED] }
        }
    }

    def edit(OTP OTPInstance) {
        respond OTPInstance
    }

    @Transactional
    def update(OTP OTPInstance) {
        if (OTPInstance == null) {
            notFound()
            return
        }

        if (OTPInstance.hasErrors()) {
            respond OTPInstance.errors, view:'edit'
            return
        }

        OTPInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OTP.label', default: 'OTP'), OTPInstance.id])
                redirect OTPInstance
            }
            '*'{ respond OTPInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OTP OTPInstance) {

        if (OTPInstance == null) {
            notFound()
            return
        }

        OTPInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OTP.label', default: 'OTP'), OTPInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'OTPInstance.label', default: 'OTP'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
