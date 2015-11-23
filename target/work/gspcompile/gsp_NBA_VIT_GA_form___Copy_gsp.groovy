import nba_vit.GA
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_GA_form___Copy_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/GA/_form - Copy.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: GAInstance, field: 'ga_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("GA.ga_code.label"),'default':("Gacode")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("ga_code"),'value':(GAInstance?.ga_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: GAInstance, field: 'ga_statement', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("GA.ga_statement.label"),'default':("Gastatement")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("ga_statement"),'value':(GAInstance?.ga_statement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: GAInstance, field: 'program', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("GA.program.label"),'default':("Program")],-1)
printHtmlPart(6)
invokeTag('select','g',26,['id':("program"),'name':("program.id"),'from':(nba_vit.Program.list()),'optionKey':("id"),'required':(""),'value':(GAInstance?.program?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443185536000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
