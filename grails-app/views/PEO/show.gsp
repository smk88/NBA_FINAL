
<%@ page import="nba_vit.PEO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'PEO.label', default: 'PEO')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-PEO" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-PEO" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list PEO">
			
				<g:if test="${PEOInstance?.peo_code}">
				<li class="fieldcontain">
					<span id="peo_code-label" class="property-label"><g:message code="PEO.peo_code.label" default="Peocode" /></span>
					
						<span class="property-value" aria-labelledby="peo_code-label"><g:fieldValue bean="${PEOInstance}" field="peo_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${PEOInstance?.peo_Statement}">
				<li class="fieldcontain">
					<span id="peo_Statement-label" class="property-label"><g:message code="PEO.peo_Statement.label" default="Peo Statement" /></span>
					
						<span class="property-value" aria-labelledby="peo_Statement-label"><g:fieldValue bean="${PEOInstance}" field="peo_Statement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${PEOInstance?.program}">
				<li class="fieldcontain">
					<span id="program-label" class="property-label"><g:message code="PEO.program.label" default="Program" /></span>
					
						<span class="property-value" aria-labelledby="program-label"><g:link controller="program" action="show" id="${PEOInstance?.program?.id}">${PEOInstance?.program?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:PEOInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${PEOInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
