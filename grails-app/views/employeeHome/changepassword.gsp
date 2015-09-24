<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <h1>Sample line</h1>
        <g:form class="form-horizontal text-justify" role="form" url="[action:'resetpassword',controller:'EmployeeHome']">
         <!-- <form name="changepassword" action="xyz" method="POST"> -->           
            New Password:<g:textField name="newpwd" value="" />
            </br></br>
            Confirm Password:<g:textField name="confpwd" value="" />
            </br></br>
           <!-- <input type="submit" value="change" />  -->
            <g:submitButton name="Change" <a class="btn btn-info btn-md" ></a> </g:submitButton>
        </g:form>
    </body>
</html>
