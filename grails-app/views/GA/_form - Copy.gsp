<%@ page import="nba_vit.GA" %>



<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'ga_code', 'error')} ">
	<label for="ga_code">
		<g:message code="GA.ga_code.label" default="Gacode" />
		
	</label>
	<g:textField name="ga_code" value="${GAInstance?.ga_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'ga_statement', 'error')} ">
	<label for="ga_statement">
		<g:message code="GA.ga_statement.label" default="Gastatement" />
		
	</label>
	<g:textField name="ga_statement" value="${GAInstance?.ga_statement}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'program', 'error')} required">
	<label for="program">
		<g:message code="GA.program.label" default="Program" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${GAInstance?.program?.id}" class="many-to-one"/>
</div>

