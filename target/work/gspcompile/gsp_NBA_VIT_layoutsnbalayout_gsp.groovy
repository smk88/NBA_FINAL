import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_layoutsnbalayout_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/nbalayout.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.min.css'))
printHtmlPart(2)
expressionOut.print(resource(dir: 'js', file: 'jquery.min.js'))
printHtmlPart(2)
expressionOut.print(resource(dir: 'js', file: 'bootstrap.min.js'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'global.css'))
printHtmlPart(4)
invokeTag('layoutHead','g',87,[:],-1)
printHtmlPart(5)
invokeTag('layoutResources','r',88,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',89,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'vit_logo.png'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'images', file: 'user168.png'))
printHtmlPart(10)
expressionOut.print(session.user)
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'key.png'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'images', file: 'logout.png'))
printHtmlPart(13)
invokeTag('layoutBody','g',129,[:],-1)
printHtmlPart(14)
invokeTag('javascript','g',131,['library':("application")],-1)
printHtmlPart(15)
invokeTag('layoutResources','r',132,[:],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',140,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444394043074L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
