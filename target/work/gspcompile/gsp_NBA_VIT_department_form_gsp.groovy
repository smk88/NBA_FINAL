import nba_vit.Department
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_department_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/department/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("department.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(departmentInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'institute', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("department.institute.label"),'default':("Institute")],-1)
printHtmlPart(5)
invokeTag('select','g',18,['id':("institute"),'name':("institute.id"),'from':(nba_vit.Institute.list()),'optionKey':("id"),'required':(""),'value':(departmentInstance?.institute?.id),'class':("many-to-one")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1441793226000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
