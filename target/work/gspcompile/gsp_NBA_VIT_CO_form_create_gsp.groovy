import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_CO_form_create_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/CO/_form_create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(3)
invokeTag('javascript','g',12,['library':("jquery")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',17,['code':("CO.co_code.label"),'default':("Cocode")],-1)
printHtmlPart(6)
invokeTag('textField','g',19,['name':("co_code"),'value':(session.count),'readonly':("readonly")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: COInstance, field: 'co_statement', 'error'))
printHtmlPart(8)
invokeTag('message','g',23,['code':("CO.co_statement.label"),'default':("Costatement")],-1)
printHtmlPart(9)
invokeTag('textField','g',25,['name':("co_statement"),'value':(COInstance?.co_statement)],-1)
printHtmlPart(10)
invokeTag('message','g',29,['code':("CO.is_current.label"),'default':("Iscurrent")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',31,['name':("is_current"),'value':(COInstance?.is_current)],-1)
printHtmlPart(11)
invokeTag('message','g',33,['code':("CO.is_lock.label"),'default':("Islock")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',35,['name':("is_lock"),'value':(COInstance?.is_lock)],-1)
printHtmlPart(12)
invokeTag('message','g',37,['code':("CO.revision_year.label"),'default':("Revisionyear")],-1)
printHtmlPart(13)
invokeTag('textField','g',40,['name':("revision_year"),'value':(session.academic_year),'readonly':("readonly")],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444987420572L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
