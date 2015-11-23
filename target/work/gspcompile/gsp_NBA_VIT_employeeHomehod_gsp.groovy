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
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("nbalayout")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'assign_coordinator.png'))
printHtmlPart(6)
})
invokeTag('link','g',9,['controller':("EmployeeHome"),'action':("assignCoordinator"),'<a href':("#")],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'add_PO-PEO-GA.png'))
printHtmlPart(9)
})
invokeTag('link','g',10,['controller':("EmployeeHome"),'action':("create")],2)
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'top.png'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'images', file: 'student.png'))
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'attain.png'))
printHtmlPart(15)
})
invokeTag('link','g',15,['controller':("EmployeeHome"),'action':("drawGraph"),'<a href':("#")],2)
printHtmlPart(16)
expressionOut.print(session.user)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',28,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444385658000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
