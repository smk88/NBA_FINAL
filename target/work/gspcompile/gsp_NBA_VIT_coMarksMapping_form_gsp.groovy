import nba_vit.CoMarksMapping
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_coMarksMapping_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/coMarksMapping/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'actualMarks', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("coMarksMapping.actualMarks.label"),'default':("Actual Marks")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("actualMarks"),'type':("number"),'value':(coMarksMappingInstance.actualMarks),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'assessmentMarks', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("coMarksMapping.assessmentMarks.label"),'default':("Assessment Marks")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("assessmentMarks"),'type':("number"),'value':(coMarksMappingInstance.assessmentMarks),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'assessmentType', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("coMarksMapping.assessmentType.label"),'default':("Assessment Type")],-1)
printHtmlPart(2)
invokeTag('select','g',26,['id':("assessmentType"),'name':("assessmentType.id"),'from':(nba_vit.AssessmentType.list()),'optionKey':("id"),'required':(""),'value':(coMarksMappingInstance?.assessmentType?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'course', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("coMarksMapping.course.label"),'default':("Course")],-1)
printHtmlPart(2)
invokeTag('select','g',34,['id':("course"),'name':("course.id"),'from':(nba_vit.Course.list()),'optionKey':("id"),'required':(""),'value':(coMarksMappingInstance?.course?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'courseOffering', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("coMarksMapping.courseOffering.label"),'default':("Course Offering")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['id':("courseOffering"),'name':("courseOffering.id"),'from':(nba_vit.CourseOffering.list()),'optionKey':("id"),'required':(""),'value':(coMarksMappingInstance?.courseOffering?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'employee', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("coMarksMapping.employee.label"),'default':("Employee")],-1)
printHtmlPart(2)
invokeTag('select','g',50,['id':("employee"),'name':("employee.id"),'from':(nba_vit.Employee.list()),'optionKey':("id"),'required':(""),'value':(coMarksMappingInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coMarksMappingInstance, field: 'percentage', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("coMarksMapping.percentage.label"),'default':("Percentage")],-1)
printHtmlPart(2)
invokeTag('field','g',58,['name':("percentage"),'type':("number"),'value':(coMarksMappingInstance.percentage),'required':("")],-1)
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
