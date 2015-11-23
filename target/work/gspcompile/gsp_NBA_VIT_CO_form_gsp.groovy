import nba_vit.CO
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_CO_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/CO/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('javascript','g',5,['library':("jquery")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: COInstance, field: 'co_statement', 'error'))
printHtmlPart(4)
invokeTag('message','g',21,['code':("CO.co_statement.label"),'default':("Costatement")],-1)
printHtmlPart(5)
invokeTag('textField','g',24,['name':("co_statement"),'value':(COInstance?.co_statement)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: COInstance, field: 'course', 'error'))
printHtmlPart(7)
invokeTag('message','g',29,['code':("CO.course.label"),'default':("Course")],-1)
printHtmlPart(8)
invokeTag('select','g',32,['id':("course"),'name':("course.id"),'from':(session.courses),'optionKey':("id"),'required':(""),'value':(COInstance?.course?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'myudpateFunction',params:'\'id=\' + (this.value)', update: 'co_code_div', onComplete="myFun()"))],-1)
printHtmlPart(9)
invokeTag('select','g',33,['id':("course"),'name':("course.id"),'from':(session.courses),'optionKey':("id"),'required':(""),'value':(COInstance?.course?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'myudpateFunction',params:'\'id=\' + (this.value)'))],-1)
printHtmlPart(10)
invokeTag('select','g',34,['id':("course"),'name':("course.id"),'from':(session.courses),'optionKey':("id"),'required':(""),'value':(COInstance?.course?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'myudpateFunction',params:'\'id=\' + (this.value)', update:'co_code_div', onSuccess:'myFun()')),'onComplete':("myFun()")],-1)
printHtmlPart(11)
invokeTag('remoteField','g',35,['controller':("CO"),'action':("myudpateFunction"),'update':("co_code_div")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: COInstance, field: 'co_code', 'error'))
printHtmlPart(13)
invokeTag('message','g',40,['code':("CO.co_code.label"),'default':("Cocode")],-1)
printHtmlPart(14)
invokeTag('textField','g',43,['name':("co_code"),'value':(session.count),'readonly':("readonly")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: COInstance, field: 'is_current', 'error'))
printHtmlPart(16)
invokeTag('message','g',49,['code':("CO.is_current.label"),'default':("Iscurrent")],-1)
printHtmlPart(17)
invokeTag('checkBox','g',52,['name':("is_current"),'value':(COInstance?.is_current),'onclick':("<g:remoteFunction controller="),'CO" action':("myudpateFunction")],-1)
printHtmlPart(18)
invokeTag('remoteFunction','g',53,['controller':("greeting"),'action':("count"),'update':("greetingBox")],-1)
printHtmlPart(19)
expressionOut.print(hasErrors(bean: COInstance, field: 'is_lock', 'error'))
printHtmlPart(20)
invokeTag('message','g',58,['code':("CO.is_lock.label"),'default':("Islock")],-1)
printHtmlPart(5)
invokeTag('checkBox','g',61,['name':("is_lock"),'value':(COInstance?.is_lock)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: COInstance, field: 'revision_year', 'error'))
printHtmlPart(21)
invokeTag('message','g',66,['code':("CO.revision_year.label"),'default':("Revisionyear")],-1)
printHtmlPart(5)
invokeTag('textField','g',69,['name':("revision_year"),'value':(session.academic_year),'readonly':("readonly")],-1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444925082421L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
