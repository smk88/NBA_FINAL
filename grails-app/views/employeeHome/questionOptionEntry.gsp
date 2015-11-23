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
                <center>
                <b>Course Code:</b>${session.coursecode} &nbsp;&nbsp;&nbsp;<b>Course Name:</b>${session.coursename}
                </center>                

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                </ul>
            </div>
            <div class = "content">
                <g:form class="form-horizontal text-justify" role="form" url="[action:'questionOptionTableChart',controller:'EmployeeHome']">
                    <div class="table-responsive">
                    <g:set var="x" value="${session.noq}"/>        
                        <table class="table table-bordered">
                            <tr class="info">
                                <th style="text-align: center; width: 50%">Question No.</th>
                                <th style="text-align: center; width: 50%">Select Number of Suboptions</th>
                            </tr>                            
                            <g:each in="${(1..x).toList()}" var="i" status="d">                                          
                            <tr class="warning">
                              <!--  <td><g:field type="text" name="questionhead" id="${i}" value="Q.${i}" readonly="readonly" /></td>  -->
                                <td>Q.${i}</td>
                                <td style="text-align: center"><g:select style="background-color:#ecf0f1" name="selected_option_list" from="${session.question_list}"/></td>
                            </tr> 
                            </g:each> 
                            </table>
                            </br></br>
                             <center>
                             <g:submitButton name="Proceed" <a class="btn btn-info btn-md" ></a> </g:submitButton>
                             </center>
                          
                        </div>
                </g:form>       
            </div>
        </div>        
    </body>
</html>
      <!-- [coursecode:coursecode,coursename:coursename,co_list:co_list,co_weight_list:co_weight_list,final_co_list:final_co_list]   -->   
