<%@ page import="nba_vit.Course" %>



<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'courseCategory', 'error')} required">
	<label for="courseCategory">
		<g:message code="course.courseCategory.label" default="Course Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="courseCategory" name="courseCategory.id" from="${nba_vit.CourseCategory.list()}" optionKey="id" required="" value="${courseInstance?.courseCategory?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_code', 'error')} ">
	<label for="course_code">
		<g:message code="course.course_code.label" default="Coursecode" />
		
	</label>
	<g:textField name="course_code" value="${courseInstance?.course_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_credit', 'error')} required">
	<label for="course_credit">
		<g:message code="course.course_credit.label" default="Coursecredit" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="course_credit" type="number" value="${courseInstance.course_credit}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_name', 'error')} ">
	<label for="course_name">
		<g:message code="course.course_name.label" default="Coursename" />
		
	</label>
	<g:textField name="course_name" value="${courseInstance?.course_name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'course_type', 'error')} required">
	<label for="course_type">
		<g:message code="course.course_type.label" default="Coursetype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course_type" name="course_type.id" from="${nba_vit.CourseType.list()}" optionKey="id" required="" value="${courseInstance?.course_type?.id}" class="many-to-one"/>
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

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'program', 'error')} required">
	<label for="program">
		<g:message code="course.program.label" default="Program" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${courseInstance?.program?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'semester', 'error')} required">
	<label for="semester">
		<g:message code="course.semester.label" default="Semester" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="semester" type="number" value="${courseInstance.semester}" required=""/>
</div>

