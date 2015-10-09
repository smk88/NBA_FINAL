import nba_vit.CourseOffering
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_courseOfferingindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/courseOffering/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'courseOffering.label', default: 'CourseOffering'))],-1)
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
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("acadamicYear"),'title':(message(code: 'courseOffering.acadamicYear.label', default: 'Acadamic Year'))],-1)
printHtmlPart(13)
invokeTag('message','g',29,['code':("courseOffering.course.label"),'default':("Course")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("module"),'title':(message(code: 'courseOffering.module.label', default: 'Module'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',33,['property':("semester"),'title':(message(code: 'courseOffering.semester.label', default: 'Semester'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',35,['property':("year"),'title':(message(code: 'courseOffering.year.label', default: 'Year'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( courseOfferingInstance in (courseOfferingInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: courseOfferingInstance, field: "acadamicYear"))
})
invokeTag('link','g',43,['action':("show"),'id':(courseOfferingInstance.id)],3)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: courseOfferingInstance, field: "course"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: courseOfferingInstance, field: "module"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: courseOfferingInstance, field: "semester"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: courseOfferingInstance, field: "year"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',58,['total':(courseOfferingInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442294238000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
