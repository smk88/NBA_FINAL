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
                <g:form class="form-horizontal text-justify" role="form" url="[action:'submitotp',controller:'Login']">                
            OTP:<g:textField name="otp" value="" />
            </br></br>           
            <g:submitButton name="Submit OTP" <a class="btn btn-info btn-md" ></a> </g:submitButton>
        </g:form>
            </div>
        </div> 

        
    </body>

</html>
