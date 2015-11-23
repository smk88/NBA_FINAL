import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMapping_copomapedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/_copomapedit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
loop:{
int i = 0
for( p in (pos) ) {
printHtmlPart(3)
expressionOut.print(postt[i])
printHtmlPart(4)
expressionOut.print(p)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
loop:{
int i = 0
for( c in (cos) ) {
printHtmlPart(7)
expressionOut.print(costt[i])
printHtmlPart(4)
expressionOut.print(c)
printHtmlPart(8)
loop:{
int ii = 0
for( p in (pos) ) {
printHtmlPart(9)
ii++
}
}
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('submitButton','g',29,['name':("Edit"),'value':("Edit CO-PO Map"),'<a class':("btn btn-info btn-md")],2)
printHtmlPart(13)
})
invokeTag('form','g',30,['class':("form-horizontal text-justify"),'role':("form"),'url':([action:'AddCOPO',controller:'COPOMapping'])],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1446809077900L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
