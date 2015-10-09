import nba_vit.PO
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_PO_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/PO/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: POInstance, field: 'poStatement', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("PO.poStatement.label"),'default':("Po Statement")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("poStatement"),'value':(POInstance?.poStatement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'poCode', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("PO.poCode.label"),'default':("Po Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("poCode"),'value':(POInstance?.poCode)],-1)
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
