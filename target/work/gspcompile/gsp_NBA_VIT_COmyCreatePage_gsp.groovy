import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COmyCreatePage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/CO/myCreatePage.gsp" }
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
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("nbalayout")],-1)
printHtmlPart(4)
invokeTag('javascript','g',13,['library':("jquery")],-1)
printHtmlPart(5)
createTagBody(2, {->
createClosureForHtmlPart(6, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(hasErrors(bean: COInstance, field: 'course', 'error'))
printHtmlPart(9)
invokeTag('message','g',21,['code':("CO.course.label"),'default':("Course")],-1)
printHtmlPart(10)
invokeTag('select','g',24,['id':("course"),'name':("course.id"),'from':(session.courses),'optionKey':("id"),'required':(""),'value':(COInstance?.course?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'myudpateFunction',params:'\'id=\' + (this.value)', update:'co_code_div', onSuccess:'myFun()')),'onComplete':("myFun()")],-1)
printHtmlPart(11)
})
invokeTag('form','g',27,[:],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',28,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444987432142L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
