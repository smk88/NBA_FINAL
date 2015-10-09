<html>
    <head>
        <meta name="layout" content="nbalayout"/>
    </head>
 <body>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 

                    
                </ul>
            </div>

            <div class = "content">
                <g:form class="form-horizontal text-justify" role="form" url="[action:'resetpassword',controller:'EmployeeHome']">
         <!-- <form name="changepassword" action="xyz" method="POST"> -->           
            New Password:<g:textField name="newpwd" value="" />
            </br></br>
            Confirm Password:<g:textField name="confpwd" value="" />
            </br></br>
           <!-- <input type="submit" value="change" />  -->
            <g:submitButton name="Change" <a class="btn btn-info btn-md" ></a> </g:submitButton>
        </g:form>
				
            </div>
        </div> 

        
    </body>

</html>
