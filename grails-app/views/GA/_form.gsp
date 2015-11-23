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

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'is_current', 'error')} ">
	<label for="is_current">
		<g:message code="GA.is_current.label" default="Iscurrent" />
		
	</label>
	<g:checkBox name="is_current" value="${GAInstance?.is_current}" />
</div>

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'is_lock', 'error')} ">
	<label for="is_lock">
		<g:message code="GA.is_lock.label" default="Islock" />
		
	</label>
	<g:checkBox name="is_lock" value="${GAInstance?.is_lock}" />
</div>

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'program_type', 'error')} required">
	<label for="program_type">
		<g:message code="GA.program_type.label" default="Programtype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program_type" name="program_type.id" from="${nba_vit.ProgramType.list()}" optionKey="id" required="" value="${GAInstance?.program_type?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: GAInstance, field: 'revision_year', 'error')} ">
	<label for="revision_year">
		<g:message code="GA.revision_year.label" default="Revisionyear" />
		
	</label>
	<g:textField name="revision_year" value="${GAInstance?.revision_year}"/>
</div>

