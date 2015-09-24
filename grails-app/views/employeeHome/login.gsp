<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <title>VIT NBA Software </title> 
    <head>
    <style type="text/css">
     #ss
     {
     font-size:0.6em;
     
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
                    <span id="ss"><i>Bansilal Ramnath Agarwal Charitable Trust's</i> </span></br>
                    Vishwakarma Institute of Technology, Pune</br>
                    <span id="ss"></i>(An Autonomous Institute Affiliated to Savitribai Phule Pune University)</i></span><br>
			</div>
                        <div class = "homeContent">
	<form class="form-horizontal text-justify" role="form">
            
                 <div align="center">
                        <h1 id ="header1"> National Board of Accreditation <br>Software</h1>
                 </div>
<table class="table" class="table table-striped">
        <tbody>
      <tr>
        <td>
          <label for="username" class="control-label">USERNAME</label>
        </td>
        <td> <input type="email" class="form-control input-md" id="inputusername" placeholder="username">
        </td>
        
      </tr>
      <tr>
        <td> <label for="inputPassword3" class="control-label">PASSWORD</label></td>
        <td><input type="password" class="form-control input-md" id="inputPassword3" placeholder="Password"></td>
        
      </tr>
      <tr>
        <td>
        </td>
        <td><div class="checkbox">
                     <label>
                      <input type="checkbox">Remember me</label>
                  </div></td>
        
      </tr>
      <tr>
        <td> </td>
        <td> <a class="btn btn-info btn-md">Sign in</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/NBA_VIT/login/forgotpassword" class="btn btn-info btn-md" value="ForgotPassword">Forgot Password</a></td>       
      </tr>
    </tbody>
  </table>
                    
            </form>	
			</div>
                       <div id = "footer" >
				<div class = "logo"> 
					<a href = "#"> <small>@Credits NBA Software Team</small></a>
				</div> 
			</div>   

</body></html>