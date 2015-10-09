import nba_vit.StudentMarks
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_studentMarksindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentMarks/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'studentMarks.label', default: 'StudentMarks'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("actualMarks"),'title':(message(code: 'studentMarks.actualMarks.label', default: 'Actual Marks'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("assessmentMarks"),'title':(message(code: 'studentMarks.assessmentMarks.label', default: 'Assessment Marks'))],-1)
printHtmlPart(14)
invokeTag('message','g',31,['code':("studentMarks.assessmentType.label"),'default':("Assessment Type")],-1)
printHtmlPart(15)
invokeTag('message','g',33,['code':("studentMarks.courseOffering.label"),'default':("Course Offering")],-1)
printHtmlPart(15)
invokeTag('message','g',35,['code':("studentMarks.student.label"),'default':("Student")],-1)
printHtmlPart(16)
loop:{
int i = 0
for( studentMarksInstance in (studentMarksInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: studentMarksInstance, field: "actualMarks"))
})
invokeTag('link','g',43,['action':("show"),'id':(studentMarksInstance.id)],3)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: studentMarksInstance, field: "assessmentMarks"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: studentMarksInstance, field: "assessmentType"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: studentMarksInstance, field: "courseOffering"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: studentMarksInstance, field: "student"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',58,['total':(studentMarksInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(23)
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
