import nba_vit.Employee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_employee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employee/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employee_code', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employee.employee_code.label"),'default':("Employeecode")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("employee_code"),'required':(""),'value':(employeeInstance?.employee_code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'email', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['type':("email"),'name':("email"),'value':(employeeInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'designation', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("employee.designation.label"),'default':("Designation")],-1)
printHtmlPart(2)
invokeTag('select','g',26,['id':("designation"),'name':("designation.id"),'from':(nba_vit.Designation.list()),'optionKey':("id"),'required':(""),'value':(employeeInstance?.designation?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'mob', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("employee.mob.label"),'default':("Mob")],-1)
printHtmlPart(5)
invokeTag('textField','g',34,['name':("mob"),'value':(employeeInstance?.mob)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'name', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("employee.name.label"),'default':("Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',42,['name':("name"),'value':(employeeInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'program', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("employee.program.label"),'default':("Program")],-1)
printHtmlPart(2)
invokeTag('select','g',50,['id':("program"),'name':("program.id"),'from':(nba_vit.Program.list()),'optionKey':("id"),'required':(""),'value':(employeeInstance?.program?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'roles', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("employee.roles.label"),'default':("Roles")],-1)
printHtmlPart(5)
invokeTag('select','g',58,['name':("roles"),'from':(nba_vit.Role.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(employeeInstance?.roles*.id),'class':("many-to-many")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443083428709L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
