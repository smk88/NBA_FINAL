import nba_vit.CourseOffering
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_courseOffering_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/courseOffering/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: courseOfferingInstance, field: 'acadamicYear', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("courseOffering.acadamicYear.label"),'default':("Acadamic Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("acadamicYear"),'value':(courseOfferingInstance?.acadamicYear)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOfferingInstance, field: 'course', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("courseOffering.course.label"),'default':("Course")],-1)
printHtmlPart(5)
invokeTag('select','g',18,['id':("course"),'name':("course.id"),'from':(nba_vit.Course.list()),'optionKey':("id"),'required':(""),'value':(courseOfferingInstance?.course?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOfferingInstance, field: 'module', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("courseOffering.module.label"),'default':("Module")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("module"),'value':(courseOfferingInstance?.module)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOfferingInstance, field: 'semester', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("courseOffering.semester.label"),'default':("Semester")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("semester"),'value':(courseOfferingInstance?.semester)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOfferingInstance, field: 'year', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("courseOffering.year.label"),'default':("Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("year"),'value':(courseOfferingInstance?.year)],-1)
printHtmlPart(9)
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
