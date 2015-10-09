import nba_vit.Course
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_course_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("course.course_code.label"),'default':("Coursecode")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("course_code"),'value':(courseInstance?.course_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_credit', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("course.course_credit.label"),'default':("Coursecredit")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['name':("course_credit"),'type':("number"),'value':(courseInstance.course_credit),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_name', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("course.course_name.label"),'default':("Coursename")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("course_name"),'value':(courseInstance?.course_name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_type', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("course.course_type.label"),'default':("Coursetype")],-1)
printHtmlPart(5)
invokeTag('select','g',34,['id':("course_type"),'name':("course_type.id"),'from':(nba_vit.CourseType.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.course_type?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'employee', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("course.employee.label"),'default':("Employee")],-1)
printHtmlPart(5)
invokeTag('select','g',42,['id':("employee"),'name':("employee.id"),'from':(nba_vit.Employee.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'module', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("course.module.label"),'default':("Module")],-1)
printHtmlPart(5)
invokeTag('field','g',50,['name':("module"),'type':("number"),'value':(courseInstance.module),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'program', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("course.program.label"),'default':("Program")],-1)
printHtmlPart(5)
invokeTag('select','g',58,['id':("program"),'name':("program.id"),'from':(nba_vit.Program.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.program?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'semester', 'error'))
printHtmlPart(11)
invokeTag('message','g',63,['code':("course.semester.label"),'default':("Semester")],-1)
printHtmlPart(5)
invokeTag('field','g',66,['name':("semester"),'type':("number"),'value':(courseInstance.semester),'required':("")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443085797757L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
