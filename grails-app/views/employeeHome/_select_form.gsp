<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>
<div class="label label-success col-lg-12" style="font-size: 1em">Create CO's</div>  <br><br> 
 <div class="w3-container w3-large">
<g:select id="course" name="course.id" from="${session.courses}" optionKey="id" required="" noSelection="['':'-Select course-']" value="${COInstance?.course?.id}" class="many-to-one" onchange="${remoteFunction(controller:'CO', action:'myudpateFunction',params:'\'id=\' + (this.value)', update:'newContent1', onSuccess:'myFun()')}" /> 
<br><br>
<div id="newContent1">
                   
</div>
</div>