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
expressionOut.print(hasErrors(bean: POInstance, field: 'po_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("PO.po_code.label"),'default':("Po Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("po_code"),'value':(count),'readonly':("readonly")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'is_current', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("PO.is_current.label"),'default':("Is Current")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',18,['name':("is_current"),'value':(POInstance?.is_current)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'is_lock', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("PO.is_lock.label"),'default':("Islock")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',26,['name':("is_lock"),'value':(POInstance?.is_lock)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'po_statement', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("PO.po_statement.label"),'default':("Postatement")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("po_statement"),'value':(POInstance?.po_statement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'program', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("PO.program.label"),'default':("Program")],-1)
printHtmlPart(8)
invokeTag('select','g',42,['id':("program"),'name':("program.id"),'from':(nba_vit.Program.list()),'optionKey':("id"),'required':(""),'value':(POInstance?.program?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: POInstance, field: 'revision_year', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("PO.revision_year.label"),'default':("Revisionyear")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("revision_year"),'value':(academic_year),'readonly':("readonly")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444405346859L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
