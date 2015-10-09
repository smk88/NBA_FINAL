
<%@ page import="nba_vit.Institute" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'institute.label', default: 'Institute')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-institute" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-institute" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list institute">
			
				<g:if test="${instituteInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="institute.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${instituteInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instituteInstance?.establishment_date}">
				<li class="fieldcontain">
					<span id="establishment_date-label" class="property-label"><g:message code="institute.establishment_date.label" default="Establishmentdate" /></span>
					
						<span class="property-value" aria-labelledby="establishment_date-label"><g:formatDate date="${instituteInstance?.establishment_date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${instituteInstance?.mission}">
				<li class="fieldcontain">
					<span id="mission-label" class="property-label"><g:message code="institute.mission.label" default="Mission" /></span>
					
						<span class="property-value" aria-labelledby="mission-label"><g:fieldValue bean="${instituteInstance}" field="mission"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instituteInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="institute.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${instituteInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instituteInstance?.vision}">
				<li class="fieldcontain">
					<span id="vision-label" class="property-label"><g:message code="institute.vision.label" default="Vision" /></span>
					
						<span class="property-value" aria-labelledby="vision-label"><g:fieldValue bean="${instituteInstance}" field="vision"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instituteInstance?.vm_created_date}">
				<li class="fieldcontain">
					<span id="vm_created_date-label" class="property-label"><g:message code="institute.vm_created_date.label" default="Vmcreateddate" /></span>
					
						<span class="property-value" aria-labelledby="vm_created_date-label"><g:formatDate date="${instituteInstance?.vm_created_date}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:instituteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${instituteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
