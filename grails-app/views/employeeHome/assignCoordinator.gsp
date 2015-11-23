<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <g:javascript library="jquery"/>
        
          <script>
            function displayMsg()
            {
                alert("Record inserted successfully");
                
            }
        </script>
    </head> 
    <body>

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                       
                </ul>
            </div>

            <div class = "content">

                <div id="courselist">
                    <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em">Assign Course-COrdinator</div>  <br><br> 
                    <g:formRemote name="assignForm" url="[controller:'EmployeeHome', action:'fetchData']" update="courselist">
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


