
<%@ page import="nba_vit.CO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'CO.label', default: 'CO')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-CO" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-CO" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list CO">
			
				<g:if test="${COInstance?.co_code}">
				<li class="fieldcontain">
					<span id="co_code-label" class="property-label"><g:message code="CO.co_code.label" default="Cocode" /></span>
					
						<span class="property-value" aria-labelledby="co_code-label"><g:fieldValue bean="${COInstance}" field="co_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${COInstance?.co_statement}">
				<li class="fieldcontain">
					<span id="co_statement-label" class="property-label"><g:message code="CO.co_statement.label" default="Costatement" /></span>
					
						<span class="property-value" aria-labelledby="co_statement-label"><g:fieldValue bean="${COInstance}" field="co_statement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${COInstance?.course}">
				<li class="fieldcontain">
					<span id="course-label" class="property-label"><g:message code="CO.course.label" default="Course" /></span>
					
						<span class="property-value" aria-labelledby="course-label"><g:link controller="course" action="show" id="${COInstance?.course?.id}">${COInstance?.course?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${COInstance?.is_current}">
				<li class="fieldcontain">
					<span id="is_current-label" class="property-label"><g:message code="CO.is_current.label" default="Iscurrent" /></span>
					
						<span class="property-value" aria-labelledby="is_current-label"><g:formatBoolean boolean="${COInstance?.is_current}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${COInstance?.is_lock}">
				<li class="fieldcontain">
					<span id="is_lock-label" class="property-label"><g:message code="CO.is_lock.label" default="Islock" /></span>
					
						<span class="property-value" aria-labelledby="is_lock-label"><g:formatBoolean boolean="${COInstance?.is_lock}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${COInstance?.revision_year}">
				<li class="fieldcontain">
					<span id="revision_year-label" class="property-label"><g:message code="CO.revision_year.label" default="Revisionyear" /></span>
					
						<span class="property-value" aria-labelledby="revision_year-label"><g:fieldValue bean="${COInstance}" field="revision_year"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:COInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${COInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
