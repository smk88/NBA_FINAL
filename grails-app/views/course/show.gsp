
<%@ page import="nba_vit.Course" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-course" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-course" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list course">
			
				<g:if test="${courseInstance?.course_code}">
				<li class="fieldcontain">
					<span id="course_code-label" class="property-label"><g:message code="course.course_code.label" default="Coursecode" /></span>
					
						<span class="property-value" aria-labelledby="course_code-label"><g:fieldValue bean="${courseInstance}" field="course_code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.associated_course}">
				<li class="fieldcontain">
					<span id="associated_course-label" class="property-label"><g:message code="course.associated_course.label" default="Associatedcourse" /></span>
					
						<span class="property-value" aria-labelledby="associated_course-label"><g:link controller="course" action="show" id="${courseInstance?.associated_course?.id}">${courseInstance?.associated_course?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.courseCategory}">
				<li class="fieldcontain">
					<span id="courseCategory-label" class="property-label"><g:message code="course.courseCategory.label" default="Course Category" /></span>
					
						<span class="property-value" aria-labelledby="courseCategory-label"><g:link controller="courseCategory" action="show" id="${courseInstance?.courseCategory?.id}">${courseInstance?.courseCategory?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.course_credit}">
				<li class="fieldcontain">
					<span id="course_credit-label" class="property-label"><g:message code="course.course_credit.label" default="Coursecredit" /></span>
					
						<span class="property-value" aria-labelledby="course_credit-label"><g:fieldValue bean="${courseInstance}" field="course_credit"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.course_name}">
				<li class="fieldcontain">
					<span id="course_name-label" class="property-label"><g:message code="course.course_name.label" default="Coursename" /></span>
					
						<span class="property-value" aria-labelledby="course_name-label"><g:fieldValue bean="${courseInstance}" field="course_name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.course_type}">
				<li class="fieldcontain">
					<span id="course_type-label" class="property-label"><g:message code="course.course_type.label" default="Coursetype" /></span>
					
						<span class="property-value" aria-labelledby="course_type-label"><g:link controller="courseType" action="show" id="${courseInstance?.course_type?.id}">${courseInstance?.course_type?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.employee}">
				<li class="fieldcontain">
					<span id="employee-label" class="property-label"><g:message code="course.employee.label" default="Employee" /></span>
					
						<span class="property-value" aria-labelledby="employee-label"><g:link controller="employee" action="show" id="${courseInstance?.employee?.id}">${courseInstance?.employee?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.program}">
				<li class="fieldcontain">
					<span id="program-label" class="property-label"><g:message code="course.program.label" default="Program" /></span>
					
						<g:each in="${courseInstance.program}" var="p">
						<span class="property-value" aria-labelledby="program-label"><g:link controller="program" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.year}">
				<li class="fieldcontain">
					<span id="year-label" class="property-label"><g:message code="course.year.label" default="Year" /></span>
					
						<span class="property-value" aria-labelledby="year-label"><g:fieldValue bean="${courseInstance}" field="year"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:courseInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${courseInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
