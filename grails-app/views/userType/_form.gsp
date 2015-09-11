<%@ page import="nba_vit.UserType" %>



<div class="fieldcontain ${hasErrors(bean: userTypeInstance, field: 'usertype', 'error')} ">
	<label for="usertype">
		<g:message code="userType.usertype.label" default="Usertype" />
		
	</label>
	<g:textField name="usertype" value="${userTypeInstance?.usertype}"/>
</div>

