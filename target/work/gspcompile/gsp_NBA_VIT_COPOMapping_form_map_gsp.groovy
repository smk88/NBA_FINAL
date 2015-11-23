import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMapping_form_map_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/_form_map.gsp" }
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
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(session.cos)
printHtmlPart(6)
expressionOut.print(session.pos)
printHtmlPart(7)
loop:{
int i = 0
for( v in (pos) ) {
printHtmlPart(8)
expressionOut.print(pos[i])
printHtmlPart(9)
i++
}
}
printHtmlPart(10)
loop:{
int j = 0
for( v1 in (cos) ) {
printHtmlPart(11)
expressionOut.print(j)
printHtmlPart(12)
expressionOut.print(cos[j])
printHtmlPart(13)
loop:{
int k = 0
for( v in (pos) ) {
printHtmlPart(14)
k++
}
}
printHtmlPart(15)
j++
}
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445022670216L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
