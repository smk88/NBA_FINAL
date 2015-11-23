<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="nbalayout">
        <g:javascript library="jquery"/>
        <title>Sample title</title>
    </head>
    <body>
        <g:form url="[resource:POInstance, action:'savePO']">
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'course', 'error')} required">
                <label for="course">
                    <g:message code="CO.course.label" default="Course" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select id="program" name="programID" from="${session.programs}" noSelection="['':'-Select Program-']" optionKey="id" required="" value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(action:'setProgram',params:'\'id=\' + (this.value)', update:'pocreate')}" /> 

            </div>
            <div id="pocreate"></div>


            <fieldset class="buttons">
                <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
            </fieldset>
        </g:form>
    </body>
</html>
