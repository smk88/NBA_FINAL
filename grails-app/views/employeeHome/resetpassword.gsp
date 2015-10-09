<html>
    <head>
    <style type="text/css">
            #ss1
            {
            font-size:0.6em;
            padding-right: 0%;
            }
            #ss2
            {
            font-size:0.6em;
            padding-right: 0%;
            }

            .SettingImage{
            max-height: 25px;
            max-width: 25px;
            height: 25px;
            width: 25px;
            }
            
            .SettingImage2{
            max-height: 20px;
            max-width: 20px;
            height: 20px;
            width: 20px;
            }

            .SettingText {
            
            color: white;
            font-size: 60%;
            }
            
             .SettingText2 {
            margin: 0 0 10px 10px;
            color: white;
            font-size: 45%;
            text-align: left; 
            }

            .button{
            float: right; 
            height: 126.3px;
            width: 150px; 
            }

            .button:hover {
            background-color: #6AA4D4;
            
            }

            .button a:hover {
            text-decoration: none;
            }

            .button ul{
            display : none;

            }

            .button ul li {
            display: list-item;
            list-style-type: none; 
            }

            .button:hover ~ #ss2{ padding-right: 0%;}
            
            
            .button:hover ul{
            display : block; 
            }
            
             .button ul li:hover{
            background-color: #71A0C7; 
            }
            
            ul#SettingLI li a:hover{
            color: white; 
            }

        </style>
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'bootstrap.min.css')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery.min.js')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'bootstrap.min.js')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'global.css')}">
    </head>

    <body>
        <div id="header">
            <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >	

            <div class="button">
                <a href="#">
                    <img class ="SettingImage" src = "${resource(dir: 'images', file: 'user168.png')}" alt="vitlogo" >
                    <span class = "SettingText">Hello,&nbsp;${session.user}</span>
                    
                </a>

                <ul id = "SettingLI">
                    
                </ul>
            </div>							
            <p> Vishwakarma Institute Of Technology, Pune </br><small id ="header1">NBA Software</small></p>
        </div>

<!-- <div id = "containerBand">
        
</div>  -->

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 

                    
                </ul>
            </div>

            <div class = "content">
                <g:form class="form-horizontal text-justify" role="form" url="[action:'resetpassword',controller:'Login']">
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

        <div id = "footer" >
            <div class = "logo"> 
                <a href = "#"> <small>@Credits NBA Software Team</small></a>
            </div> 
        </div> 
    </body>

</html>
