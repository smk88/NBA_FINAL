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
expressionOut.print(hasErrors(bean: instituteInstance, field: 'address', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("institute.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("address"),'value':(instituteInstance?.address)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'establishment_date', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("institute.establishment_date.label"),'default':("Establishmentdate")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',18,['name':("establishment_date"),'precision':("day"),'value':(instituteInstance?.establishment_date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'mission', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("institute.mission.label"),'default':("Mission")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("mission"),'value':(instituteInstance?.mission)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'name', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("institute.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("name"),'value':(instituteInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'vision', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("institute.vision.label"),'default':("Vision")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("vision"),'value':(instituteInstance?.vision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituteInstance, field: 'vm_created_date', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("institute.vm_created_date.label"),'default':("Vmcreateddate")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',50,['name':("vm_created_date"),'precision':("day"),'value':(instituteInstance?.vm_created_date)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444132696000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
