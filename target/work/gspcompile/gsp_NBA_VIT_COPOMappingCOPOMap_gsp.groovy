import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMappingCOPOMap_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/COPOMap.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("nbalayout")],-1)
printHtmlPart(2)
invokeTag('javascript','g',13,['library':("jquery")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(hasErrors(bean: COInstance, field: 'course', 'error'))
printHtmlPart(6)
invokeTag('message','g',20,['code':("CO.course.label"),'default':("Course")],-1)
printHtmlPart(7)
invokeTag('select','g',23,['id':("course"),'name':("course.id"),'from':(session.courses),'noSelection':(['':'-Select course-']),'optionKey':("id"),'value':(COInstance?.course?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'setCourse',params:'\'id=\' + (this.value)'))],-1)
printHtmlPart(8)
invokeTag('message','g',25,['code':("CO.course.label"),'default':("Program")],-1)
printHtmlPart(7)
invokeTag('select','g',28,['id':("program"),'name':("program.id"),'from':(session.program),'noSelection':(['':'-Select Program-']),'optionKey':("id"),'required':(""),'value':(ProgramInstance?.program?.id),'class':("many-to-one"),'onchange':(remoteFunction(action:'setProgram',params:'\'id=\' + (this.value)', update:'map_form'))],-1)
printHtmlPart(9)
invokeTag('submitButton','g',34,['name':("save"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(10)
})
invokeTag('form','g',37,['url':([resource:COPOMappingInstance, action:'saveMap'])],2)
printHtmlPart(4)
})
invokeTag('captureBody','sitemesh',38,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445092796446L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
