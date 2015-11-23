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
                      <g:form class="form-horizontal text-justify" role="form" id = "comp" url="[action:'complainLogs',controller:'Login']">
                <table class="table table-bordered table-responsive">
                    <tbody>
                        <tr>
                            <td style="width:16%">
                                <label for="eid" class="control-label">Employee Code:</label>
                            </td>
                            <td> <input name="eid" type="text" class="form-control" id="id" placeholder="eg. 1148" required>
                            </td>
                          
                        </tr>
                        <tr>
                              <td>
                                <label for="ename" class="control-label">Name:</label>
                            </td>
                            <td > <input name="ename" type="text" class="form-control input-md" id="ename" placeholder="eg. V.R.Chauhan">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="edept" class="control-label">Dept.:</label>
                            </td>
                            <td> <input name="edept" type="text" class="form-control input-md" id="edept" placeholder="eg. Computer">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="emob" class="control-label">Contact No.:</label>
                            </td>
                            <td> <input name="emob" type="text" class="form-control input-md" id="emob" placeholder="eg. 9876543210">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="emial" class="control-label">e-mail id:</label>
                            </td>
                            <td> <input name="email" type="text" class="form-control input-md" id="email" placeholder="eg. xyz@gmail.com">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="pdesp" class="control-label">Suggestion:</label>
                            </td>
                            <td> <textarea rows="2" cols="100%" name="pdesp" id = "pdesp" form="comp" placeholder="Enter text..."></textarea>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="sugg" class="control-label">Problem Description:</label>
                            </td>
                            <td> <textarea rows="2" cols="100%" name="sugg" id = "sugg" form="comp" placeholder="Enter text..."></textarea>
                            </td>
                        </tr>
                        <tr>
                           <!-- <td><g:link controller="Login" action="lastComplainStatus" <a href = "#">Last Complaint</a></g:link> -->
                          
                            <td> <g:submitButton name="Submit" value="Submit" <a class="btn w3-btn w3-blue-grey btn-lg active" ></a> </g:submitButton>  </td>
                            <td> <g:actionSubmit class="btn w3-btn w3-blue-grey btn-lg active" value="Last Complains" action="lastComplainStatus"/>
                            </td>
                        </tr>
                        </tbody>
                    </table>

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
