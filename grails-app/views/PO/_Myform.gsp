<%@ page import="nba_vit.PO" %>




<div class="w3-card-2" style="width: 90%">

    <g:formRemote url="[controller:'PO', action:'savePO']" method="post" name="remoteCreateCOForm" update="newContent" onComplete="displayMsg()" >

        <table class="table table-responsive table-hover table-bordered">
            <tr> <td class="col-lg-1">
            <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_code', 'error')} ">
                <label for="po_code">
                    <g:message code="PO.po_code.label" default="Po Code:"  />

                </label> </td><td class="col-lg-11">
                <g:textField class="w3-input" name="po_code" value="${session.count}" readonly="readonly"/>
            </div></td></tr>

<!--    <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'is_current', 'error')} ">
        <label for="is_current">
            <g:message code="PO.is_current.label" default="Is Current" />

        </label>
        <g:checkBox name="is_current" value="${POInstance?.is_current}" />
    </div>

    <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'is_lock', 'error')} ">
        <label for="is_lock">
            <g:message code="PO.is_lock.label" default="Islock" />

        </label>
        <g:checkBox name="is_lock" value="${POInstance?.is_lock}" />
    </div>-->
         <tr > <td class="col-lg-1">
            <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'po_statement', 'error')} ">
                <label for="po_statement">
                    <g:message code="PO.po_statement.label" default="Postatement:" />

                </label></td><td class="col-lg-11">
                <g:textArea class="w3-input" name="po_statement" value="${POInstance?.po_statement}" required="true"/>
            </div></td></tr>
            <!--
            <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'program', 'error')} required">
                    <label for="program">
                            <g:message code="PO.program.label" default="Program" />
                            <span class="required-indicator">*</span>
                    </label>
                    <g:select id="program" name="program.id" from="${nba_vit.Program.list()}" optionKey="id" required="" value="${POInstance?.program?.id}" class="many-to-one"/>
            </div>
            -->
                <tr ><td class="col-lg-1">
            <div class="fieldcontain ${hasErrors(bean: POInstance, field: 'revision_year', 'error')} ">
                <label for="revision_year">
                    <g:message code="PO.revision_year.label" default="Revisionyear:" />

                </label></td><td class="col-lg-11">
                <g:textField class="w3-input" name="revision_year" value="${session.ay}" readonly="readonly"/>
            </div></td></tr>
             <tr ><td> </td>  <td class="col-lg-1">
            <g:submitButton name="create" class="btn w3-btn w3-blue-grey btn-md active" value="${message(code: 'default.button.create.label', default: 'Create')}" />
            </td></tr>
        </table>
    </g:formRemote>              

</div>