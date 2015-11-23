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
expressionOut.print(hasErrors(bean: PEOInstance, field: 'peo_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("PEO.peo_code.label"),'default':("Program Education Objective(PEO) No.")],-1)
printHtmlPart(2)
invokeTag('textField','g',12,['class':("form-control input-md"),'name':("peo_code"),'value':(PEOInstance?.peo_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: PEOInstance, field: 'peo_Statement', 'error'))
printHtmlPart(4)
invokeTag('message','g',18,['code':("PEO.peo_Statement.label"),'default':("Program Education Outcome")],-1)
printHtmlPart(5)
invokeTag('textField','g',21,['class':("form-control input-md"),'name':("peo_Statement"),'value':(PEOInstance?.peo_Statement)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: PEOInstance, field: 'program', 'error'))
printHtmlPart(7)
invokeTag('message','g',27,['code':("PEO.program.label"),'default':("Program")],-1)
printHtmlPart(8)
invokeTag('select','g',30,['class':("many-to-one"),'id':("program"),'name':("program.id"),'from':(nba_vit.Program.findByName(session.program)),'optionKey':("id"),'required':(""),'value':(PEOInstance?.program?.id)],-1)
printHtmlPart(9)
createClosureForHtmlPart(10, 1)
invokeTag('submitButton','g',34,['class':("form save btn btn-info btn-md"),'name':("create"),'value':("create")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443191322000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
