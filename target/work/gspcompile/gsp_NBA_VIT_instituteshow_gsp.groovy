import nba_vit.Institute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_instituteshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/institute/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'institute.label', default: 'Institute'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (instituteInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("institute.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(instituteInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instituteInstance?.address)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("institute.address.label"),'default':("Address")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(instituteInstance),'field':("address")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instituteInstance?.establishmentDate)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("institute.establishmentDate.label"),'default':("Establishment Date")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(instituteInstance?.establishmentDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instituteInstance?.vision)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("institute.vision.label"),'default':("Vision")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(instituteInstance),'field':("vision")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instituteInstance?.mission)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("institute.mission.label"),'default':("Mission")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(instituteInstance),'field':("mission")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instituteInstance?.vmCreatedDate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("institute.vmCreatedDate.label"),'default':("Vm Created Date")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',75,['date':(instituteInstance?.vmCreatedDate)],-1)
printHtmlPart(16)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',83,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',83,['class':("edit"),'action':("edit"),'resource':(instituteInstance)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',84,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',86,['url':([resource:instituteInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442294238000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
