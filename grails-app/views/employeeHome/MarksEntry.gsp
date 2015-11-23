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
        <title>Marks Entry</title>
    </head>
    <body>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 


                </ul>
            </div>

            <div class = "content">

                <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">Select Course and Division for Marks Entry</div>  <br><br> 
                <g:form class="form-horizontal text-justify" role="form" url="[action:'processMarksEntry',controller:'EmployeeHome']">
                    
                        <div class="table-responsive">               
                        <table class="table  w3-table ">
                           
                            <tr class="warning">
                                <td> Course:</td><td><g:select class="w3-select w3-light-grey " style="background-color:#ecf0f1" name="course_list" from="${course_code_name_list}"/></td> 
                                <td>&nbsp;&nbsp;&nbsp;Division:</td><td ><g:select class="w3-select w3-light-grey" style="background-color:#ecf0f1" name="div_list" from="${teacher_div_combined_list}"/></td>
                            </tr>  
                            <tr class="warning">
                                <td >Assessment Method:</td><td ><g:select class="w3-select w3-light-grey" style="background-color:#ecf0f1" name="evaluation_method_list" from="${evaluation_method_list}"/></td>             
                                <td>&nbsp;&nbsp;&nbsp;Entry Type:</td><td ><g:select class="w3-select w3-light-grey" style="background-color:#ecf0f1" name="entry_type_list" from="${entry_type_list}"/></td>             
                            </tr>
                            <tr class="warning">
                                <td>Academic Year:</td><td ><g:select class="w3-select w3-light-grey" style="background-color:#ecf0f1" name="Academic Year" from="${academic_year_list}"/></td>             
                                <td>&nbsp;&nbsp;&nbsp;Semester:</td><td ><g:select class="w3-select w3-light-grey" style="background-color:#ecf0f1" name="semester" from="${semester_list}"/></td>             
                            </tr>                                                        
                            </table></div>
                <center> <td><g:submitButton name="Enter Marks" <a class="btn btn-info btn-md" ></a> </g:submitButton></td>   </center>                                                                                 
                </g:form>


            </div>
        </div>


    </body>
</html>
