<%@ page import="nba_vit.COPOMapping" %>



<div class="fieldcontain ${hasErrors(bean: COPOMappingInstance, field: 'co', 'error')} required">
	<label for="co">
		<g:message code="COPOMapping.co.label" default="Co" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="co" name="co.id" from="${nba_vit.CO.list()}" optionKey="id" required="" value="${COPOMappingInstance?.co?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: COPOMappingInstance, field: 'po', 'error')} required">
	<label for="po">
		<g:message code="COPOMapping.po.label" default="Po" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="po" name="po.id" from="${nba_vit.PO.list()}" optionKey="id" required="" value="${COPOMappingInstance?.po?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: COPOMappingInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="COPOMapping.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="value" type="number" value="${COPOMappingInstance.value}" required=""/>
</div>

