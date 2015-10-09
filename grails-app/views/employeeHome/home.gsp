<html>
    <head>
         <meta name="layout" content="nbalayout"/>
    </head>
<body>
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

        
    </body>

</html>