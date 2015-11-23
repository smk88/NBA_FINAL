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
invokeTag('textField','g',9,['name':("course_code"),'value':(courseInstance?.course_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'associated_course', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("course.associated_course.label"),'default':("Associatedcourse")],-1)
printHtmlPart(5)
invokeTag('select','g',17,['id':("associated_course"),'name':("associated_course.id"),'from':(nba_vit.Course.list()),'noSelection':(['':'-Choose course-']),'optionKey':("id"),'value':(courseInstance?.associated_course?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'courseCategory', 'error'))
printHtmlPart(6)
invokeTag('message','g',22,['code':("course.courseCategory.label"),'default':("Course Category")],-1)
printHtmlPart(7)
invokeTag('select','g',25,['id':("courseCategory"),'name':("courseCategory.id"),'from':(nba_vit.CourseCategory.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.courseCategory?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_credit', 'error'))
printHtmlPart(8)
invokeTag('message','g',30,['code':("course.course_credit.label"),'default':("Coursecredit")],-1)
printHtmlPart(7)
invokeTag('field','g',33,['name':("course_credit"),'type':("number"),'value':(courseInstance.course_credit),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_name', 'error'))
printHtmlPart(9)
invokeTag('message','g',38,['code':("course.course_name.label"),'default':("Coursename")],-1)
printHtmlPart(5)
invokeTag('textField','g',41,['name':("course_name"),'value':(courseInstance?.course_name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'course_type', 'error'))
printHtmlPart(10)
invokeTag('message','g',46,['code':("course.course_type.label"),'default':("Coursetype")],-1)
printHtmlPart(7)
invokeTag('select','g',49,['id':("course_type"),'name':("course_type.id"),'from':(nba_vit.CourseType.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.course_type?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'employee', 'error'))
printHtmlPart(11)
invokeTag('message','g',54,['code':("course.employee.label"),'default':("Employee")],-1)
printHtmlPart(7)
invokeTag('select','g',57,['id':("employee"),'name':("employee.id"),'from':(nba_vit.Employee.list()),'optionKey':("id"),'required':(""),'value':(courseInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'program', 'error'))
printHtmlPart(12)
invokeTag('message','g',62,['code':("course.program.label"),'default':("Program")],-1)
printHtmlPart(5)
invokeTag('select','g',65,['name':("program"),'from':(nba_vit.Program.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(courseInstance?.program*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: courseInstance, field: 'year', 'error'))
printHtmlPart(13)
invokeTag('message','g',70,['code':("course.year.label"),'default':("Year")],-1)
printHtmlPart(5)
invokeTag('textField','g',73,['name':("year"),'value':(courseInstance?.year)],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444997119832L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
