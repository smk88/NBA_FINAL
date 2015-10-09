import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_loginlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/login.gsp" }
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
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'vit_logo.png'))
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('submitButton','g',63,['name':("Login"),'<a class':("btn btn-info btn-md")],3)
printHtmlPart(11)
})
invokeTag('form','g',68,['class':("form-horizontal text-justify"),'role':("form"),'url':([action:'find',controller:'Login'])],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',1,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442826772000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
