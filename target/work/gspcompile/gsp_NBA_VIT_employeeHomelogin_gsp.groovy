import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employeeHomelogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHome/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.min.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'js', file: 'jquery.min.js'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'js', file: 'bootstrap.min.js'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'global.css'))
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',29,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'vit_logo.png'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('button','g',77,['name':("submit"),'value':("call me"),'onclick':("callMe()")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',1,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444752253426L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
