<%@ page import="nba_vit.PO" %>



<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_statement', 'error')} ">
	<label for="po_statement">
		<g:message code="PO.po_statement.label" default="Postatement" />
		
	</label>
	<g:textField name="po_statement" value="${POInstance?.po_statement}"/>
</div>

