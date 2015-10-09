import nba_vit.PEO
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_PEO_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/PEO/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: PEOInstance, field: 'peoStatement', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("PEO.peoStatement.label"),'default':("Peo Statement")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("peoStatement"),'value':(PEOInstance?.peoStatement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: PEOInstance, field: 'peoCode', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("PEO.peoCode.label"),'default':("Peo Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("peoCode"),'value':(PEOInstance?.peoCode)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442294238000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
