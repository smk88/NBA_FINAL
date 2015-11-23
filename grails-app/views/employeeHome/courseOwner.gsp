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
						<li> <g:link controller="EmployeeHome" action="coAssesment" <a href = "#"> <img src = "${resource(dir: 'images', file: 'addMap.png')}">&nbsp;Map CO with Assesment..</a></g:link></li>
						<li> <a href = "/NBA_VIT/EmployeeHome/viewCourse"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View Courses</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'report.png')}">&nbsp;Report Mappings</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;View CO attainment of Course</a></li>
						
					</ul>
				</div>
				
				<div class = "content">
                                      <g:if test="${flash.message}">
                                        <div class="message bg-danger">*${flash.message}</div>
                                    </g:if>
					SOME CONTENT
                                        You are Course owner for following courses<br>  
                                        ${session.courses}
                                        <div id="newContent">
                                            <!-- This will be replaced -->
                                        </div>

				</div>
			</div> 
			
			
</body>

</html>