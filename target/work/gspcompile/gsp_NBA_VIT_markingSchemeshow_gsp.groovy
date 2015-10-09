import nba_vit.MarkingScheme
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_markingSchemeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/markingScheme/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'markingScheme.label', default: 'MarkingScheme'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (markingSchemeInstance?.courseType)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("markingScheme.courseType.label"),'default':("Course Type")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(markingSchemeInstance?.courseType?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("courseType"),'action':("show"),'id':(markingSchemeInstance?.courseType?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.endSEmesterExam)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("markingScheme.endSEmesterExam.label"),'default':("End SE mester Exam")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(markingSchemeInstance),'field':("endSEmesterExam")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.homeworkAssignment)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("markingScheme.homeworkAssignment.label"),'default':("Homework Assignment")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(markingSchemeInstance),'field':("homeworkAssignment")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.laboratry)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("markingScheme.laboratry.label"),'default':("Laboratry")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(markingSchemeInstance),'field':("laboratry")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.reviewFile)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("markingScheme.reviewFile.label"),'default':("Review File")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(markingSchemeInstance),'field':("reviewFile")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.reviewFour)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("markingScheme.reviewFour.label"),'default':("Review Four")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(markingSchemeInstance),'field':("reviewFour")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.reviewOne)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("markingScheme.reviewOne.label"),'default':("Review One")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(markingSchemeInstance),'field':("reviewOne")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.reviewThree)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("markingScheme.reviewThree.label"),'default':("Review Three")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(markingSchemeInstance),'field':("reviewThree")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.reviewTwo)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("markingScheme.reviewTwo.label"),'default':("Review Two")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(markingSchemeInstance),'field':("reviewTwo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.test1)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("markingScheme.test1.label"),'default':("Test1")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(markingSchemeInstance),'field':("test1")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.test2)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("markingScheme.test2.label"),'default':("Test2")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(markingSchemeInstance),'field':("test2")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (markingSchemeInstance?.tutorial)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("markingScheme.tutorial.label"),'default':("Tutorial")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(markingSchemeInstance),'field':("tutorial")],-1)
printHtmlPart(16)
}
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
createTagBody(3, {->
invokeTag('message','g',137,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',137,['class':("edit"),'action':("edit"),'resource':(markingSchemeInstance)],3)
printHtmlPart(42)
invokeTag('actionSubmit','g',138,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',140,['url':([resource:markingSchemeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(44)
})
invokeTag('captureBody','sitemesh',142,[:],1)
printHtmlPart(45)
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
