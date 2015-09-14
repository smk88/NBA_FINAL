<%@ page import="nba_vit.GA" %>



<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'ga_statement', 'error')} ">
	<label for="ga_statement">
		<g:message code="GA.ga_statement.label" default="Gastatement" />
		
	</label>
	<g:textField name="ga_statement" value="${GAInstance?.ga_statement}"/>
</div>

