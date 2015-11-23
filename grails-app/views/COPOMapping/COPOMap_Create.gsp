<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
     <meta name="layout" content="nbalayout"/>



<div id = "container">
            
                    
           
              <div class="content1">  
                
             <g:form class="form-horizontal text-justify" role="form" url="[action:'AddCOPO',controller:'COPOMapping']">
             <input   name="prog_name" type="text" class="form-control input-md" id="course_name" value="${progname}" readonly>
<table name='dt' border="1" class="table table-bordered" >
    
  <tr>
      <th ><input   name="course_name" type="text" class="form-control input-md" id="course_name" value="${crsname}" readonly></th>
   <g:each in="${pos}" status = "i" var="p">  
   <th align-text  ="center" title="PO Statement:&#013;${postt[i]}">PO${p}</th>
          </g:each>
          
            <g:each in ="${cos}" status = "i" var="c">
            <tr>
            <td align="center" class="col-lg-1" title="CO Statement: ${costt[i]}"><b>CO${c}</b></td>
                <g:each in="${pos}" status = "ii" var="p"> 
                <td><input  name="copo" type="text" class="form-control input-md" id="copo" placeholder="[0-3]"></td>
                </g:each>    
                </tr>
            </g:each>
          
   </tr>
   </table>
   <g:submitButton name="Add" value="Add CO PO" <a class="btn btn-info btn-md center-block" ></a> </g:submitButton>
   </g:form>
                      <br>
                      <br>
                
       
        </div>
            
        </div>    


   
