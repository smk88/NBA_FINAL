
<%@ page import="nba_vit.CO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'CO.label', default: 'CO')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-CO" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-CO" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="co_code" title="${message(code: 'CO.co_code.label', default: 'Cocode')}" />
					
						<g:sortableColumn property="co_statement" title="${message(code: 'CO.co_statement.label', default: 'Costatement')}" />
					
						<th><g:message code="CO.course.label" default="Course" /></th>
					
						<g:sortableColumn property="is_current" title="${message(code: 'CO.is_current.label', default: 'Iscurrent')}" />
					
						<g:sortableColumn property="is_lock" title="${message(code: 'CO.is_lock.label', default: 'Islock')}" />
					
						<g:sortableColumn property="revision_year" title="${message(code: 'CO.revision_year.label', default: 'Revisionyear')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${COInstanceList}" status="i" var="COInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${COInstance.id}">${fieldValue(bean: COInstance, field: "co_code")}</g:link></td>
					
						<td>${fieldValue(bean: COInstance, field: "co_statement")}</td>
					
						<td>${fieldValue(bean: COInstance, field: "course")}</td>
					
						<td><g:formatBoolean boolean="${COInstance.is_current}" /></td>
					
						<td><g:formatBoolean boolean="${COInstance.is_lock}" /></td>
					
						<td>${fieldValue(bean: COInstance, field: "revision_year")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${COInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
