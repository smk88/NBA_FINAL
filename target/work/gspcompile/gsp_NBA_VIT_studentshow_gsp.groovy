import nba_vit.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_studentshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'student.label', default: 'Student'))],-1)
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
if(true && (studentInstance?.grNumber)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("student.grNumber.label"),'default':("Gr Number")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(studentInstance),'field':("grNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.name)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("student.name.label"),'default':("Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(studentInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.email)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("student.email.label"),'default':("Email")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(studentInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.mobileNumber)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("student.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(studentInstance),'field':("mobileNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.currentYear)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("student.currentYear.label"),'default':("Current Year")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(studentInstance),'field':("currentYear")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.academicYear)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("student.academicYear.label"),'default':("Academic Year")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(studentInstance),'field':("academicYear")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.fyRollNo)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("student.fyRollNo.label"),'default':("Fy Roll No")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(studentInstance),'field':("fyRollNo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.syRollNo)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("student.syRollNo.label"),'default':("Sy Roll No")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(studentInstance),'field':("syRollNo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.tyRollNo)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("student.tyRollNo.label"),'default':("Ty Roll No")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(studentInstance),'field':("tyRollNo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.btechRollNo)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("student.btechRollNo.label"),'default':("Btech Roll No")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(studentInstance),'field':("btechRollNo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.fyDivision)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("student.fyDivision.label"),'default':("Fy Division")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(studentInstance),'field':("fyDivision")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.syDivision)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("student.syDivision.label"),'default':("Sy Division")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(studentInstance),'field':("syDivision")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.tyDivision)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("student.tyDivision.label"),'default':("Ty Division")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(studentInstance),'field':("tyDivision")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.btechDivision)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("student.btechDivision.label"),'default':("Btech Division")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(studentInstance),'field':("btechDivision")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.graduationStatus)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("student.graduationStatus.label"),'default':("Graduation Status")],-1)
printHtmlPart(45)
invokeTag('formatBoolean','g',156,['boolean':(studentInstance?.graduationStatus)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.department)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("student.department.label"),'default':("Department")],-1)
printHtmlPart(47)
createTagBody(3, {->
expressionOut.print(studentInstance?.department?.encodeAsHTML())
})
invokeTag('link','g',165,['controller':("department"),'action':("show"),'id':(studentInstance?.department?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentInstance?.program)) {
printHtmlPart(48)
invokeTag('message','g',172,['code':("student.program.label"),'default':("Program")],-1)
printHtmlPart(49)
createTagBody(3, {->
expressionOut.print(studentInstance?.program?.encodeAsHTML())
})
invokeTag('link','g',174,['controller':("program"),'action':("show"),'id':(studentInstance?.program?.id)],3)
printHtmlPart(16)
}
printHtmlPart(50)
createTagBody(2, {->
printHtmlPart(51)
createTagBody(3, {->
invokeTag('message','g',182,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',182,['class':("edit"),'action':("edit"),'resource':(studentInstance)],3)
printHtmlPart(52)
invokeTag('actionSubmit','g',183,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(53)
})
invokeTag('form','g',185,['url':([resource:studentInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(54)
})
invokeTag('captureBody','sitemesh',187,[:],1)
printHtmlPart(55)
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
