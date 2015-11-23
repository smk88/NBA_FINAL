<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <title>VIT NBA Software </title> 
    <head>

        <script src="/NBA_VIT/static/plugins/jquery-1.10.2/js/jquery/jquery-1.10.2.min.js" type="text/javascript"></script>

        <style type="text/css">
            #ss
            {
            font-size:0.6em;
            }
        </style>
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'bootstrap.min.css')}">
        <!--<link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery.min.js')}">-->
        <!--<link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery-ui.min.js')}">-->
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'bootstrap.min.js')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'global.css')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'w3.css')}">
    </head>

    <body onbeforeunload="changeHashOnLoad();" onpageshow="if (event.persisted) noBack();" >
        <div id="header">
            <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >	
            <span id="ss"><i>Bansilal Ramnath Agarwal Charitable Trust's</i> </span></br>
            Vishwakarma Institute of Technology, Pune</br>
            <span id="ss"></i>(An Autonomous Institute Affiliated to Savitribai Phule Pune University)</i></span><br>
        </div>
        <div class = "homeContent">
            <g:form class="form-horizontal text-justify" role="form" url="[action:'find',controller:'Login']">

                <div align="center">
                    <h1 id ="header1"> National Board of Accreditation <br>Software</h1>
                </div>
                <br>
                <table class="table table-responsive">
                    <tbody>
                        <tr >
                            <td >
                                <label for="username" class="control-label">USERNAME</label>
                            </td>
                            <td> <input name="username" type="text" class="form-control input-md" id="inputusername" placeholder="username">
                            </td>

                        </tr>
                        <tr>
                            <td> <label for="inputPassword3" class="control-label">PASSWORD</label></td>
                            <td><input name="pwd" type="password" class="form-control input-md" id="inputPassword3" placeholder="Password"></td>

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
                            <td></td>
                            <td > <g:submitButton name="Login" value="Login" <a class="btn w3-btn w3-blue-grey btn-md active" style="width:32%"></g:submitButton>
                                &nbsp;&nbsp;&nbsp;
                                <g:submitButton name="Forgot" value="Forgot Password" <a class="btn w3-btn w3-blue-grey btn-md active"></g:submitButton> </td>
                            </tr>
                        </tbody>
                    </table>

            </g:form>	
        </div>
        <div id = "footer" >
            <div class = "logo"> 
                <a href = "#"> <small>@Credits NBA Software Team</small></a>
                <span align ="right"><g:link controller="Login" action = "customerQuery" <a href = "#"> &nbsp;Any Query Please follow this link</a></g:link></span>
                </div> 
            </div>   

    </body>
    <script>
        $(function () {
        for (i = 0; i < history.length; i++)
        {
        history.pushState({ page: i + 1 }, "title 1", "");
        }
        })
    </script>
</html>