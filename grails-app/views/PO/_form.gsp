<%@ page import="nba_vit.PO" %>



<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_code', 'error')} ">
	<label for="po_code">
		<g:message code="PO.po_code.label" default="Pocode" />
		
	</label>
	<g:textField name="po_code" value="${count}" disabled="true"/> <!--value="${POInstance?.po_code}"-->
</div>

<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_statement', 'error')} ">
	<label for="po_statement">
		<g:message code="PO.po_statement.label" default="Postatement" />
		
	</label>
	<g:textField name="po_statement" value="${POInstance?.po_statement}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'program', 'error')} required">
	<label for="program">
		<g:message code="PO.program.label" default="Program" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program" name="program.id" from="${session.program}" optionKey="id" required="" value="${POInstance?.program?.id}" class="many-to-one"/>
</div>

