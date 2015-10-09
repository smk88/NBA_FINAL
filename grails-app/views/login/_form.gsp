<%@ page import="nba_vit.Login" %>



<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="login.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${loginInstance?.username}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'pwd', 'error')} ">
	<label for="pwd">
		<g:message code="login.pwd.label" default="Pwd" />
		
	</label>
	<g:textField name="pwd" value="${loginInstance?.pwd}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'user_type', 'error')} required">
	<label for="user_type">
		<g:message code="login.user_type.label" default="Usertype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user_type" name="user_type.id" from="${nba_vit.UserType.list()}" optionKey="id" required="" value="${loginInstance?.user_type?.id}" class="many-to-one"/>
</div>

