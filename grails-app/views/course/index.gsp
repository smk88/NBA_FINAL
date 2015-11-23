
<%@ page import="nba_vit.Course" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-course" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-course" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="course_code" title="${message(code: 'course.course_code.label', default: 'Coursecode')}" />
					
						<th><g:message code="course.associated_course.label" default="Associatedcourse" /></th>
					
						<th><g:message code="course.courseCategory.label" default="Course Category" /></th>
					
						<g:sortableColumn property="course_credit" title="${message(code: 'course.course_credit.label', default: 'Coursecredit')}" />
					
						<g:sortableColumn property="course_name" title="${message(code: 'course.course_name.label', default: 'Coursename')}" />
					
						<th><g:message code="course.course_type.label" default="Coursetype" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${courseInstanceList}" status="i" var="courseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${courseInstance.id}">${fieldValue(bean: courseInstance, field: "course_code")}</g:link></td>
					
						<td>${fieldValue(bean: courseInstance, field: "associated_course")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "courseCategory")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "course_credit")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "course_name")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "course_type")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${courseInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
