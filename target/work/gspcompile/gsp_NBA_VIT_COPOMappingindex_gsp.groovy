import nba_vit.COPOMapping
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMappingindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'COPOMapping.label', default: 'COPOMapping'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(cos)
printHtmlPart(5)
expressionOut.print(pos)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(6)
loop:{
int i = 0
for( v in (pos) ) {
printHtmlPart(7)
expressionOut.print(pos[i])
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
loop:{
int j = 0
for( v1 in (cos) ) {
printHtmlPart(10)
expressionOut.print(j)
printHtmlPart(11)
expressionOut.print(cos[j])
printHtmlPart(12)
loop:{
int k = 0
for( v in (pos) ) {
printHtmlPart(13)
k++
}
}
printHtmlPart(14)
j++
}
}
printHtmlPart(15)
invokeTag('submitButton','g',29,['name':("Save"),'value':("Save")],-1)
printHtmlPart(16)
invokeTag('hiddenField','g',30,['name':("cos"),'value':(cos)],-1)
printHtmlPart(17)
invokeTag('hiddenField','g',31,['name':("pos"),'value':(pos)],-1)
printHtmlPart(18)
})
invokeTag('form','g',32,['role':("form"),'url':([action:'saveCOPO'])],2)
printHtmlPart(19)
invokeTag('message','g',38,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(20)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(21)
invokeTag('message','g',41,['code':("default.home.label")],-1)
printHtmlPart(22)
createTagBody(2, {->
invokeTag('message','g',42,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',42,['class':("create"),'action':("create")],2)
printHtmlPart(23)
invokeTag('message','g',46,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(24)
if(true && (flash.message)) {
printHtmlPart(25)
expressionOut.print(flash.message)
printHtmlPart(26)
}
printHtmlPart(27)
invokeTag('message','g',54,['code':("COPOMapping.co.label"),'default':("Co")],-1)
printHtmlPart(28)
invokeTag('message','g',56,['code':("COPOMapping.po.label"),'default':("Po")],-1)
printHtmlPart(29)
invokeTag('sortableColumn','g',58,['property':("value"),'title':(message(code: 'COPOMapping.value.label', default: 'Value'))],-1)
printHtmlPart(30)
loop:{
int i = 0
for( COPOMappingInstance in (COPOMappingInstanceList) ) {
printHtmlPart(31)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(32)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: COPOMappingInstance, field: "co"))
})
invokeTag('link','g',66,['action':("show"),'id':(COPOMappingInstance.id)],3)
printHtmlPart(33)
expressionOut.print(fieldValue(bean: COPOMappingInstance, field: "po"))
printHtmlPart(33)
expressionOut.print(fieldValue(bean: COPOMappingInstance, field: "value"))
printHtmlPart(34)
i++
}
}
printHtmlPart(35)
invokeTag('paginate','g',77,['total':(COPOMappingInstanceCount ?: 0)],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',80,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445022033975L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
