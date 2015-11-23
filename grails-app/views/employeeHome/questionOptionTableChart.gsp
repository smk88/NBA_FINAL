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
                <center>
                <b>Course Code:</b>${session.coursecode} &nbsp;&nbsp;&nbsp;<b>Course Name:</b>${session.coursename}
                </center>                
                <g:form class="form-horizontal text-justify" role="form" url="[action:'storequestionCOMap',controller:'EmployeeHome']">
                    <div class="table-responsive">
                    <g:set var="x" value="${session.noq}"/>                      
                    <g:set var="index" value="${0}"/>  
                    <g:set var="ans" value="${0}"/>  
                        <table class="table table-bordered">
                            <tr class="info">
                                <th style="text-align: center; width: 50%">Question No.</th>
                                <th style="text-align: center; width: 50%">Suboption</th>
                                <g:each in="${session.final_co_list}" var="i" status="d">                                                                        
                                    <th style="text-align: center; width: 50%"> ${i}(${session.co_weight_list[ans]}) </th>                                                                        
                                </g:each>    
                            </tr>           
                            <g:each in="${(1..x).toList()}" var="i" status="d"> 
                                  <g:each in="${listOfLists[i]}" var="e" status="j">
                                    <tr class="info">
                                     <td>${i}</td><td>${listOfLists[i][j]}</td>
                                        <g:each in="${session.final_co_list}" var="k" status="f">                                                                                      
                                        <td><g:textField name="data" id="${index++}" value="" /></td>                                        
                                        </g:each>                                         
                                    </tr>
                                    </g:each>                            
                            </g:each> 
                                <tr>
                                    <td>COwise</td>
                                    <td>Total</td>     
                                <g:each in="${session.final_co_list}" var="i" status="d">                                                                        
                                    <td><g:field type="text" name="questionwisetotal" id="i" value="" readonly="readonly" /></td>                                       
                                </g:each>    
                                </tr>
                        </table>                        
                        <center>
                             <g:submitButton name="save" <a class="btn btn-info btn-md" ></g:submitButton>
                        </center>                          
                     </div>
                 </g:form>        
            </div>
        </div>        
    </body>
</html>
