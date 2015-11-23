import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMappingCOPOMap_viewEdit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/COPOMap_viewEdit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',2,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("nbalayout")],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(progname)
printHtmlPart(3)
expressionOut.print(crsname)
printHtmlPart(4)
loop:{
int i = 0
for( p in (pos) ) {
printHtmlPart(5)
expressionOut.print(postt[i])
printHtmlPart(6)
expressionOut.print(p)
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
loop:{
int i = 0
for( c in (cos) ) {
printHtmlPart(9)
expressionOut.print(costt[i])
printHtmlPart(10)
expressionOut.print(c)
printHtmlPart(11)
loop:{
int ii = 0
for( p in (pos) ) {
printHtmlPart(12)
expressionOut.print(listOfLists[i][ii])
printHtmlPart(13)
ii++
}
}
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('submitButton','g',32,['name':("Edit"),'value':("Edit CO-PO Map "),'<a class':("btn btn-info btn-md center-block")],2)
printHtmlPart(17)
})
invokeTag('form','g',33,['class':("form-horizontal text-justify"),'role':("form"),'url':([action:'ViewEditCoPo',controller:'COPOMapping'])],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1446809077978L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
