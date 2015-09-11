<%@ page import="nba_vit.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'grno', 'error')} ">
	<label for="grno">
		<g:message code="student.grno.label" default="Grno" />
		
	</label>
	<g:textField name="grno" value="${studentInstance?.grno}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${studentInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="student.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${studentInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'mob', 'error')} ">
	<label for="mob">
		<g:message code="student.mob.label" default="Mob" />
		
	</label>
	<g:textField name="mob" value="${studentInstance?.mob}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'curr_yr', 'error')} ">
	<label for="curr_yr">
		<g:message code="student.curr_yr.label" default="Curryr" />
		
	</label>
	<g:textField name="curr_yr" value="${studentInstance?.curr_yr}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'academic_yr', 'error')} ">
	<label for="academic_yr">
		<g:message code="student.academic_yr.label" default="Academicyr" />
		
	</label>
	<g:textField name="academic_yr" value="${studentInstance?.academic_yr}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'fy_rn', 'error')} required">
	<label for="fy_rn">
		<g:message code="student.fy_rn.label" default="Fyrn" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="fy_rn" type="number" value="${studentInstance.fy_rn}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'sy_rn', 'error')} required">
	<label for="sy_rn">
		<g:message code="student.sy_rn.label" default="Syrn" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sy_rn" type="number" value="${studentInstance.sy_rn}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'ty_rn', 'error')} required">
	<label for="ty_rn">
		<g:message code="student.ty_rn.label" default="Tyrn" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="ty_rn" type="number" value="${studentInstance.ty_rn}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'btech_rn', 'error')} required">
	<label for="btech_rn">
		<g:message code="student.btech_rn.label" default="Btechrn" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="btech_rn" type="number" value="${studentInstance.btech_rn}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'fy_div', 'error')} ">
	<label for="fy_div">
		<g:message code="student.fy_div.label" default="Fydiv" />
		
	</label>
	<g:textField name="fy_div" value="${studentInstance?.fy_div}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'sy_div', 'error')} ">
	<label for="sy_div">
		<g:message code="student.sy_div.label" default="Sydiv" />
		
	</label>
	<g:textField name="sy_div" value="${studentInstance?.sy_div}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'ty_div', 'error')} ">
	<label for="ty_div">
		<g:message code="student.ty_div.label" default="Tydiv" />
		
	</label>
	<g:textField name="ty_div" value="${studentInstance?.ty_div}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'btech_div', 'error')} ">
	<label for="btech_div">
		<g:message code="student.btech_div.label" default="Btechdiv" />
		
	</label>
	<g:textField name="btech_div" value="${studentInstance?.btech_div}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'grad_status', 'error')} ">
	<label for="grad_status">
		<g:message code="student.grad_status.label" default="Gradstatus" />
		
	</label>
	<g:checkBox name="grad_status" value="${studentInstance?.grad_status}" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="student.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="department" name="department.id" from="${nba_vit.Department.list()}" optionKey="id" required="" value="${studentInstance?.department?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'program', 'error')} required">
	<label for="program">
		<g:message code="student.program.label" default="Program" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${studentInstance?.program?.id}" class="many-to-one"/>
</div>

