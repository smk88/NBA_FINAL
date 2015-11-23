<html>
    <head>
        <title>VIT NBA Software</title>     
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
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'w3.css')}">
    </head>

    <body>
        <div id="header">
            <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >	

            <p> Vishwakarma Institute Of Technology, Pune </br><small id ="header1">NBA Software</small></p>
        </div>
        <div id = "container">
         
            <div class = "content1">
                 <g:form class="form-horizontal text-justify" role="form" id = "comp" url="[action:'complainLogsEdit',controller:'Login']">
                <table name='dt' border="1" class="table table-bordered" >

                <tr>
                    <th>Employee Id</th>
                    <th>Employee Name</th>
                    <th>Department</th>
                    <th>Contact</th>
                    <th>E-mail</th>
                    <th>Problem Description</th>
                    <th>Suggestions (if any)</th>
                    <th>Date</th>
                    <th>Status</th>
                
                </tr>     
                        <g:each in ="${all}" status = "i" var="c">
                    <tr>
                       
                        <td align="left" class="col-lg-1"><input type="text" name="eid" value ="${c.eid}" readonly></td>
                        <td align="left" class="col-lg-1">${c.ename}</td>
                        <td align="left" class="col-lg-1">${c.dept}</td>
                        <td align="left" class="col-lg-1">${c.contact}</td>
                        <td align="left" class="col-lg-1">${c.email}</td>
                        <td align="left" class="col-lg-1">${c.probDescription}</td>
                        <td align="left" class="col-lg-1">${c.suggestion}</td>
                        <td align="left" class="col-lg-1"><input type="text" name="date" value ="${c.Date}" readonly></td>
                        <td align="left" class="col-lg-1"><input type="text" name="status" value ="${c.Status}"></td>
                    </tr>
                </g:each>
                 
                    </table>
                    <g:submitButton name="Submit" value="Submit" <a class="btn btn-info btn-md" ></a> </g:submitButton>
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
