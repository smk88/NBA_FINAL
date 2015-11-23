import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employeeHomeresetpassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHome/resetpassword.gsp" }
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
})
invokeTag('captureHead','sitemesh',87,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(resource(dir: 'images', file: 'vit_logo.png'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'user168.png'))
printHtmlPart(8)
expressionOut.print(session.user)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('textField','g',122,['name':("newpwd"),'value':("")],-1)
printHtmlPart(11)
invokeTag('textField','g',124,['name':("confpwd"),'value':("")],-1)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('submitButton','g',127,['name':("Change"),'<a class':("btn btn-info btn-md")],3)
printHtmlPart(14)
})
invokeTag('form','g',128,['class':("form-horizontal text-justify"),'role':("form"),'url':([action:'resetpassword',controller:'Login'])],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',138,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444379990296L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
