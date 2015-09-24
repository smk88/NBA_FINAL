<%@ page import="nba_vit.Designation" %>



<div class="fieldcontain ${hasErrors(bean: designationInstance, field: 'designation', 'error')} ">
	<label for="designation">
		<g:message code="designation.designation.label" default="Designation" />
		
	</label>
	<g:textField name="designation" value="${designationInstance?.designation}"/>
</div>

