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
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li> <g:link controller="EmployeeHome" action="createCo" <a href = "#"> <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Create CO</a></g:link></li>
                    <li> <g:link controller="EmployeeHome" action="selectCourse" <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Add CO-PO Map</a></g:link></li>			
                    <li> <a href = "/NBA_VIT/EmployeeHome/selectCourse"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Map CO-PO</a></li>
                    <li> <a href = "/NBA_VIT/EmployeeHome/selectCourseEdit"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO-PO</a></li>
                    <li> <g:link controller="EmployeeHome" action="coAssesment" <a href = "#"> <img src = "${resource(dir: 'images', file: 'addMap.png')}">&nbsp;Map CO with Assesment..</a></g:link></li>
                    <li> <a href = "/NBA_VIT/EmployeeHome/viewCourse"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View Courses</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'report.png')}">&nbsp;Report Mappings</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;View CO attainment of Course</a></li>

                </ul>
            </div> 

            <div class = "content1">
                <div class="w3-card-2" style="width:60%;height: 60%;margin-left: 20%;margin-top: 3%">
                    <g:if test="${flash.message}">
                        <div class="message bg-danger" style="display: block"  >*${flash.message}</div>
                    </g:if>
                    <div style="color:red"> *Please Make sure you have mapped CO-PO for the Course selected </div>
                    <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">Edit CO-PO Mapping</div>  <br><br> 
                    <g:form controller="COPOMapping" action="COPOMap_viewEdit">
                        <g:select class="bg-info" name="Programs" id="Programs"  from="${proglst}" noSelection="${['null':'Please Select Program']}" optionKey="id" value="Programs_"/>  <!--onchange="submit()" -->
                        <g:select class="bg-info" name="Courses" id="Courses"  from="${crs}" noSelection="${['null':'Please Select Course']}" optionKey="id"  /><!--value="0"-->

                        <g:submitButton class="btn w3-btn w3-blue-grey btn-md active" name="Submit" />
                    </g:form>

                </div>

            </div>
        </div>   


    </body>
</html>
