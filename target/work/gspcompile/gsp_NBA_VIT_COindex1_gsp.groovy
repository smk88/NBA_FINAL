import nba_vit.CO
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COindex1_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/CO/index1.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("nbalayout")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'CO.label', default: 'CO'))],-1)
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
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'addMap.png'))
printHtmlPart(6)
})
invokeTag('link','g',19,['controller':("EmployeeHome"),'action':("home"),'<a href':("#")],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'addMap.png'))
printHtmlPart(8)
})
invokeTag('link','g',20,['controller':("EmployeeHome"),'action':("courseOwner"),'<a href':("#")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'add_PO-PEO-GA.png'))
printHtmlPart(10)
})
invokeTag('link','g',22,['controller':("EmployeeHome"),'action':("createCo"),'update':("newContent")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(12)
})
invokeTag('link','g',23,['controller':("EmployeeHome"),'action':("selectCourse"),'<a href':("#")],2)
printHtmlPart(13)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(15)
})
invokeTag('link','g',25,['controller':("CO"),'action':("index")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'addMap.png'))
printHtmlPart(17)
})
invokeTag('link','g',26,['controller':("EmployeeHome"),'action':("coAssesment"),'<a href':("#")],2)
printHtmlPart(18)
expressionOut.print(resource(dir: 'images', file: 'course.png'))
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'report.png'))
printHtmlPart(20)
expressionOut.print(resource(dir: 'images', file: 'top.png'))
printHtmlPart(21)
invokeTag('sortableColumn','g',39,['property':("co_code"),'title':(message(code: 'CO.co_code.label', default: 'Cocode'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',41,['property':("co_statement"),'title':(message(code: 'CO.co_statement.label', default: 'Costatement'))],-1)
printHtmlPart(23)
invokeTag('message','g',43,['code':("CO.course.label"),'default':("Course")],-1)
printHtmlPart(24)
invokeTag('sortableColumn','g',45,['property':("course"),'title':(message(code: 'CO.course.label', default: 'Course'))],-1)
printHtmlPart(25)
invokeTag('sortableColumn','g',46,['property':("is_current"),'title':(message(code: 'CO.is_current.label', default: 'Iscurrent'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',48,['property':("is_lock"),'title':(message(code: 'CO.is_lock.label', default: 'Islock'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',50,['property':("revision_year"),'title':(message(code: 'CO.revision_year.label', default: 'Revisionyear'))],-1)
printHtmlPart(26)
loop:{
int i = 0
for( COInstance in (COInstanceList) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: COInstance, field: "co_code"))
})
invokeTag('link','g',58,['action':("show"),'id':(COInstance.id)],3)
printHtmlPart(29)
expressionOut.print(fieldValue(bean: COInstance, field: "co_statement"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: COInstance, field: "course"))
printHtmlPart(29)
invokeTag('formatBoolean','g',64,['boolean':(COInstance.is_current)],-1)
printHtmlPart(29)
invokeTag('formatBoolean','g',66,['boolean':(COInstance.is_lock)],-1)
printHtmlPart(29)
expressionOut.print(fieldValue(bean: COInstance, field: "revision_year"))
printHtmlPart(30)
i++
}
}
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',106,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1446895639362L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
