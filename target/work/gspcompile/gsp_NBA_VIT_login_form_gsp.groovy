import nba_vit.Login
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_login_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: loginInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("login.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'value':(loginInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: loginInstance, field: 'pwd', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("login.pwd.label"),'default':("Pwd")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['type':("password"),'name':("pwd"),'value':(loginInstance?.pwd)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: loginInstance, field: 'usertype', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("login.usertype.label"),'default':("Usertype")],-1)
printHtmlPart(6)
invokeTag('select','g',26,['id':("usertype"),'name':("usertype.id"),'from':(nba_vit.UserType.list()),'optionKey':("id"),'required':(""),'value':(loginInstance?.usertype?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1441793230000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
