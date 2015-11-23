import nba_vit.Course
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_courseshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (courseInstance?.course_code)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("course.course_code.label"),'default':("Coursecode")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(courseInstance),'field':("course_code")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.associated_course)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("course.associated_course.label"),'default':("Associatedcourse")],-1)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(courseInstance?.associated_course?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("course"),'action':("show"),'id':(courseInstance?.associated_course?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.courseCategory)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("course.courseCategory.label"),'default':("Course Category")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(courseInstance?.courseCategory?.encodeAsHTML())
})
invokeTag('link','g',48,['controller':("courseCategory"),'action':("show"),'id':(courseInstance?.courseCategory?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.course_credit)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("course.course_credit.label"),'default':("Coursecredit")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(courseInstance),'field':("course_credit")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.course_name)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("course.course_name.label"),'default':("Coursename")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(courseInstance),'field':("course_name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.course_type)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("course.course_type.label"),'default':("Coursetype")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(courseInstance?.course_type?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("courseType"),'action':("show"),'id':(courseInstance?.course_type?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.employee)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("course.employee.label"),'default':("Employee")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(courseInstance?.employee?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("employee"),'action':("show"),'id':(courseInstance?.employee?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (courseInstance?.program)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("course.program.label"),'default':("Program")],-1)
printHtmlPart(31)
for( p in (courseInstance.program) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',94,['controller':("program"),'action':("show"),'id':(p.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (courseInstance?.year)) {
printHtmlPart(35)
invokeTag('message','g',102,['code':("course.year.label"),'default':("Year")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',104,['bean':(courseInstance),'field':("year")],-1)
printHtmlPart(16)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',112,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',112,['class':("edit"),'action':("edit"),'resource':(courseInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',113,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',115,['url':([resource:courseInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444991472896L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
