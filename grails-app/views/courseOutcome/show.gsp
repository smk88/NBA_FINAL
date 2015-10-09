
<%@ page import="nba_vit.CourseOutcome" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'courseOutcome.label', default: 'CourseOutcome')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-courseOutcome" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-courseOutcome" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list courseOutcome">
			
				<g:if test="${courseOutcomeInstance?.acadamic_year}">
				<li class="fieldcontain">
					<span id="acadamic_year-label" class="property-label"><g:message code="courseOutcome.acadamic_year.label" default="Acadamicyear" /></span>
					
						<span class="property-value" aria-labelledby="acadamic_year-label"><g:fieldValue bean="${courseOutcomeInstance}" field="acadamic_year"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseOutcomeInstance?.co_code}">
				<li class="fieldcontain">
					<span id="co_code-label" class="property-label"><g:message code="courseOutcome.co_code.label" default="Cocode" /></span>
					
						<span class="property-value" aria-labelledby="co_code-label"><g:fieldValue bean="${courseOutcomeInstance}" field="co_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseOutcomeInstance?.co_statement}">
				<li class="fieldcontain">
					<span id="co_statement-label" class="property-label"><g:message code="courseOutcome.co_statement.label" default="Costatement" /></span>
					
						<span class="property-value" aria-labelledby="co_statement-label"><g:fieldValue bean="${courseOutcomeInstance}" field="co_statement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseOutcomeInstance?.course}">
				<li class="fieldcontain">
					<span id="course-label" class="property-label"><g:message code="courseOutcome.course.label" default="Course" /></span>
					
						<span class="property-value" aria-labelledby="course-label"><g:link controller="course" action="show" id="${courseOutcomeInstance?.course?.id}">${courseOutcomeInstance?.course?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:courseOutcomeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${courseOutcomeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
