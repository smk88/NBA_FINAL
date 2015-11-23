import nba_vit.COPOMapping
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_NBA_VIT_COPOMapping_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/COPOMapping/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: COPOMappingInstance, field: 'co', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("COPOMapping.co.label"),'default':("Co")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("co"),'name':("co.id"),'from':(nba_vit.CO.list()),'optionKey':("id"),'required':(""),'value':(COPOMappingInstance?.co?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: COPOMappingInstance, field: 'po', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("COPOMapping.po.label"),'default':("Po")],-1)
printHtmlPart(2)
invokeTag('select','g',18,['id':("po"),'name':("po.id"),'from':(nba_vit.PO.list()),'optionKey':("id"),'required':(""),'value':(COPOMappingInstance?.po?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: COPOMappingInstance, field: 'value', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("COPOMapping.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('field','g',26,['name':("value"),'type':("number"),'value':(COPOMappingInstance.value),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1444303517799L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
