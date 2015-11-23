<html>
<head>
   <meta name="layout" content="nbalayout"/>
 </head>
			<body>
			<div id = "container">
                            <div class = "sidebar">
                                    
					<ul id = "sideBarList"> 
                                            <li><g:link controller="Login" action="allLogs">
                                            Complaint Logs        
                                            </g:link>
                                            </li>
						<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.name } }">
						<li class="controller"><g:link controller="${c.logicalPropertyName}">${c.name}</g:link></li>
					</g:each>
					</ul>
				</div>
				
				<div class = "content">
					SOME CONTENT
				</div>
			</div> 
			
			
</body>

</html>