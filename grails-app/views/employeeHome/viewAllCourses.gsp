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
            <!--<a href="courseOwner.gsp"></a>-->
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li><g:link controller="EmployeeHome" action="assignCoordinator" <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;Assign Course Coordinators</a></g:link></li>
                    <li><g:link controller="EmployeeHome" action="viewallotment" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View Allotment </a></g:link></li>
                    <li><g:remoteLink controller="PO" action="createPO" update="newContent" >  <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO</g:remoteLink></li>
                    <li> <g:remoteLink controller="PO" action="index" update="newContent" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View CO/PO/PEO/GA Mappings</g:remoteLink></li>
                   <!-- <li> <g:link controller="EmployeeHome" action="selectAllCourse" <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Add CO-PO Map</a></g:link></li> -->

                    <li> <a href = "/NBA_VIT/EmployeeHome/selectAllCourseEdit"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO-PO Map</a></li>

                    <li> <a href = "/NBA_VIT/EmployeeHome/viewAllCourses"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View All Courses</a></li>
                    <li><g:link controller="EmployeeHome" action="viewAllCos" <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;View All COs</a></g:link></li>
                    <li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;&nbsp;View CO attainment of Course</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'student.png')}">&nbsp;Student Attainment of CO</a></li>
                    <li><g:link controller="EmployeeHome" action="drawGraph" <a href = "#">  <img src = "${resource(dir: 'images', file: 'attain.png')}">&nbsp;&nbsp;Attainment of PO/CO/PEO/GA of Courses</a></g:link></li>
                    </ul>
                </div>

            <div class = "content">
                <div id="newContent">
                <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">View All Courses</div>  <br><br> 
                <g:if test="${flash.message}">
                    <div class="message bg-danger">*${flash.message}</div>
                </g:if>

                <body>
                    <div style="overflow-y: scroll; max-height: 88%" id="data">
                        <table class="table table-responsive table-hover table-bordered" style="width:100%" >
                            <thead>
                                <tr style="font-size: 0.9em" class="danger">

                                    <th>Course Code </th> 

                                    <th>Associated Course</th>

                                    <th>Course Category</th>

                                    <th> Course Credit</th>

                                    <th>Course Name</th>

                                    <th>Course Type</th>

                                </tr>
                            </thead>
                            <tbody style="overflow-y: scroll;">

                                <g:each in="${courses}" status="i" var="courseInstance">
                                    <tr class="${(i % 2) == 0 ? 'success' : 'warning'}" style="font-size: .9em">

                                        <td><g:link controller="Course" action="edit" id="${courseInstance.id}">${fieldValue(bean: courseInstance, field: "course_code")}</g:link></td>

                                        <td>${fieldValue(bean: courseInstance, field: "associated_course")}</td>

                                        <td>${fieldValue(bean: courseInstance, field: "courseCategory")}</td>

                                        <td>${fieldValue(bean: courseInstance, field: "course_credit")}</td>

                                        <td>${fieldValue(bean: courseInstance, field: "course_name")}</td>

                                        <td>${fieldValue(bean: courseInstance, field: "course_type")}</td>
                                    </tr>
                                </g:each>
                            </tbody>
                        </table>


                    </div>
                    <script>
                        $(document).ready(function(){
            $('#data').after('<div id="nav" align="center" ></div>');
                        var rowsShown = 10;
                        var rowsTotal = $('#data tbody tr').length;
                        var numPages = rowsTotal/rowsShown;
                        for(i = 0;i < numPages;i++) {
                        var pageNum = i + 1;
                $('#nav').append('<a href="#" rel="'+i+'" ><font size="4">'+pageNum+'</font></a> ');
                        }
                        $('#data tbody tr').hide();
                        $('#data tbody tr').slice(0, rowsShown).show();
                        $('#nav a:first').addClass('active');
                        $('#nav a').bind('click', function(){

                        $('#nav a').removeClass('active');
                        $(this).addClass('active');
                        var currPage = $(this).attr('rel');
                        var startItem = currPage * rowsShown;
                        var endItem = startItem + rowsShown;
                        $('#data tbody tr').css('opacity','0.0').hide().slice(startItem, endItem).
                        css('display','table-row').animate({opacity:1}, 300);
                        });
                        });
                    </script>

              </div>
            </div>
        </div> 


    </body>

</html>
