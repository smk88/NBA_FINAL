import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMapping_temp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/_temp.gsp" }
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
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(session)
printHtmlPart(6)
expressionOut.print(session.cos)
printHtmlPart(7)
expressionOut.print(session.pos)
printHtmlPart(8)
loop:{
int i = 0
for( v in (session.pos) ) {
printHtmlPart(9)
expressionOut.print(v)
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
loop:{
int j = 0
for( v1 in (session.cos) ) {
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(13)
expressionOut.print(v1)
printHtmlPart(14)
loop:{
int k = 0
for( v in (session.pos) ) {
printHtmlPart(15)
k++
}
}
printHtmlPart(16)
j++
}
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445092730722L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
