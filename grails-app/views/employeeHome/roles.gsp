<html>
<head>
     <meta name="layout" content="nbalayout"/>
   </head>
		<body>	
			<div id = "container">
				<div class = "sidebar">
					<ul id = "sideBarList"> 
						
					<li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'marks.png')}">&nbsp;Enter ESE Marks</a></li>
						<g:each in="${jsontTimes}" var="jt">
                                                    console.log(${jt.getAt("time").encodeAsJavaScript()});
                                                </g:each>

					</ul>
				</div>
				
				<div class = "content">
					SOME CONTENT
				</div>
			</div> 
			
			
</body>

</html>