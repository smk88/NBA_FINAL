import nba_vit.StudentCourse
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_studentCourse_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentCourse/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentCourseInstance, field: 'courseOffering', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("studentCourse.courseOffering.label"),'default':("Course Offering")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("courseOffering"),'name':("courseOffering.id"),'from':(nba_vit.CourseOffering.list()),'optionKey':("id"),'required':(""),'value':(studentCourseInstance?.courseOffering?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentCourseInstance, field: 'student', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("studentCourse.student.label"),'default':("Student")],-1)
printHtmlPart(2)
invokeTag('select','g',18,['id':("student"),'name':("student.id"),'from':(nba_vit.Student.list()),'optionKey':("id"),'required':(""),'value':(studentCourseInstance?.student?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentCourseInstance, field: 'studentDivision', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("studentCourse.studentDivision.label"),'default':("Student Division")],-1)
printHtmlPart(6)
invokeTag('textField','g',26,['name':("studentDivision"),'value':(studentCourseInstance?.studentDivision)],-1)
printHtmlPart(7)
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
