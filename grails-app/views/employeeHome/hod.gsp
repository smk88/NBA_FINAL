<html>
<head>
<title>VIT NBA Software </title> 
<link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'global.css')}">
</head>

<body>
			<div id="header">
                    <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >					
                    <p> Vishwakarma Institute Of Technology, Pune </br><small id ="header1">NBA Software</small></p>
			</div>
			
			<!-- <div id = "containerBand">
				
			</div>  -->
			
			<div id = "container">
				<div class = "sidebar">
					<ul id = "sideBarList"> 
						<li> <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;Assign Course Coordinators</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO/PEO/GA </a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View CO/PO/PEO/GA Mappings</a></li>
						<li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;&nbsp;View CO attainment of Course</a></li>
						<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'student.png')}">&nbsp;Student Attainment of CO</a></li>
						<li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'attain.png')}">&nbsp;&nbsp;Attainment of PO/CO/PEO/GA of Courses
</a></li>
					</ul>
				</div>
				
				<div class = "content">
					Welcome HOD 
                                        ${emp.name}<br>
                                        ${emp.email}<br>
                                        ${emp.program}<br>
				</div>
			</div> 
			
			 <div id = "footer" >
				<div class = "logo"> 
					<a href = "#"> <small>@Credits NBA Software Team</small></a>
				</div> 
			</div> 
</body>

</html>