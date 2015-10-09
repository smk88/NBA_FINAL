<%@ page import="nba_vit.PEO" %>


<table class="table" class="table table-striped" >    
    <tbody>
        <tr >
    <div class="fieldcontain ${hasErrors(bean: PEOInstance, field: 'peo_code', 'error')} ">
        <td class="col-md-3"> <label for="peo_code">
                <g:message code="PEO.peo_code.label" default="Program Education Objective(PEO) No." />

            </label> </td>
        <td> <g:textField class="form-control input-md" name="peo_code" value="${PEOInstance?.peo_code}"/></td>
    </div>
</tr>
<tr>
<div class="fieldcontain ${hasErrors(bean: PEOInstance, field: 'peo_Statement', 'error')} ">
    <td class="col-md-3"><label for="peo_Statement">
            <g:message code="PEO.peo_Statement.label" default="Program Education Outcome" />

        </label></td>
    <td><g:textField class="form-control input-md" name="peo_Statement" value="${PEOInstance?.peo_Statement}"/></td>
</div>
</tr>
<tr>
<div class="fieldcontain ${hasErrors(bean: PEOInstance, field: 'program', 'error')} required">
    <td class="col-md-3"><label for="program">
            <g:message code="PEO.program.label" default="Program" />
            <span class="required-indicator">*</span>
        </label></td>
    <td> <g:select class="form-control input-md" id="program" name="program.id" from="${nba_vit.Program.findByName(session.program)}" optionKey="id" required="" value="${PEOInstance?.program?.id}" class="many-to-one"/></td>
</div>
</tr>
<tr>
    <td></td><td> <g:submitButton class="form save btn btn-info btn-md" name="create" value="create"> Create PEO</g:submitButton></td>
    <tr>
    <tbody>
</table>
