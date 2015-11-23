<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->
<!-- [coursecode:coursecode,coursename:coursename,course_type:course_type,year:year,teacher_div:teacher_div,dept_name:dept_name,exam:exam] -->
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <g:if test="${entry_type_list=='Question-wise'}">
            <title>Questionwise Marks Entry</title>
        </g:if> 
        <g:if test="${entry_type_list=='CO-wise'}">
            <title>CO-wise Marks Entry</title>
        </g:if>                
    </head> 
    <body> 
        <div id = "container">
           <!-- <div class = "sidebar">
                <ul id = "sideBarList"> 


                </ul>
            </div>  -->

            <div class = "content1">

                <table class="w3-table w3-bordered w3-card-2 w3-tiny">
                    <tr>
                        <td>Course Code:</td><td><g:field class="" type="text" name="coursecode" value="${coursecode}" readonly="readonly" />&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>Course Name:</td><td><g:field size="80%" type="text" name="coursename" value="${coursename}" readonly="readonly" />&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>Course Type:</td><td><g:field type="text" name="course_type" value="${course_type}" readonly="readonly" /> &nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>Max. Marks:</td><td><g:field type="text" name="mark_list" value="${mark_list}" readonly="readonly" /> &nbsp;&nbsp;&nbsp;&nbsp;</td>              
                    </tr>  
                    <tr>
                        <td>Year:</td><td><g:field type="text" name="year" value="${year}" readonly="readonly" />&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>Division:</td><td><g:field type="text" name="teacher_div" value="${teacher_div}" readonly="readonly" />&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>Exam Type:</td><td><g:field type="text" name="exam" value="${exam}" readonly="readonly" /> &nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>BOS:</td><td><g:field type="text" name="dept_name" value="${dept_name}" readonly="readonly" /> &nbsp;&nbsp;&nbsp;&nbsp;</td>              
                    </tr>                     
                </table>   

                <b>Course Outcome List</b>       
                <g:each in="${co_list}" var="c" status="j">
                    <ul class="w3-ul w3-tiny">
                        <li>
                            ${co_list[j]}
                        </li>
                    </ul>
                </g:each>
                
                <div style="max-height: 45%; max-width: 100%; margin-left: 1%; overflow-x: scroll; overflow-y: scroll">
                    <g:form class="text-justify" role="form" url="[action:'storeMarks',controller:'EmployeeHome']">

                        <table class="table table-bordered table-condensed table-responsive table-hover" name='dt' >
                           <thead >
                            <tr class="info">
                                <g:each in="${listOfLists[0]}" var="c" status="j">            
                                    <th ><g:field class="w3-input w3-small w3-light-grey" type="text" name="mathead" id="{0+${j}" value="${listOfLists[0][j]}" readonly="readonly" /></th>
                                    </g:each>            
                            </tr>
                            </thead>
                            <g:if test="${split=='yes'}">
                                <tr>
                                    <g:each in="${listOfLists[1]}" var="c" status="j">            
                                        <g:field class="w3-input w3-small" type="hidden" name="mathead" id="{1+${j}" value="${listOfLists[1][j]}" readonly="readonly" />
                                    </g:each>            
                                </tr> 
                            </g:if>
                            <g:if test="${split=='no'}">
                                <tr>
                                    <g:each in="${listOfLists[1]}" var="c" status="j">            
                                        <th><g:field class="w3-input w3-small" type="text" name="mathead" id="{1+${j}" value="${listOfLists[1][j]}" readonly="readonly" /></th>
                                        </g:each>            
                                </tr> 
                            </g:if>        
                            <g:if test="${co_list.size()!=0}">      
                                <g:set var="x" value="${row}"/> 
                                <g:set var="index" value="${0}"/>                                             
                                <g:set var="static_col_size" value="${static_col_size}"/>
                                <g:each in="${(2..x).toList()}" var="i" status="d">              
                                    <tr>            
                                        <g:each in="${listOfLists[i]}" var="c" status="j"> 
                                            <g:if test="${j<static_col_size}">                
                                                <td><g:field class="w3-input w3-small" type="text" name="matdata" id="${index++}" value="${listOfLists[i][j]}" readonly="readonly" /></td> 
                                            </g:if>
                                            <g:else>                    
                                                <g:if test="${j==listOfLists[i].size()-1}">
                                                    <g:if test="${split=='yes'}">
                                                        <td><g:textField class="w3-input w3-small" name="matdata" id="${index++}" value="${listOfLists[i][j]}" /></td>                              
                                                    </g:if>
                                                    <g:if test="${split=='no'}">   
                                                        <td><g:field class="w3-input w3-small" type="text" name="matdata" id="${index++}" value="${listOfLists[i][j]}" readonly="readonly" /></td> 
                                                    </g:if>
                                                </g:if>
                                                <g:else>
                                                    <g:if test="${split=='yes'}">
                                                    </g:if>
                                                    <g:else>
                                                        <td><g:textField class="w3-input w3-small" name="matdata" id="${index++}" value="${listOfLists[i][j]}" /></td>  
                                                    </g:else>
                                                </g:else>
                                            </g:else>   

                                        </g:each>   
                                    </tr>                    
                                </g:each>     
                            </g:if>
                        </table>           


                    </g:form>
                </div>
                <center><g:submitButton name="save" <a style="width:10%" class="btn btn-info btn-sm" ></a> </g:submitButton></center>
                </div>
            </div>


    </body>
</html>
