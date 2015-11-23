<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>
<div class="label w3-blue-grey col-lg-12" style="font-size: 1em">Create PO's</div>  <br><br> 
<div class="w3-container w3-large">
<g:select id="program" name="programID" from="${session.programs}" noSelection="['':'-Select Program-']" optionKey="id" required="" value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(controller:'PO', action:'setProgram',params:'\'id=\' + (this.value)', update:'newContent1')}" /> 
<br><br>
<div id="newContent1">
        <!--  This will be replaced by new Content -->
</div>
</div>