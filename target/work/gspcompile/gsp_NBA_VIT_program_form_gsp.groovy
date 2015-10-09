import nba_vit.Program
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_program_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/program/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: programInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("program.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(programInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: programInstance, field: 'department', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("program.department.label"),'default':("Department")],-1)
printHtmlPart(5)
invokeTag('select','g',18,['id':("department"),'name':("department.id"),'from':(nba_vit.Department.list()),'optionKey':("id"),'required':(""),'value':(programInstance?.department?.id),'class':("many-to-one")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1441793230000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
