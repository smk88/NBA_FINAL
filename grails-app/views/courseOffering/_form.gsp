<%@ page import="nba_vit.CourseOffering" %>



<div class="fieldcontain ${hasErrors(bean: courseOfferingInstance, field: 'acadamic_year', 'error')} ">
	<label for="acadamic_year">
		<g:message code="courseOffering.acadamic_year.label" default="Acadamicyear" />
		
	</label>
	<g:textField name="acadamic_year" value="${courseOfferingInstance?.acadamic_year}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOfferingInstance, field: 'course', 'error')} required">
	<label for="course">
		<g:message code="courseOffering.course.label" default="Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course" name="course.id" from="${nba_vit.Course.list()}" optionKey="id" required="" value="${courseOfferingInstance?.course?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOfferingInstance, field: 'module', 'error')} ">
	<label for="module">
		<g:message code="courseOffering.module.label" default="Module" />
		
	</label>
	<g:textField name="module" value="${courseOfferingInstance?.module}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOfferingInstance, field: 'semester', 'error')} ">
	<label for="semester">
		<g:message code="courseOffering.semester.label" default="Semester" />
		
	</label>
	<g:textField name="semester" value="${courseOfferingInstance?.semester}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOfferingInstance, field: 'year', 'error')} ">
	<label for="year">
		<g:message code="courseOffering.year.label" default="Year" />
		
	</label>
	<g:textField name="year" value="${courseOfferingInstance?.year}"/>
</div>

