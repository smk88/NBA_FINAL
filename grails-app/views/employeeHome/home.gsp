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

                    <g:each in="${session.roleLink}" status="i" var="role" >
                        <li> <a href="/NBA_VIT/employeeHome/${role}"><img src = "${resource(dir: 'images', file: 'resetpasswd.png')}">&nbsp;${session.roleText[i]}</a></li>
                    </g:each>
                </ul>
            </div>

            <div class = "content">
                SOME CONTENT
            </div>
        </div> 

        <div id = "footer" >
            <div class = "logo"> 
                <a href = "#"> <small>@Credits NBA Software Team</small></a>
            </div> 
        </div> 
    </body>

</html>