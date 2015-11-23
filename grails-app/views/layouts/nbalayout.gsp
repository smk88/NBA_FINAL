
<html>
    <head>
        <meta http-equiv='cache-control' content='no-cache'>
        <meta http-equiv='expires' content='0'>
       
        <meta http-equiv="X-UA-Compatible" content='IE-edge'>
        <meta name="viewport" content="width-device-width, intial-scale-1">
        
        <g:javascript library="jquery"/>
    <style type="text/css">
            .SettingImage{
            max-height: 20px;
            max-width: 20px;
            height: 20px;
            width: 20px;
            }
            
            .SettingImage2{
            max-height: 16px;
            max-width: 16px;
            height: 16px;
            width: 16px;
            }

            .SettingText {
            color: white;
            font-size: 55%;
            text-align: left; 
            }
            
             .SettingText2 {
            color: white;
            font-size: 45%;
            text-align: left; 
            }

            .button{
            float: right; 
            height: 106.3px;
            width: 140px; 
            }

            .button:hover {
            background-color: #34495E;
            }

            .button ul{
            display : none;
            }

            .button ul li {
                list-style-type: none; 
                text-align: left;
                height:20px; 
                padding-left: 10px;
                margin-top: -10px; 
                padding-bottom: 45px;
            }
            
            .button:hover ul{
                display :  inline-block;
            }
            
            ul#SettingLI li a:hover{
            color: white; 
            }

        </style>

        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'bootstrap.min.css')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery.min.js')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery-ui.min.js')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'bootstrap.min.js')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'global.css')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'w3.css')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'font-awesome.min.css')}">
       <g:layoutHead/>
       <r:layoutResources /> 
       
    
       
    </head>
        
    <body>
        
        <%
            response.setHeader("Cache-Control","no-cache, no-store");
            response.setHeader("Expires","-1");
        %>
        <div id="header">
            <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >	

            <div class="button">
                <a href="#">
                    <img class ="SettingImage" src = "${resource(dir: 'images', file: 'user168.png')}" alt="vitlogo" >
                    <span class = "SettingText">Hello,&nbsp;${session.user}</span>
                    
                </a>

                <ul id = "SettingLI">
                    <li><a class = "SettingText2" href = "/NBA_VIT/employeeHome/changepassword"><img class ="SettingImage2" src = "${resource(dir: 'images', file: 'key.png')}">&nbsp;&nbsp;&nbsp;Reset Password</a></li>
                    <li><g:link class = "SettingText2" controller="Login" action="logout"> <img class ="SettingImage2" src = "${resource(dir: 'images', file: 'logout.png')}">&nbsp;&nbsp;&nbsp;Logout</g:link></li>
                </ul>
            </div>					
            <p> Vishwakarma Institute Of Technology, Pune </br><small id ="header1">NBA Software</small></p>
        </div>

<!-- <div id = "containerBand">
        
</div>-->  

            <!--<div id = "container">
                <div class = "sidebar">
                    <ul id = "sideBarList"> 

                   
                </ul>
            </div>

            <div class = "content">
             
                      
                
       
        
            </div>
        </div>    -->  
        <g:layoutBody/>
        
        <g:javascript library="application"/>
    <r:layoutResources />
    
        <div id = "footer" >
            <div class = "logo"> 
                <a href = "#"> <small>@Credits NBA Software Team</small></a>
            </div> 
        </div> 
        
    </body>
    
</html>


