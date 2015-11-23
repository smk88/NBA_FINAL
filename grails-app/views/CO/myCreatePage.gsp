<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
       <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
         <meta name="layout" content="nbalayout">
    <g:javascript library="jquery"/>

        <title>Sample title</title>
    </head>
    <body>
        <g:form url="[resource:COInstance, action:'save1']" method="PUT" >
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'course', 'error')} required">
                <label for="course">
                    <g:message code="CO.course.label" default="Course" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select id="course" name="course.id" from="${session.courses}" optionKey="id" required="" noSelection="['':'-Select course-']" value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(action:'myudpateFunction',params:'\'id=\' + (this.value)', update:'co_code_div', onSuccess:'myFun()')}" onComplete="myFun()"/> 
            </div>
            <div id="co_code_div">
            </div>
          </g:form>
            </body>
        </html>
