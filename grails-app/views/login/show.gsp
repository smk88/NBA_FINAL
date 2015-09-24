
<%@ page import="nba_vit.Login" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <g:set var="entityName" value="${message(code: 'login.label', default: 'Login')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#show-login" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                </ul>
            </div>
            <div id="show-login" class="content scaffold-show" role="main">
                <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <ol class="property-list login">

                <g:if test="${loginInstance?.username}">
                    <li class="fieldcontain">
                        <span id="username-label" class="property-label"><g:message code="login.username.label" default="Username" /></span>

                        <span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${loginInstance}" field="username"/></span>

                    </li>
                </g:if>

                <g:if test="${loginInstance?.pwd}">
                    <li class="fieldcontain">
                        <span id="pwd-label" class="property-label"><g:message code="login.pwd.label" default="Pwd" /></span>

                        <span class="property-value" aria-labelledby="pwd-label"><g:fieldValue bean="${loginInstance}" field="pwd"/></span>

                    </li>
                </g:if>

                <g:if test="${loginInstance?.usertype}">
                    <li class="fieldcontain">
                        <span id="usertype-label" class="property-label"><g:message code="login.usertype.label" default="Usertype" /></span>

                        <span class="property-value" aria-labelledby="usertype-label"><g:link controller="userType" action="show" id="${loginInstance?.usertype?.id}">${loginInstance?.usertype?.encodeAsHTML()}</g:link></span>

                    </li>
                </g:if>

            </ol>
            <g:form url="[resource:loginInstance, action:'delete']" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="edit" action="edit" resource="${loginInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    <g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
                </fieldset>
            </g:form>
        </div>

        <g:form  controller="Login" action="authenticate"  method="POST">
            <g:textField name="username" value=""/>
            <g:passwordField name="pwd" value=""/>
            <g:actionSubmit value="Login" />
        </g:form>
    </body>
</html>
