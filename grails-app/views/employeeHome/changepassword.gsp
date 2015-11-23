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
                <div  class="w3-card-2" style="width:65%;margin-left: 15%;margin-top: 5%">
                    <div class="w3-blue-grey">
                        <h2 style="text-align: center">Reset Password</h2>
                    </div>
                 
                    <g:form class="w3-form" role="form" url="[action:'resetpassword',controller:'EmployeeHome']" >
                        
                        <div class="w3-input-group">      
                           <b>New Password:</b>
                            <g:textField class="w3-input w3-border w3-sand" name="newpwd" value="" required="true" placeholder="new password"/>
                        </div>
                        <div class="w3-input-group">      
                          <b> Confirm Password:</b>
                            <g:textField  class="w3-input w3-border w3-sand" name="confpwd"  value="" required="true" placeholder="confirm password"/>
                        </div><br>
                        <g:submitButton name="Change" <a class="btn w3-btn w3-blue-grey" ></a> </g:submitButton>
                    </g:form>
                    </div>
                
            </div> 
        </div>

    </body>

</html>
