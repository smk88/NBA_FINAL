<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        
        <script>
            function displayMsg()
            {
                alert("Record inserted successfully");
                <g:remoteFunction controller="PO" action="index" id="12" update="newContent" /> 
            }
        </script>
          <g:javascript>
            function disp(e) {
                alert("Record not inserted successfully");
                println("Now in disp function")
                println(e)
                ${e}
                $('postContent').value='';
            }
            function showSpinner(visible) {
                 $('spinner').style.display = visible ? "inline" : "none";
            }
        </g:javascript>
    </head>
    <body>
      

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li><g:link controller="EmployeeHome" action="assignCoordinator" <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;Assign Course Coordinators</a></g:link></li>
                    <li><g:link controller="EmployeeHome" action="viewallotment" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View Allotment </a></g:link></li>
                    <li><g:remoteLink controller="PO" action="createPO" update="newContent" >  <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO</g:remoteLink></li>
                    <li> <g:remoteLink controller="PO" action="index" update="newContent" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View POs</g:remoteLink></li>
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
                Welcome HOD <br>
                List of emps
                ${session.user}

                <div id="content">
                    <div id="newContent">
                        <!-- This will be replaced -->
                    </div>
                    <br><br>
                    <div id="newContent1">
                     <!--  This will be replaced by new Content -->
                    </div>
                </div>
                <div id="listDiv"></div>

            </div>     
        </div> 


    </body>

</html>