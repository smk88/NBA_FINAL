
<%@ page import="nba_vit.PO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'PO.label', default: 'PO')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-PO" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-PO" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="po_code" title="${message(code: 'PO.po_code.label', default: 'Pocode')}" />
					
						<g:sortableColumn property="po_statement" title="${message(code: 'PO.po_statement.label', default: 'Postatement')}" />
					
						<th><g:message code="PO.program.label" default="Program" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${POInstanceList}" status="i" var="POInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${POInstance.id}">${fieldValue(bean: POInstance, field: "po_code")}</g:link></td>
					
						<td>${fieldValue(bean: POInstance, field: "po_statement")}</td>
					
						<td>${fieldValue(bean: POInstance, field: "program")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${POInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
