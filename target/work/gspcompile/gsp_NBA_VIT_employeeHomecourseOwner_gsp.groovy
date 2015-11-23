import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employeeHomecourseOwner_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHome/courseOwner.gsp" }
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
expressionOut.print(resource(dir: 'images', file: 'add_PO-PEO-GA.png'))
printHtmlPart(6)
})
invokeTag('link','g',10,['controller':("EmployeeHome"),'action':("createCo"),'<a href':("#")],2)
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'mapping.png'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'addMap.png'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'images', file: 'course.png'))
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'report.png'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'top.png'))
printHtmlPart(12)
expressionOut.print(session.courses)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',32,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445009363838L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
