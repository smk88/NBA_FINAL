<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESE Question Paper to Course Outcome Mapping</title>
    </head>


    <body>

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                </ul>
            </div>
            <div class = "content">
                <g:form class="form-horizontal text-justify" role="form" url="[action:'questionEntry',controller:'EmployeeHome']">
                    <div class="table-responsive">
                        <table class="table table-bordered">
                            <tr class="info">
                                <th style="text-align: center; width: 50%">Select Course</th></tr>
                            <tr class="warning">
                                <td style="text-align: center"><g:select style="background-color:#ecf0f1" name="course_list" from="${course_list}"/></td>
                                <td><g:submitButton name="ok" <a class="btn btn-info btn-md" ></a> </g:submitButton></td>
                                </tr>              
                            </table>
                        </div>
                </g:form>       
            </div>
        </div>
    </body>
</html>
