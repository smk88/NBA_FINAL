<%@ page import="nba_vit.PO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="nbalayout">
        <g:set var="entityName" value="${message(code: 'PO.label', default: 'PO')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
        <script>
            function displayMsg()
            {
            alert("Record inserted successfully");
            <g:remoteFunction controller="EmployeeHome" action="index" id="12" update="newContent" /> 
            }
        </script>
    </head>
    <body>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
               <!--
                <div class="nav" role="navigation">
        <ul>
            <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
            <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
               -->

                </ul>
            </div>

            <div class = "content">

                <div   role="main">
                    <div class="w3-card-2" style="width: auto;margin-left: 8%;margin-top: 2%;">
                    <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em"><g:message code="default.edit.label" args="[entityName]" /></div>

                    <g:if test="${flash.message}">
                        <div class="message" role="status">${flash.message}</div>
                    </g:if>
                    <g:hasErrors bean="${POInstance}">
                        <ul class="errors" role="alert">
                            <g:eachError bean="${POInstance}" var="error">
                                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                                </g:eachError>
                        </ul>
                    </g:hasErrors>
                    
                    <g:form url="[resource:POInstance, action:'update']" method="PUT" >
                        <g:hiddenField name="version" value="${POInstance?.version}" />
                        
                       
                            <g:render template="MyEditform"/>
                           
        <!--				<fieldset class="buttons">
                                <g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
                        </fieldset>-->
                    </g:form>
                    </div>
                </div>
            </div>
        </div> 

    </body>
</html>
