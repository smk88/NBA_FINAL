package nba_vit



import grails.test.mixin.*
import spock.lang.*

@TestFor(COPOMappingController)
@Mock(COPOMapping)
class COPOMappingControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.COPOMappingInstanceList
            model.COPOMappingInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.COPOMappingInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def COPOMapping = new COPOMapping()
            COPOMapping.validate()
            controller.save(COPOMapping)

        then:"The create view is rendered again with the correct model"
            model.COPOMappingInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            COPOMapping = new COPOMapping(params)

            controller.save(COPOMapping)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/COPOMapping/show/1'
            controller.flash.message != null
            COPOMapping.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def COPOMapping = new COPOMapping(params)
            controller.show(COPOMapping)

        then:"A model is populated containing the domain instance"
            model.COPOMappingInstance == COPOMapping
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def COPOMapping = new COPOMapping(params)
            controller.edit(COPOMapping)

        then:"A model is populated containing the domain instance"
            model.COPOMappingInstance == COPOMapping
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            status == 404

        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def COPOMapping = new COPOMapping()
            COPOMapping.validate()
            controller.update(COPOMapping)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.COPOMappingInstance == COPOMapping

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            COPOMapping = new COPOMapping(params).save(flush: true)
            controller.update(COPOMapping)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/COPOMapping/show/$COPOMapping.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            status == 404

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def COPOMapping = new COPOMapping(params).save(flush: true)

        then:"It exists"
            COPOMapping.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(COPOMapping)

        then:"The instance is deleted"
            COPOMapping.count() == 0
            response.redirectedUrl == '/COPOMapping/index'
            flash.message != null
    }
}
