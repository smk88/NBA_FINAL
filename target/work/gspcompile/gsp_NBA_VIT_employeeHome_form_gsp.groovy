import nba_vit.GA
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employeeHome_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHome/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: GAInstance, field: 'gaStatement', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("GA.gaStatement.label"),'default':("Ga Statement")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("gaStatement"),'value':(GAInstance?.gaStatement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: GAInstance, field: 'gaCode', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("GA.gaCode.label"),'default':("Ga Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("gaCode"),'value':(GAInstance?.gaCode)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443173612000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
