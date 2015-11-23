<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="nbalayout"/>
        <title>Course Outcome to Assessment Mapping</title>
    </head>
    <body>
        <div id = "container">
            <div class = "content1">  
                <g:form class="form-horizontal text-justify" role="form" url="[action:'coAssesmentMap',controller:'EmployeeHome']">

                    <table class="table table-condensed table-bordered table-responsive">
                        <tr class="danger">
                            <th class="col-md-1" >Select Course</th></tr>
                        <tr>
                            <td class="col-lg-1 warning"><g:select style="background-color:#ecf0f1" name="course_list" from="${course_list}"/></td>
                            <td class="col-lg-1 warning"><g:submitButton name="ok" class="btn btn-block btn-info active btn-sm" > </g:submitButton></td>
                                <td class="primary"></td>
                            </tr>              
                        </table>

                </g:form>
                <div style="overflow-y: scroll; max-height: 50%; max-width: 100%">
                <div class="w3-blue-grey col-lg-12" style="font-size: 1.2em; text-align: center">CO to Assessment Mapping</div>
               
                    <table class="table table-bordered">
                        <thead>
                        <td><b>CO/Assesment</b></td>
                        <td><b>HA1</b></td>
                        <td><b>HA2</b></td>
                        <td><b>HA3</b></td>
                        <td><b>HA4</b></td>
                        <td><b>HA5</b></td>
                        <td><b>CT</b></td>
                        <td><b>MSE-1</b></td>
                        <td><b>MSE-2</b></td>
                        <td><b>Tut</b></td>
                        <td><b>Lab</b></td>
                        <td><b>Theory</b></td>
                        <td><b>Total</b></td>
                        </thead>    
                        <tbody>
                            <tr>
                                <td>CO1</td>
                                <td>Smith</td> 
                                <td>50</td>
                                <td>Smith</td> 
                                <td>50</td>
                                <td>Smith</td> 
                                <td>50</td>
                                <td>Smith</td> 
                                <td>50</td>
                                <td>Smith</td> 
                                <td>50</td>
                                <td>Smith</td> 
                                <td>Smith</td>         
                            </tr>  
                        </tbody>
                    </table>     
                </div>
            </div>
        </div>
    </body>
</html>
