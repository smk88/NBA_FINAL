
<%@ page import="nba_vit.COPOMapping" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <g:set var="entityName" value="${message(code: 'COPOMapping.label', default: 'COPOMapping')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        ${cos}<br>
        ${pos}
        <g:form role="form" url="[action:'saveCOPO']">
            <table id="table1">
                <th>index</th>
                    <g:each in="${pos}" var="v" status="i">
                    <th> ${pos[i]} </th>
                    </g:each>

                    <g:each in="${cos}" var="v1" status="j">
                        <tr id="row${j}">
                            <td>${cos[j]}</td>
                            <g:each in="${pos}" var="v" status="k">
                                <td><input type="text" name="list" value=""></td>
                            </g:each>
                        </tr>
                    </g:each>
            </table>
            <g:submitButton name="Save" value="Save"></g:submitButton>
           <g:hiddenField  name="cos" value="${cos}"/> 
           <g:hiddenField  name="pos" value="${pos}"/> 
        </g:form>





<!--		<a href="#list-COPOMapping" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
    <div class="nav" role="navigation">
            <ul>
                    <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                    <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
    </div>
    <div id="list-COPOMapping" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
            </g:if>
            <table>
            <thead>
                            <tr>
                            
                                    <th><g:message code="COPOMapping.co.label" default="Co" /></th>
                            
                                    <th><g:message code="COPOMapping.po.label" default="Po" /></th>
                            
                                    <g:sortableColumn property="value" title="${message(code: 'COPOMapping.value.label', default: 'Value')}" />
                            
                            </tr>
                    </thead>
                    <tbody>
                    <g:each in="${COPOMappingInstanceList}" status="i" var="COPOMappingInstance">
                            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                            
                                    <td><g:link action="show" id="${COPOMappingInstance.id}">${fieldValue(bean: COPOMappingInstance, field: "co")}</g:link></td>
                            
                                    <td>${fieldValue(bean: COPOMappingInstance, field: "po")}</td>
                            
                                    <td>${fieldValue(bean: COPOMappingInstance, field: "value")}</td>
                            
                            </tr>
                    </g:each>
                    </tbody>
            </table>
            <div class="pagination">
                    <g:paginate total="${COPOMappingInstanceCount ?: 0}" />
            </div>
    </div>-->
    </body>
</html>
