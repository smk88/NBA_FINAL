
<%@ page import="nba_vit.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-student" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="grno" title="${message(code: 'student.grno.label', default: 'Grno')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'student.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'student.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="mob" title="${message(code: 'student.mob.label', default: 'Mob')}" />
					
						<g:sortableColumn property="curr_yr" title="${message(code: 'student.curr_yr.label', default: 'Curryr')}" />
					
						<g:sortableColumn property="academic_yr" title="${message(code: 'student.academic_yr.label', default: 'Academicyr')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${studentInstanceList}" status="i" var="studentInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${studentInstance.id}">${fieldValue(bean: studentInstance, field: "grno")}</g:link></td>
					
						<td>${fieldValue(bean: studentInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "mob")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "curr_yr")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "academic_yr")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${studentInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
