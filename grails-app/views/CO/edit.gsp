<%@ page import="nba_vit.CO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="nbalayout">
        <g:set var="entityName" value="${message(code: 'CO.label', default: 'CO')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 

<!--	<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>

-->
                </ul>
            </div>

            <div class = "content">

                <div id="edit-CO" class="scaffold-edit" role="main">
                    <div class="w3-blue-grey col-lg-12" style="font-size: 1.2em;width:80%; text-align: center"><g:message code="default.edit.label" args="[entityName]" />&nbsp;[${session.course}:${session.course.course_name}]</div>  <br><br> 
                   
                    <g:if test="${flash.message}">
                        <div class="message" role="status">${flash.message}</div>
                    </g:if>
                    <g:hasErrors bean="${COInstance}">
                        <ul class="errors" role="alert">
                            <g:eachError bean="${COInstance}" var="error">
                                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                                </g:eachError>
                        </ul>
                    </g:hasErrors>
                    <g:form url="[resource:COInstance, action:'update']" method="PUT" >
                        <g:hiddenField name="version" value="${COInstance?.version}" />
                       
                            <g:render template="form"/>
                        
                       <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <g:actionSubmit class="btn w3-btn w3-blue-grey btn-lg active" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
                        
                    </g:form>
                </div>    



            </div>
        </div> 


    </body>
</html>
