<%@ page import="nba_vit.AssessmentType" %>



<div class="fieldcontain ${hasErrors(bean: assessmentTypeInstance, field: 'assessment_type', 'error')} ">
	<label for="assessment_type">
		<g:message code="assessmentType.assessment_type.label" default="Assessmenttype" />
		
	</label>
	<g:textField name="assessment_type" value="${assessmentTypeInstance?.assessment_type}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assessmentTypeInstance, field: 'converted_marks', 'error')} required">
	<label for="converted_marks">
		<g:message code="assessmentType.converted_marks.label" default="Convertedmarks" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="converted_marks" value="${fieldValue(bean: assessmentTypeInstance, field: 'converted_marks')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: assessmentTypeInstance, field: 'course_type', 'error')} required">
	<label for="course_type">
		<g:message code="assessmentType.course_type.label" default="Coursetype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course_type" name="course_type.id" from="${nba_vit.CourseType.list()}" optionKey="id" required="" value="${assessmentTypeInstance?.course_type?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assessmentTypeInstance, field: 'evaluated_marks', 'error')} required">
	<label for="evaluated_marks">
		<g:message code="assessmentType.evaluated_marks.label" default="Evaluatedmarks" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="evaluated_marks" value="${fieldValue(bean: assessmentTypeInstance, field: 'evaluated_marks')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: assessmentTypeInstance, field: 'evaluation_type', 'error')} ">
	<label for="evaluation_type">
		<g:message code="assessmentType.evaluation_type.label" default="Evaluationtype" />
		
	</label>
	<g:textField name="evaluation_type" value="${assessmentTypeInstance?.evaluation_type}"/>
</div>

