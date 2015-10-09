package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CourseCategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CourseCategory.list(params), model:[courseCategoryInstanceCount: CourseCategory.count()]
    }

    def show(CourseCategory courseCategoryInstance) {
        respond courseCategoryInstance
    }

    def create() {
        respond new CourseCategory(params)
    }

    @Transactional
    def save(CourseCategory courseCategoryInstance) {
        if (courseCategoryInstance == null) {
            notFound()
            return
        }

        if (courseCategoryInstance.hasErrors()) {
            respond courseCategoryInstance.errors, view:'create'
            return
        }

        courseCategoryInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'courseCategoryInstance.label', default: 'CourseCategory'), courseCategoryInstance.id])
                redirect courseCategoryInstance
            }
            '*' { respond courseCategoryInstance, [status: CREATED] }
        }
    }

    def edit(CourseCategory courseCategoryInstance) {
        respond courseCategoryInstance
    }

    @Transactional
    def update(CourseCategory courseCategoryInstance) {
        if (courseCategoryInstance == null) {
            notFound()
            return
        }

        if (courseCategoryInstance.hasErrors()) {
            respond courseCategoryInstance.errors, view:'edit'
            return
        }

        courseCategoryInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CourseCategory.label', default: 'CourseCategory'), courseCategoryInstance.id])
                redirect courseCategoryInstance
            }
            '*'{ respond courseCategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CourseCategory courseCategoryInstance) {

        if (courseCategoryInstance == null) {
            notFound()
            return
        }

        courseCategoryInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CourseCategory.label', default: 'CourseCategory'), courseCategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseCategoryInstance.label', default: 'CourseCategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
