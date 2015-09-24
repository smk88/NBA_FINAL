
<%@ page import="nba_vit.Login" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <g:set var="entityName" value="${message(code: 'login.label', default: 'Login')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-login" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                </ul>
            </div>
            <div id="list-login" class="content scaffold-list" role="main">
                <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <table>
                <thead>
                    <tr>

                        <g:sortableColumn property="username" title="${message(code: 'login.username.label', default: 'Username')}" />

                        <g:sortableColumn property="pwd" title="${message(code: 'login.pwd.label', default: 'Pwd')}" />

                        <th><g:message code="login.usertype.label" default="Usertype" /></th>

                    </tr>
                </thead>
                <tbody>
                    <g:each in="${loginInstanceList}" status="i" var="loginInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${loginInstance.id}">${fieldValue(bean: loginInstance, field: "username")}</g:link></td>

                            <td>${fieldValue(bean: loginInstance, field: "pwd")}</td>

                            <td>${fieldValue(bean: loginInstance, field: "usertype")}</td>

                        </tr>
                    </g:each>
                </tbody>
            </table>
            <div class="pagination">
                <g:paginate total="${loginInstanceCount ?: 0}" />
            </div>
        </div>


         <g:form controller="Login"  action="find"  method="POST">
            <g:textField name="username" value=""/>
            <g:passwordField name="pwd" value=""/>
            <g:submitButton value="Login" name="Login" />
        </g:form>



    </body>
</html>
