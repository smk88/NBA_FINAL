<html>
    <head>
    <meta name="layout" content="nbalayout"/>
    </head> 
    <body>

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 

                   
                </ul>
            </div>

            <div class = "content">
             
    <form>
                <div class="table-responsive">
         <table class="table table-bordered">
             <tr class="info">
          <th style="text-align: center; width: 50%" >Select Employee</th>
          <th style="text-align: center; width: 50%">Select Course</th></tr>
          <tr class="warning">
              <td style="text-align: center" ><g:select style="background-color:#ecf0f1" name="emp_list" from="${emp_list}" /></td>
              <td style="text-align: center"><g:select style="background-color:#ecf0f1" name="course_list" from="${course_list}"/></td>
              <td> <input type="button" name="Click" class="bg-danger"> </button></td>
          </tr>
              
        </table>
        </div>
                    
    </form>                        
                
       
        
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
</script>
    </body>

</html>


