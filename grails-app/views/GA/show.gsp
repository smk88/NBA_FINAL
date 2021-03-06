
<%@ page import="nba_vit.GA" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'GA.label', default: 'GA')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-GA" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-GA" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list GA">
			
				<g:if test="${GAInstance?.ga_code}">
				<li class="fieldcontain">
					<span id="ga_code-label" class="property-label"><g:message code="GA.ga_code.label" default="Gacode" /></span>
					
						<span class="property-value" aria-labelledby="ga_code-label"><g:fieldValue bean="${GAInstance}" field="ga_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${GAInstance?.ga_statement}">
				<li class="fieldcontain">
					<span id="ga_statement-label" class="property-label"><g:message code="GA.ga_statement.label" default="Gastatement" /></span>
					
						<span class="property-value" aria-labelledby="ga_statement-label"><g:fieldValue bean="${GAInstance}" field="ga_statement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${GAInstance?.is_current}">
				<li class="fieldcontain">
					<span id="is_current-label" class="property-label"><g:message code="GA.is_current.label" default="Iscurrent" /></span>
					
						<span class="property-value" aria-labelledby="is_current-label"><g:formatBoolean boolean="${GAInstance?.is_current}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${GAInstance?.is_lock}">
				<li class="fieldcontain">
					<span id="is_lock-label" class="property-label"><g:message code="GA.is_lock.label" default="Islock" /></span>
					
						<span class="property-value" aria-labelledby="is_lock-label"><g:formatBoolean boolean="${GAInstance?.is_lock}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${GAInstance?.program_type}">
				<li class="fieldcontain">
					<span id="program_type-label" class="property-label"><g:message code="GA.program_type.label" default="Programtype" /></span>
					
						<span class="property-value" aria-labelledby="program_type-label"><g:link controller="programType" action="show" id="${GAInstance?.program_type?.id}">${GAInstance?.program_type?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${GAInstance?.revision_year}">
				<li class="fieldcontain">
					<span id="revision_year-label" class="property-label"><g:message code="GA.revision_year.label" default="Revisionyear" /></span>
					
						<span class="property-value" aria-labelledby="revision_year-label"><g:fieldValue bean="${GAInstance}" field="revision_year"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:GAInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${GAInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
