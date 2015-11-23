    <!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <meta name="layout" content="nbalayout"/>
        <title>View COs</title>
    </head>
    <body>
       <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
            </ul>
        </div>
        <div class = "content">
    <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">CO List</div>  <br><br> 
         <g:form url="[controller:'EmployeeHome', action:'listCOs']" method="post" name="remoteCreateCOForm" >
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'course', 'error')} required">
                <label for="program">
                    <g:message code="CO.course.label" default="Course" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select id="program" name="program.id" from="${session.programs}" optionKey="id" required="" noSelection="['':'-Select course-']" value="${ProgramInstance?.program?.id}" class="many-to-one" /> 
            </div>
            <br>
            <g:submitButton name="Get COs" class="btn w3-btn w3-blue-grey btn-md active" value="Get COs" />
          </g:form>
         <div id="newContent">
         </div>
    
            </div>     
        </div> 
    </body>
</html>
