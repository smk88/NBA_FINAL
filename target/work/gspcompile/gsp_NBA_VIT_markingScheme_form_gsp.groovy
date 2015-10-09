import nba_vit.MarkingScheme
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_markingScheme_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/markingScheme/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'courseType', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("markingScheme.courseType.label"),'default':("Course Type")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("courseType"),'name':("courseType.id"),'from':(nba_vit.CourseType.list()),'optionKey':("id"),'required':(""),'value':(markingSchemeInstance?.courseType?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'endSEmesterExam', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("markingScheme.endSEmesterExam.label"),'default':("End SE mester Exam")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("endSEmesterExam"),'type':("number"),'value':(markingSchemeInstance.endSEmesterExam),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'homeworkAssignment', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("markingScheme.homeworkAssignment.label"),'default':("Homework Assignment")],-1)
printHtmlPart(2)
invokeTag('field','g',26,['name':("homeworkAssignment"),'type':("number"),'value':(markingSchemeInstance.homeworkAssignment),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'laboratry', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("markingScheme.laboratry.label"),'default':("Laboratry")],-1)
printHtmlPart(2)
invokeTag('field','g',34,['name':("laboratry"),'type':("number"),'value':(markingSchemeInstance.laboratry),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'reviewFile', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("markingScheme.reviewFile.label"),'default':("Review File")],-1)
printHtmlPart(2)
invokeTag('field','g',42,['name':("reviewFile"),'type':("number"),'value':(markingSchemeInstance.reviewFile),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'reviewFour', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("markingScheme.reviewFour.label"),'default':("Review Four")],-1)
printHtmlPart(2)
invokeTag('field','g',50,['name':("reviewFour"),'type':("number"),'value':(markingSchemeInstance.reviewFour),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'reviewOne', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("markingScheme.reviewOne.label"),'default':("Review One")],-1)
printHtmlPart(2)
invokeTag('field','g',58,['name':("reviewOne"),'type':("number"),'value':(markingSchemeInstance.reviewOne),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'reviewThree', 'error'))
printHtmlPart(10)
invokeTag('message','g',63,['code':("markingScheme.reviewThree.label"),'default':("Review Three")],-1)
printHtmlPart(2)
invokeTag('field','g',66,['name':("reviewThree"),'type':("number"),'value':(markingSchemeInstance.reviewThree),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'reviewTwo', 'error'))
printHtmlPart(11)
invokeTag('message','g',71,['code':("markingScheme.reviewTwo.label"),'default':("Review Two")],-1)
printHtmlPart(2)
invokeTag('field','g',74,['name':("reviewTwo"),'type':("number"),'value':(markingSchemeInstance.reviewTwo),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'test1', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("markingScheme.test1.label"),'default':("Test1")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("test1"),'type':("number"),'value':(markingSchemeInstance.test1),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'test2', 'error'))
printHtmlPart(13)
invokeTag('message','g',87,['code':("markingScheme.test2.label"),'default':("Test2")],-1)
printHtmlPart(2)
invokeTag('field','g',90,['name':("test2"),'type':("number"),'value':(markingSchemeInstance.test2),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: markingSchemeInstance, field: 'tutorial', 'error'))
printHtmlPart(14)
invokeTag('message','g',95,['code':("markingScheme.tutorial.label"),'default':("Tutorial")],-1)
printHtmlPart(2)
invokeTag('field','g',98,['name':("tutorial"),'type':("number"),'value':(markingSchemeInstance.tutorial),'required':("")],-1)
printHtmlPart(15)
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
