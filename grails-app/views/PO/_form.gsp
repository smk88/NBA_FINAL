<%@ page import="nba_vit.PO" %>



<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_code', 'error')} ">
	<label for="po_code">
		<g:message code="PO.po_code.label" default="Pocode" />
		
	</label>
	<g:textField name="po_code" value="${POInstance?.po_code}" readonly="readonly"/>
</div>

<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'is_current', 'error')} ">
	<label for="is_current">
		<g:message code="PO.is_current.label" default="Iscurrent" />
		
	</label>
	<g:checkBox name="is_current" value="${POInstance?.is_current}" />
</div>

<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'is_lock', 'error')} ">
	<label for="is_lock">
		<g:message code="PO.is_lock.label" default="Islock" />
		
	</label>
	<g:checkBox name="is_lock" value="${POInstance?.is_lock}" />
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
	<g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${POInstance?.program?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: POInstance, field: 'revision_year', 'error')} ">
	<label for="revision_year">
		<g:message code="PO.revision_year.label" default="Revisionyear" />
		
	</label>
	<g:textField name="revision_year" value="${POInstance?.revision_year}" readonly="readonly" />
</div>

