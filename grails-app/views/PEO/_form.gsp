<%@ page import="nba_vit.PEO" %>



<div class="fieldcontain ${hasErrors(bean: PEOInstance, field: 'peo_statement', 'error')} ">
	<label for="peo_statement">
		<g:message code="PEO.peo_statement.label" default="Peostatement" />
		
	</label>
	<g:textField name="peo_statement" value="${PEOInstance?.peo_statement}"/>
</div>

