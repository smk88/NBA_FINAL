<%@ page import="nba_vit.CourseOutcome" %>



<div class="fieldcontain ${hasErrors(bean: courseOutcomeInstance, field: 'acadamic_year', 'error')} ">
	<label for="acadamic_year">
		<g:message code="courseOutcome.acadamic_year.label" default="acadamicyear" />
		
	</label>
	<g:textField name="acadamic_year" value="${session.academic_year}" readonly="readonly"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOutcomeInstance, field: 'co_code', 'error')} ">
	<label for="co_code">
		<g:message code="courseOutcome.co_code.label" default="Cocode" />
		
	</label>
	<g:textField name="co_code" value="${courseOutcomeInstance?.co_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOutcomeInstance, field: 'co_statement', 'error')} ">
	<label for="co_statement">
		<g:message code="courseOutcome.co_statement.label" default="Costatement" />
		
	</label>
	<g:textField name="co_statement" value="${courseOutcomeInstance?.co_statement}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseOutcomeInstance, field: 'course', 'error')} required">
	<label for="course">
		<g:message code="courseOutcome.course.label" default="Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course" name="course.id" from="${session.course}" optionKey="id" required="" value="${courseOutcomeInstance?.course?.id}" class="many-to-one"/>
</div>

