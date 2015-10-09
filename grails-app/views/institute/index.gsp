
<%@ page import="nba_vit.Institute" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'institute.label', default: 'Institute')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-institute" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-institute" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="address" title="${message(code: 'institute.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="establishment_date" title="${message(code: 'institute.establishment_date.label', default: 'Establishmentdate')}" />
					
						<g:sortableColumn property="mission" title="${message(code: 'institute.mission.label', default: 'Mission')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'institute.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="vision" title="${message(code: 'institute.vision.label', default: 'Vision')}" />
					
						<g:sortableColumn property="vm_created_date" title="${message(code: 'institute.vm_created_date.label', default: 'Vmcreateddate')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${instituteInstanceList}" status="i" var="instituteInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${instituteInstance.id}">${fieldValue(bean: instituteInstance, field: "address")}</g:link></td>
					
						<td><g:formatDate date="${instituteInstance.establishment_date}" /></td>
					
						<td>${fieldValue(bean: instituteInstance, field: "mission")}</td>
					
						<td>${fieldValue(bean: instituteInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: instituteInstance, field: "vision")}</td>
					
						<td><g:formatDate date="${instituteInstance.vm_created_date}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${instituteInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
