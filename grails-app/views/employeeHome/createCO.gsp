<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="nbalayout"/>
        <title>Sample title</title>
    </head>
    <body>
        <div id = "container">
            <a href="courseOwner.gsp"></a>
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                  <li> <g:link controller="EmployeeHome" action="createCo" update="newContent"> <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Create CO</g:link></li>
						<li> <g:link controller="EmployeeHome" action="selectCourse" <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Add CO-PO Map</a></g:link></li>
                                                <li> <a href = "/NBA_VIT/EmployeeHome/selectCourseEdit"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO-PO Map</a></li>
                                                <li> <g:link controller="CO" action="index1"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO</g:link></li>
						<li><li> <g:link controller="EmployeeHome" action="coAssesment" <a href = "#"> <img src = "${resource(dir: 'images', file: 'addMap.png')}">&nbsp;Map CO with Assesment..</a></g:link></li>
						<li> <a href = "/NBA_VIT/EmployeeHome/viewCourse"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View Courses</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'report.png')}">&nbsp;Report Mappings</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;View CO attainment of Course</a></li>

                </ul>
            </div>

            <div class = "content">
                <div class="label w3-blue-grey col-lg-12" style="font-size: 1em">Create CO's</div>  <br><br> 
                <div class="w3-container w3-large">
                    <g:form url="[controller:'CO', action:'create']" method="post" name="createCOform">
                        <g:select id="course" name="course.id" from="${session.courses}" optionKey="id" required="" noSelection="['':'-Select course-']" value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(controller:'CO', action:'myudpateFunction',params:'\'id=\' + (this.value)', update:'newContent1', onSuccess:'myFun()')}" /> 
                        <br><br>
                        <g:actionSubmit class="btn w3-btn w3-blue-grey btn-md active" action="create" value="${message(code: 'default.button.save.label', default: 'Create CO')}" />
                    </g:form>
                    <div id="newContent1">

                    </div>
                </div>

            </div>
        </div>
    </body>
</html>
