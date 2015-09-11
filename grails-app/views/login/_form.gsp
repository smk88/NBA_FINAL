<%@ page import="nba_vit.Login" %>



<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'username', 'error')} ">
	<label for="username">
		<g:message code="login.username.label" default="Username" />
		
	</label>
	<g:textField name="username" value="${loginInstance?.username}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'pwd', 'error')} ">
	<label for="pwd">
		<g:message code="login.pwd.label" default="Pwd" />
		
	</label>
	<g:field type="password" name="pwd" value="${loginInstance?.pwd}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: loginInstance, field: 'usertype', 'error')} required">
	<label for="usertype">
		<g:message code="login.usertype.label" default="Usertype" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="usertype" name="usertype.id" from="${nba_vit.UserType.list()}" optionKey="id" required="" value="${loginInstance?.usertype?.id}" class="many-to-one"/>
</div>

