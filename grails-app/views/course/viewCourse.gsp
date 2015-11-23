<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->
<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <g:javascript library="jquery"/>
    </head>
    <body>	
        <div id = "container">
            <a href="courseOwner.gsp"></a>
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li> <g:remoteLink controller="EmployeeHome" action="createCo" update="newContent"> <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Create/Edit CO</g:remoteLink></li>
                    <li> <g:link controller="EmployeeHome" action="selectCourse" <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Add CO-PO Map</a></g:link></li>
                    <li> <a href = "/NBA_VIT/EmployeeHome/selectCourseEdit"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO-PO Map</a></li>
                    <li> <g:remoteLink controller="CO" action="index" update="newContent"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO</g:remoteLink></li>
                    <li><li> <g:link controller="EmployeeHome" action="coAssesment" <a href = "#"> <img src = "${resource(dir: 'images', file: 'addMap.png')}">&nbsp;Map CO with Assesment..</a></g:link></li>
                    <li> <a href = "/NBA_VIT/Course/viewCourse"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View Courses</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'report.png')}">&nbsp;Report Mappings</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;View CO attainment of Course</a></li>

                </ul>
            </div>

            <div class = "content">
                <g:if test="${flash.message}">
                    <div class="message bg-danger">*${flash.message}</div>
                </g:if>
           
                    <body>
                        <table name='dt' border="1" class="table table-bordered" >
                            <tr>
                                <th> Course Code </th>
                                <th> Course Name </th>
                                <th> Course Category </th>
                                <th> Year </th>
                            </tr>
                            <tr>

<!-- <th ><input   name="course_name" type="text" class="form-control input-md" id="course_name" value="${crsname}" readonly></th> -->
                                <g:each in="${lol}" status = "i" var="p"> 
                                <tr>
                                    <g:each in="${p}" status = "ii" var="v">   
                                        <td align-text  ="center" >${v}</td>
                                    </g:each>
                                </tr>
                            </g:each>

                            </tr>
                        </table>
                   
             

            </div>
        </div> 


    </body>

</html>
