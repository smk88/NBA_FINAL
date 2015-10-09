
<%@ page import="nba_vit.PO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'PO.label', default: 'PO')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-PO" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-PO" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list PO">
			
				<g:if test="${POInstance?.po_code}">
				<li class="fieldcontain">
					<span id="po_code-label" class="property-label"><g:message code="PO.po_code.label" default="Pocode" /></span>
					
						<span class="property-value" aria-labelledby="po_code-label"><g:fieldValue bean="${POInstance}" field="po_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${POInstance?.po_statement}">
				<li class="fieldcontain">
					<span id="po_statement-label" class="property-label"><g:message code="PO.po_statement.label" default="Postatement" /></span>
					
						<span class="property-value" aria-labelledby="po_statement-label"><g:fieldValue bean="${POInstance}" field="po_statement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${POInstance?.program}">
				<li class="fieldcontain">
					<span id="program-label" class="property-label"><g:message code="PO.program.label" default="Program" /></span>
					
						<span class="property-value" aria-labelledby="program-label"><g:link controller="program" action="show" id="${POInstance?.program?.id}">${POInstance?.program?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:POInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${POInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
