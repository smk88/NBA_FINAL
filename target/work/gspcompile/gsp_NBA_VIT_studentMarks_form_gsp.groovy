import nba_vit.StudentMarks
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_studentMarks_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentMarks/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentMarksInstance, field: 'actualMarks', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("studentMarks.actualMarks.label"),'default':("Actual Marks")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("actualMarks"),'type':("number"),'value':(studentMarksInstance.actualMarks),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentMarksInstance, field: 'assessmentMarks', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("studentMarks.assessmentMarks.label"),'default':("Assessment Marks")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("assessmentMarks"),'type':("number"),'value':(studentMarksInstance.assessmentMarks),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentMarksInstance, field: 'assessmentType', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("studentMarks.assessmentType.label"),'default':("Assessment Type")],-1)
printHtmlPart(2)
invokeTag('select','g',26,['id':("assessmentType"),'name':("assessmentType.id"),'from':(nba_vit.AssessmentType.list()),'optionKey':("id"),'required':(""),'value':(studentMarksInstance?.assessmentType?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentMarksInstance, field: 'courseOffering', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("studentMarks.courseOffering.label"),'default':("Course Offering")],-1)
printHtmlPart(2)
invokeTag('select','g',34,['id':("courseOffering"),'name':("courseOffering.id"),'from':(nba_vit.CourseOffering.list()),'optionKey':("id"),'required':(""),'value':(studentMarksInstance?.courseOffering?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentMarksInstance, field: 'student', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("studentMarks.student.label"),'default':("Student")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['id':("student"),'name':("student.id"),'from':(nba_vit.Student.list()),'optionKey':("id"),'required':(""),'value':(studentMarksInstance?.student?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
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
