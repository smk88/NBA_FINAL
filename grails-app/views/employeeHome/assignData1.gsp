<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->
<div id="assigncoursecoord">   
                <g:formRemote name="assignForm" url="[controller:'EmployeeHome', action:'assignData']" update="assigncoursecoord">
                    <div class="table-responsive">
                            <table class="table table-bordered">
                                <tr class="info">
                                    <th style="text-align: center; width: 50%" >Select Employee</th>
                                    <th style="text-align: center; width: 50%">Select Course</th>
                                </tr>
                                <tr class="warning">
                                    <td style="text-align: center" >
                                        <g:select style="background-color:#ecf0f1"  name="emp_list" from="${emp_list}" />
                                    </td>
                                    <td style="text-align: center" >
                                        <g:select class="selectpicker" style="background-color:#ecf0f1" name="course_list" from="${crs}"/>
                                    </td>
                                    <tr>
                                        <td><td style="text-align: center">
                                           <g:link action="toLink"> 
                                           <input type="button" value="Add To List" /> 
                                           </g:link>
                                           </tr></td></td>
                                   <tr> <td> </td>
                                    <td style="text-align: center" >
                                        <g:submitButton class="btn btn-warning" name = "Allocate" onclick = "Successfunc();">
                                    </td> </td>
                            </table>
                        </div>
                    </g:formRemote> 
                
                </div>
            </div>   
            
            <script>
                
                fucntion Successfunc() {
                alert("aaaa"); 
                }
            </script>