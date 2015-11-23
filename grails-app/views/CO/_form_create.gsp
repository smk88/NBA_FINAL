<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>



<label for="co_code" >
    <g:message code="CO.co_code.label" default="Cocode:" />
</label>
&nbsp;<g:textField class="w3-input" name="co_code" value="${session.count}" readonly="readonly"/>

<div class="fieldcontain ${hasErrors(bean: COInstance, field: 'co_statement', 'error')} ">
    <label for="co_statement" >
        <g:message code="CO.co_statement.label" default="Costatement:" />
    </label>
    &nbsp;<g:textArea class="w3-input" name="co_statement" value="${COInstance?.co_statement}"/>
</div>
<!--
<label for="is_current">
    <g:message code="CO.is_current.label" default="Iscurrent" />
</label>
<g:checkBox name="is_current" value="${COInstance?.is_current}"  />
<label for="is_lock">
    <g:message code="CO.is_lock.label" default="Islock" />
</label>
<g:checkBox name="is_lock" value="${COInstance?.is_lock}" />  -->
<label for="revision_year" >
    <g:message code="CO.revision_year.label" default="Revisionyear:" />

</label>
&nbsp;<g:textField class="w3-input" name="revision_year" value="${session.academic_year}" readonly="readonly"/>
