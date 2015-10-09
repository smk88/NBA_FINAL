import nba_vit.Institute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_institute_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/institute/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("institute.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(instituteInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'address', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("institute.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("address"),'value':(instituteInstance?.address)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'establishmentDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("institute.establishmentDate.label"),'default':("Establishment Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',26,['name':("establishmentDate"),'precision':("day"),'value':(instituteInstance?.establishmentDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'vision', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("institute.vision.label"),'default':("Vision")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("vision"),'value':(instituteInstance?.vision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'mission', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("institute.mission.label"),'default':("Mission")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("mission"),'value':(instituteInstance?.mission)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'vmCreatedDate', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("institute.vmCreatedDate.label"),'default':("Vm Created Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',50,['name':("vmCreatedDate"),'precision':("day"),'value':(instituteInstance?.vmCreatedDate)],-1)
printHtmlPart(10)
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
