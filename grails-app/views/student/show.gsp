
<%@ page import="nba_vit.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-student" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list student">
			
				<g:if test="${studentInstance?.grno}">
				<li class="fieldcontain">
					<span id="grno-label" class="property-label"><g:message code="student.grno.label" default="Grno" /></span>
					
						<span class="property-value" aria-labelledby="grno-label"><g:fieldValue bean="${studentInstance}" field="grno"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="student.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${studentInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="student.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${studentInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.mob}">
				<li class="fieldcontain">
					<span id="mob-label" class="property-label"><g:message code="student.mob.label" default="Mob" /></span>
					
						<span class="property-value" aria-labelledby="mob-label"><g:fieldValue bean="${studentInstance}" field="mob"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.curr_yr}">
				<li class="fieldcontain">
					<span id="curr_yr-label" class="property-label"><g:message code="student.curr_yr.label" default="Curryr" /></span>
					
						<span class="property-value" aria-labelledby="curr_yr-label"><g:fieldValue bean="${studentInstance}" field="curr_yr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.academic_yr}">
				<li class="fieldcontain">
					<span id="academic_yr-label" class="property-label"><g:message code="student.academic_yr.label" default="Academicyr" /></span>
					
						<span class="property-value" aria-labelledby="academic_yr-label"><g:fieldValue bean="${studentInstance}" field="academic_yr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.fy_rn}">
				<li class="fieldcontain">
					<span id="fy_rn-label" class="property-label"><g:message code="student.fy_rn.label" default="Fyrn" /></span>
					
						<span class="property-value" aria-labelledby="fy_rn-label"><g:fieldValue bean="${studentInstance}" field="fy_rn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.sy_rn}">
				<li class="fieldcontain">
					<span id="sy_rn-label" class="property-label"><g:message code="student.sy_rn.label" default="Syrn" /></span>
					
						<span class="property-value" aria-labelledby="sy_rn-label"><g:fieldValue bean="${studentInstance}" field="sy_rn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.ty_rn}">
				<li class="fieldcontain">
					<span id="ty_rn-label" class="property-label"><g:message code="student.ty_rn.label" default="Tyrn" /></span>
					
						<span class="property-value" aria-labelledby="ty_rn-label"><g:fieldValue bean="${studentInstance}" field="ty_rn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.btech_rn}">
				<li class="fieldcontain">
					<span id="btech_rn-label" class="property-label"><g:message code="student.btech_rn.label" default="Btechrn" /></span>
					
						<span class="property-value" aria-labelledby="btech_rn-label"><g:fieldValue bean="${studentInstance}" field="btech_rn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.fy_div}">
				<li class="fieldcontain">
					<span id="fy_div-label" class="property-label"><g:message code="student.fy_div.label" default="Fydiv" /></span>
					
						<span class="property-value" aria-labelledby="fy_div-label"><g:fieldValue bean="${studentInstance}" field="fy_div"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.sy_div}">
				<li class="fieldcontain">
					<span id="sy_div-label" class="property-label"><g:message code="student.sy_div.label" default="Sydiv" /></span>
					
						<span class="property-value" aria-labelledby="sy_div-label"><g:fieldValue bean="${studentInstance}" field="sy_div"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.ty_div}">
				<li class="fieldcontain">
					<span id="ty_div-label" class="property-label"><g:message code="student.ty_div.label" default="Tydiv" /></span>
					
						<span class="property-value" aria-labelledby="ty_div-label"><g:fieldValue bean="${studentInstance}" field="ty_div"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.btech_div}">
				<li class="fieldcontain">
					<span id="btech_div-label" class="property-label"><g:message code="student.btech_div.label" default="Btechdiv" /></span>
					
						<span class="property-value" aria-labelledby="btech_div-label"><g:fieldValue bean="${studentInstance}" field="btech_div"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.grad_status}">
				<li class="fieldcontain">
					<span id="grad_status-label" class="property-label"><g:message code="student.grad_status.label" default="Gradstatus" /></span>
					
						<span class="property-value" aria-labelledby="grad_status-label"><g:formatBoolean boolean="${studentInstance?.grad_status}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.department}">
				<li class="fieldcontain">
					<span id="department-label" class="property-label"><g:message code="student.department.label" default="Department" /></span>
					
						<span class="property-value" aria-labelledby="department-label"><g:link controller="department" action="show" id="${studentInstance?.department?.id}">${studentInstance?.department?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.program}">
				<li class="fieldcontain">
					<span id="program-label" class="property-label"><g:message code="student.program.label" default="Program" /></span>
					
						<span class="property-value" aria-labelledby="program-label"><g:link controller="program" action="show" id="${studentInstance?.program?.id}">${studentInstance?.program?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:studentInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${studentInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
