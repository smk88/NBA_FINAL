import nba_vit.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_student_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentInstance, field: 'grNumber', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("student.grNumber.label"),'default':("Gr Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("grNumber"),'value':(studentInstance?.grNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'name', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("student.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("name"),'value':(studentInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("student.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',26,['type':("email"),'name':("email"),'value':(studentInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'mobileNumber', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("student.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("mobileNumber"),'value':(studentInstance?.mobileNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'currentYear', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("student.currentYear.label"),'default':("Current Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("currentYear"),'value':(studentInstance?.currentYear)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'academicYear', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("student.academicYear.label"),'default':("Academic Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("academicYear"),'value':(studentInstance?.academicYear)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'fyRollNo', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("student.fyRollNo.label"),'default':("Fy Roll No")],-1)
printHtmlPart(10)
invokeTag('field','g',58,['name':("fyRollNo"),'type':("number"),'value':(studentInstance.fyRollNo),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'syRollNo', 'error'))
printHtmlPart(11)
invokeTag('message','g',63,['code':("student.syRollNo.label"),'default':("Sy Roll No")],-1)
printHtmlPart(10)
invokeTag('field','g',66,['name':("syRollNo"),'type':("number"),'value':(studentInstance.syRollNo),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'tyRollNo', 'error'))
printHtmlPart(12)
invokeTag('message','g',71,['code':("student.tyRollNo.label"),'default':("Ty Roll No")],-1)
printHtmlPart(10)
invokeTag('field','g',74,['name':("tyRollNo"),'type':("number"),'value':(studentInstance.tyRollNo),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'btechRollNo', 'error'))
printHtmlPart(13)
invokeTag('message','g',79,['code':("student.btechRollNo.label"),'default':("Btech Roll No")],-1)
printHtmlPart(10)
invokeTag('field','g',82,['name':("btechRollNo"),'type':("number"),'value':(studentInstance.btechRollNo),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'fyDivision', 'error'))
printHtmlPart(14)
invokeTag('message','g',87,['code':("student.fyDivision.label"),'default':("Fy Division")],-1)
printHtmlPart(2)
invokeTag('textField','g',90,['name':("fyDivision"),'value':(studentInstance?.fyDivision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'syDivision', 'error'))
printHtmlPart(15)
invokeTag('message','g',95,['code':("student.syDivision.label"),'default':("Sy Division")],-1)
printHtmlPart(2)
invokeTag('textField','g',98,['name':("syDivision"),'value':(studentInstance?.syDivision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'tyDivision', 'error'))
printHtmlPart(16)
invokeTag('message','g',103,['code':("student.tyDivision.label"),'default':("Ty Division")],-1)
printHtmlPart(2)
invokeTag('textField','g',106,['name':("tyDivision"),'value':(studentInstance?.tyDivision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'btechDivision', 'error'))
printHtmlPart(17)
invokeTag('message','g',111,['code':("student.btechDivision.label"),'default':("Btech Division")],-1)
printHtmlPart(2)
invokeTag('textField','g',114,['name':("btechDivision"),'value':(studentInstance?.btechDivision)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'graduationStatus', 'error'))
printHtmlPart(18)
invokeTag('message','g',119,['code':("student.graduationStatus.label"),'default':("Graduation Status")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',122,['name':("graduationStatus"),'value':(studentInstance?.graduationStatus)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'department', 'error'))
printHtmlPart(19)
invokeTag('message','g',127,['code':("student.department.label"),'default':("Department")],-1)
printHtmlPart(10)
invokeTag('select','g',130,['id':("department"),'name':("department.id"),'from':(nba_vit.Department.list()),'optionKey':("id"),'required':(""),'value':(studentInstance?.department?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'program', 'error'))
printHtmlPart(20)
invokeTag('message','g',135,['code':("student.program.label"),'default':("Program")],-1)
printHtmlPart(10)
invokeTag('select','g',138,['id':("program"),'name':("program.id"),'from':(nba_vit.Program.list()),'optionKey':("id"),'required':(""),'value':(studentInstance?.program?.id),'class':("many-to-one")],-1)
printHtmlPart(21)
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
