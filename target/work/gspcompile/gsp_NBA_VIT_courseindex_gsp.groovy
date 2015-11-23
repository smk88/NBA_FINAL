import nba_vit.Course
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_courseindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'course.label', default: 'Course'))],-1)
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
invokeTag('sortableColumn','g',27,['property':("course_code"),'title':(message(code: 'course.course_code.label', default: 'Coursecode'))],-1)
printHtmlPart(13)
invokeTag('message','g',29,['code':("course.associated_course.label"),'default':("Associatedcourse")],-1)
printHtmlPart(14)
invokeTag('message','g',31,['code':("course.courseCategory.label"),'default':("Course Category")],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',33,['property':("course_credit"),'title':(message(code: 'course.course_credit.label', default: 'Coursecredit'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',35,['property':("course_name"),'title':(message(code: 'course.course_name.label', default: 'Coursename'))],-1)
printHtmlPart(13)
invokeTag('message','g',37,['code':("course.course_type.label"),'default':("Coursetype")],-1)
printHtmlPart(17)
loop:{
int i = 0
for( courseInstance in (courseInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: courseInstance, field: "course_code"))
})
invokeTag('link','g',45,['action':("show"),'id':(courseInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: courseInstance, field: "associated_course"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: courseInstance, field: "courseCategory"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: courseInstance, field: "course_credit"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: courseInstance, field: "course_name"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: courseInstance, field: "course_type"))
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('paginate','g',62,['total':(courseInstanceCount ?: 0)],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444991472802L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
