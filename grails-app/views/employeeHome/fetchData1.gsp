<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <g:javascript library="jquery"/>
    </head> 
    <body>

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                 <!--   <li><g:link controller="EmployeeHome" action="assignCoordinator" <a href = "#"><img src = "${resource(dir: 'images', file: 'assign_coordinator.png')}">&nbsp;Assign Course Coordinators</a></g:link></li>
                    <li><g:link controller="EmployeeHome" action="viewallotment" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View Allotment </a></g:link></li>
                    <li><g:link controller="EmployeeHome" action="create" > <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO/PEO/GA </a></g:link></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View CO/PO/PEO/GA Mappings</a></li>
                    <li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;&nbsp;View CO attainment of Course</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'student.png')}">&nbsp;Student Attainment of CO</a></li>
                    <li><g:link controller="EmployeeHome" action="drawGraph" <a href = "#">  <img src = "${resource(dir: 'images', file: 'attain.png')}">&nbsp;&nbsp;Attainment of PO/CO/PEO/GA of Courses
                            </a></g:link></li>    
                    -->
                </ul>
            </div>

            <div class = "content">
       
                <div id="courseDataFetch">
               <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">View Course-COrdinator</div>  <br><br>
                    <g:formRemote name="assignForm11" url="[controller:'EmployeeHome', action:'courseInfo']" update="courseDataFetch">
                        <div class="table-responsive">
                            <table class="table table-bordered">
                                <tr class="info">
                                    <th style="text-align: center; width: 50%" >Select Program</th>
                                    <th style="text-align: center; width: 50%">Select Year</th></tr>
                                </tr>
                                <tr class="warning">
                                    <td style="text-align: center" >
                                        <g:select style="background-color:#ecf0f1" name="programs" from="${programs}" />
                                    </td>
                                  
                                    <td style="text-align: center" >
                                        <g:select class="selectpicker" name="year" from="${year}" />
                                    </td>
                                    
                                    <tr> <td> </td>
                                    <td style="text-align: center" >
                                        <g:submitButton  class="btn btn-success" name = "fetch"/></tr>
                                    </td> </td>
                            </table>
                              <div id="assigncoursecoord"> 
                    
                        </div>
                    </g:formRemote>  

                </div>
            </div>    
            </div>
            <script type="text/javascript">
                $(document).ready(function() {
                $("button").click(function(){
                var employee_list = [];
                $.each($(".country option:selected"), function(){            
                countries.push($(this).val());
                });
                alert("You have selected the country - " + employee_list.join(", "));
                });
                });
                function displayList()
                {
                alert("Hi alan");
                }
            </script>
    </body>

</html>


