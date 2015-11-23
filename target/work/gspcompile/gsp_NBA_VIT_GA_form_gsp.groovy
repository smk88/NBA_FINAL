import nba_vit.GA
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_GA_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/GA/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: GAInstance, field: 'ga_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("GA.ga_code.label"),'default':("Gratuate Attribute(GA) No")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['class':("form-control input-md"),'name':("ga_code"),'value':(GAInstance?.ga_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: GAInstance, field: 'ga_statement', 'error'))
printHtmlPart(4)
invokeTag('message','g',20,['code':("GA.ga_statement.label"),'default':("Gratuate Attribute(GA)Statement")],-1)
printHtmlPart(5)
invokeTag('textField','g',23,['class':("form-control input-md"),'name':("ga_statement"),'value':(GAInstance?.ga_statement)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: GAInstance, field: 'program', 'error'))
printHtmlPart(7)
invokeTag('message','g',29,['code':("GA.program.label"),'default':("Program")],-1)
printHtmlPart(8)
invokeTag('select','g',32,['class':("many-to-one"),'id':("program"),'name':("program.id"),'from':(nba_vit.Program.findByName(session.program)),'optionKey':("id"),'required':(""),'value':(GAInstance?.program_type_id)],-1)
printHtmlPart(9)
createClosureForHtmlPart(10, 1)
invokeTag('submitButton','g',36,['class':("form save btn btn-info btn-md"),'name':("create"),'value':("create")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443530518000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
