<%@ page import="nba_vit.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employee_code', 'error')} required">
	<label for="employee_code">
		<g:message code="employee.employee_code.label" default="Employeecode" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employee_code" required="" value="${employeeInstance?.employee_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="employee.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${employeeInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'designation', 'error')} required">
	<label for="designation">
		<g:message code="employee.designation.label" default="Designation" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="designation" name="designation.id" from="${nba_vit.Designation.list()}" optionKey="id" required="" value="${employeeInstance?.designation?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'mob', 'error')} ">
	<label for="mob">
		<g:message code="employee.mob.label" default="Mob" />
		
	</label>
	<g:textField name="mob" value="${employeeInstance?.mob}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${employeeInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'program', 'error')} required">
	<label for="program">
		<g:message code="employee.program.label" default="Program" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${employeeInstance?.program?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="employee.roles.label" default="Roles" />
		
	</label>
	<g:select name="roles" from="${nba_vit.Role.list()}" multiple="multiple" optionKey="id" size="5" value="${employeeInstance?.roles*.id}" class="many-to-many"/>
</div>

