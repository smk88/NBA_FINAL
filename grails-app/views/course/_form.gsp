<%@ page import="nba_vit.Course" %>



<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_code', 'error')} ">
	<label for="course_code">
		<g:message code="course.course_code.label" default="Coursecode" />
		
	</label>
	<g:textField name="course_code" value="${courseInstance?.course_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_name', 'error')} ">
	<label for="course_name">
		<g:message code="course.course_name.label" default="Coursename" />
		
	</label>
	<g:textField name="course_name" value="${courseInstance?.course_name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'coursetype', 'error')} required">
	<label for="coursetype">
		<g:message code="course.coursetype.label" default="Coursetype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="coursetype" name="coursetype.id" from="${nba_vit.CourseType.list()}" optionKey="id" required="" value="${courseInstance?.coursetype?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'credit', 'error')} required">
	<label for="credit">
		<g:message code="course.credit.label" default="Credit" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="credit" type="number" value="${courseInstance.credit}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="course.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${nba_vit.Employee.list()}" optionKey="id" required="" value="${courseInstance?.employee?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'module', 'error')} required">
	<label for="module">
		<g:message code="course.module.label" default="Module" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="module" type="number" value="${courseInstance.module}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'semester', 'error')} required">
	<label for="semester">
		<g:message code="course.semester.label" default="Semester" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="semester" type="number" value="${courseInstance.semester}" required=""/>
</div>

