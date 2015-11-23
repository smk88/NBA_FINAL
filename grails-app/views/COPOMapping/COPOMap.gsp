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
        <title>CO PO Mapping</title>
    </head>
    <body>
        <g:form url="[resource:COPOMappingInstance, action:'saveMap']">
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'course', 'error')} required">
                <label for="course">
                    <g:message code="CO.course.label" default="Course" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select id="course" name="course.id" from="${session.courses}" noSelection="['':'-Select course-']" optionKey="id"  value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(action:'setCourse',params:'\'id=\' + (this.value)')}" /> 
                <label for="program">
                    <g:message code="CO.course.label" default="Program" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select id="program" name="program.id" from="${session.program}" noSelection="['':'-Select Program-']" optionKey="id" required="" value="${ProgramInstance?.program?.id}" class="many-to-one" onchange="${remoteFunction(action:'setProgram',params:'\'id=\' + (this.value)', update:'map_form')}" /> 
            </div>
            <div id="map_form">
              
            </div>
            <fieldset class="buttons">
                    <g:submitButton name="save" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
            </fieldset>

        </g:form>
    </body>
</html>
