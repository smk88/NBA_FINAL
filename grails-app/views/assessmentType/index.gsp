
<%@ page import="nba_vit.AssessmentType" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'assessmentType.label', default: 'AssessmentType')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-assessmentType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-assessmentType" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="assessment_type" title="${message(code: 'assessmentType.assessment_type.label', default: 'Assessmenttype')}" />
					
						<g:sortableColumn property="converted_marks" title="${message(code: 'assessmentType.converted_marks.label', default: 'Convertedmarks')}" />
					
						<th><g:message code="assessmentType.course_type.label" default="Coursetype" /></th>
					
						<g:sortableColumn property="evaluated_marks" title="${message(code: 'assessmentType.evaluated_marks.label', default: 'Evaluatedmarks')}" />
					
						<g:sortableColumn property="evaluation_type" title="${message(code: 'assessmentType.evaluation_type.label', default: 'Evaluationtype')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${assessmentTypeInstanceList}" status="i" var="assessmentTypeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${assessmentTypeInstance.id}">${fieldValue(bean: assessmentTypeInstance, field: "assessment_type")}</g:link></td>
					
						<td>${fieldValue(bean: assessmentTypeInstance, field: "converted_marks")}</td>
					
						<td>${fieldValue(bean: assessmentTypeInstance, field: "course_type")}</td>
					
						<td>${fieldValue(bean: assessmentTypeInstance, field: "evaluated_marks")}</td>
					
						<td>${fieldValue(bean: assessmentTypeInstance, field: "evaluation_type")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${assessmentTypeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
