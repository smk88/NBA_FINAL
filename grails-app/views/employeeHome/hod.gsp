<html>
    <head>
         <meta name="layout" content="nbalayout"/>
       </head>
<body>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li><g:link controller="EmployeeHome" action="assignCoordinator" <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;Assign Course Coordinators</a></g:link></li>
                    <li><g:link controller="EmployeeHome" action="create" > <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO/PEO/GA </a></g:link></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View CO/PO/PEO/GA Mappings</a></li>
                    <li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;&nbsp;View CO attainment of Course</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'student.png')}">&nbsp;Student Attainment of CO</a></li>
                    <li><g:link controller="EmployeeHome" action="drawGraph" <a href = "#">  <img src = "${resource(dir: 'images', file: 'attain.png')}">&nbsp;&nbsp;Attainment of PO/CO/PEO/GA of Courses
                            </a></g:link></li>
                    </ul>
                </div>

            <div class = "content">
                Welcome HOD <br>
                List of emps
                    ${session.user}

            </div>     
        </div> 

        
    </body>

</html>