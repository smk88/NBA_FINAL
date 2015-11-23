
<%@ page import="nba_vit.AssessmentType" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'assessmentType.label', default: 'AssessmentType')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-assessmentType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-assessmentType" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list assessmentType">
			
				<g:if test="${assessmentTypeInstance?.assessment_type}">
				<li class="fieldcontain">
					<span id="assessment_type-label" class="property-label"><g:message code="assessmentType.assessment_type.label" default="Assessmenttype" /></span>
					
						<span class="property-value" aria-labelledby="assessment_type-label"><g:fieldValue bean="${assessmentTypeInstance}" field="assessment_type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${assessmentTypeInstance?.converted_marks}">
				<li class="fieldcontain">
					<span id="converted_marks-label" class="property-label"><g:message code="assessmentType.converted_marks.label" default="Convertedmarks" /></span>
					
						<span class="property-value" aria-labelledby="converted_marks-label"><g:fieldValue bean="${assessmentTypeInstance}" field="converted_marks"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${assessmentTypeInstance?.course_type}">
				<li class="fieldcontain">
					<span id="course_type-label" class="property-label"><g:message code="assessmentType.course_type.label" default="Coursetype" /></span>
					
						<span class="property-value" aria-labelledby="course_type-label"><g:link controller="courseType" action="show" id="${assessmentTypeInstance?.course_type?.id}">${assessmentTypeInstance?.course_type?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${assessmentTypeInstance?.evaluated_marks}">
				<li class="fieldcontain">
					<span id="evaluated_marks-label" class="property-label"><g:message code="assessmentType.evaluated_marks.label" default="Evaluatedmarks" /></span>
					
						<span class="property-value" aria-labelledby="evaluated_marks-label"><g:fieldValue bean="${assessmentTypeInstance}" field="evaluated_marks"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${assessmentTypeInstance?.evaluation_type}">
				<li class="fieldcontain">
					<span id="evaluation_type-label" class="property-label"><g:message code="assessmentType.evaluation_type.label" default="Evaluationtype" /></span>
					
						<span class="property-value" aria-labelledby="evaluation_type-label"><g:fieldValue bean="${assessmentTypeInstance}" field="evaluation_type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:assessmentTypeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${assessmentTypeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
