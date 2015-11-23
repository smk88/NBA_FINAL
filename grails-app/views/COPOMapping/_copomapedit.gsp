<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

    
<g:form class="form-horizontal text-justify" role="form" url="[action:'AddCOPO',controller:'COPOMapping']">
<table name='dt' border="1" >
  <tr>
      <th></th>
   <g:each in="${pos}" status = "i" var="p">  
            <th title="PO Statement: ${postt[i]}">${p}</th>
          </g:each>
          
            <g:each in ="${cos}" status = "i" var="c">
            <tr>
            <td title="CO Statement: ${costt[i]}">${c}</td>
                <g:each in="${pos}" status = "ii" var="p"> 
                <td><input name="copo" type="text" class="form-control input-md" id="copo" placeholder="0/1/2/3"></td>
                </g:each>    
                </tr>
            </g:each>
          
   </tr>
   </table>
   <g:submitButton name="Edit" value="Edit CO-PO Map" <a class="btn btn-info btn-md" ></a> </g:submitButton>
   </g:form>
   
