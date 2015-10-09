import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employeeHomehod_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHome/hod.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'global.css'))
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(resource(dir: 'images', file: 'vit_logo.png'))
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'assign_coordinator.png'))
printHtmlPart(9)
})
invokeTag('link','g',20,['controller':("EmployeeHome"),'action':("getCourses"),'<a href':("#")],2)
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'add_PO-PEO-GA.png'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'images', file: 'top.png'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'images', file: 'student.png'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'attain.png'))
printHtmlPart(15)
expressionOut.print(emp.name)
printHtmlPart(16)
expressionOut.print(emp.email)
printHtmlPart(16)
expressionOut.print(emp.program)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443085483710L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
