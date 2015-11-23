<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<input name="prog_name" type="text" class="form-control input-md w3-blue-grey" id="course_name" style="font-size:1.2em; background:black; color:white;"  value="${programs}:  [${year}]" readonly/>
<!--<div STYLE=" height: 60%; width: 100%; overflow-y: scroll ;overflow-x: scroll ;">-->
<table id="data" class="table table-striped table-bordered" cellspacing="0" width="100%">

    
    <thead>
    <tr class="danger" style="font-size: 0.9em">
        <th>Course_Code</th>
        <th>Course_Name</th>
        <th>Employee_Name</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${Alllist}" status = "i" var="p"> 
       <g:if test="${i%2==0}">
             <tr class="success" style="font-size: .9em">
       </g:if>
       <g:else>
            <tr class="warning" style="font-size: .9em">
       </g:else>
        <g:each in="${p}" status = "li" var="v">  
                  <td align-text  ="center" title=""> ${v}</td>
        </g:each>
       
    </tr>
     </g:each>
   
    
 </tbody>
</table>
  </div>

<script>
        $(document).ready(function(){
            $('#data').after('<div id="nav" align="center" ></div>');
            var rowsShown = 10;
            var rowsTotal = $('#data tbody tr').length;
            var numPages = rowsTotal/rowsShown;
            for(i = 0;i < numPages;i++) {
                var pageNum = i + 1;
                $('#nav').append('<a href="#" rel="'+i+'" ><font size="4">'+pageNum+'</font></a> ');
            }
            $('#data tbody tr').hide();
            $('#data tbody tr').slice(0, rowsShown).show();
            $('#nav a:first').addClass('active');
            $('#nav a').bind('click', function(){
 
                $('#nav a').removeClass('active');
                $(this).addClass('active');
                var currPage = $(this).attr('rel');
                var startItem = currPage * rowsShown;
                var endItem = startItem + rowsShown;
                $('#data tbody tr').css('opacity','0.0').hide().slice(startItem, endItem).
                        css('display','table-row').animate({opacity:1}, 300);
            });
        });
    </script>