import nba_vit.CourseOutcome
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_courseOutcome_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/courseOutcome/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: courseOutcomeInstance, field: 'acadamicYear', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("courseOutcome.acadamicYear.label"),'default':("Acadamic Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("acadamicYear"),'value':(courseOutcomeInstance?.acadamicYear)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOutcomeInstance, field: 'coCode', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("courseOutcome.coCode.label"),'default':("Co Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("coCode"),'value':(courseOutcomeInstance?.coCode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOutcomeInstance, field: 'coStatement', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("courseOutcome.coStatement.label"),'default':("Co Statement")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("coStatement"),'value':(courseOutcomeInstance?.coStatement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOutcomeInstance, field: 'course', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("courseOutcome.course.label"),'default':("Course")],-1)
printHtmlPart(7)
invokeTag('select','g',34,['id':("course"),'name':("course.id"),'from':(nba_vit.Course.list()),'optionKey':("id"),'required':(""),'value':(courseOutcomeInstance?.course?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseOutcomeInstance, field: 'employee', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("courseOutcome.employee.label"),'default':("Employee")],-1)
printHtmlPart(7)
invokeTag('select','g',42,['id':("employee"),'name':("employee.id"),'from':(nba_vit.Employee.list()),'optionKey':("id"),'required':(""),'value':(courseOutcomeInstance?.employee?.id),'class':("many-to-one")],-1)
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
