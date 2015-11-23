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
                <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">View Courses</div>  <br><br> 
                <g:if test="${flash.message}">
                    <div class="message bg-danger">*${flash.message}</div>
                </g:if>

                <body>
                    <table name='dt' border="1" class="table table-bordered" id="data">
                        <thead>
                            <tr class="warning">
                                <th> Course Code </th>
                                <th> Course Name </th>
                                <th> Course Category </th>
                                <th> Year </th>
                            </tr>
                        </thead>
                        <tr>

<!-- <th ><input   name="course_name" type="text" class="form-control input-md" id="course_name" value="${crsname}" readonly></th> -->
                            <g:each in="${lol}" status = "i" var="p"> 
                            <tr>
                                <g:each in="${p}" status = "ii" var="v">   
                                    <td align-text  ="center" class="success">${v}</td>
                                </g:each>
                            </tr>
                        </g:each>

                        </tr>
                    </table>


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


    </body>





</html>
