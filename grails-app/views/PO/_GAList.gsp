
<%@ page import="nba_vit.PO" %>
<!DOCTYPE html>

<div id="list-CO" style="max-height: 70%; max-width:80%; margin-left:2% ;overflow-y: scroll ; overflow-x: scroll" role="main">

    <table class="table table-striped" style="width:100%">
        <thead>
            <tr class="success">

                <g:sortableColumn property="po_code" title="${message(code: 'PO.po_code.label', default: 'Pocode')}" />

                <g:sortableColumn property="po_statement" title="${message(code: 'PO.po_statement.label', default: 'Postatement')}" />
                
               <g:sortableColumn property="program" title="${message(code: 'PO.program.label', default : "Program")}" />

               <g:sortableColumn property="is_current" title="${message(code: 'PO.is_current.label', default: 'Iscurrent')}" />

               <g:sortableColumn property="is_lock" title="${message(code: 'PO.is_lock.label', default: 'Islock')}" />

                <g:sortableColumn property="revision_year" title="${message(code: 'PO.revision_year.label', default: 'Revisionyear')}" />

            </tr>
        </thead>
        <tbody>
            <g:each in="${session.pos}" status="i" var="POInstance">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                    <td class="warning"><span class="glyphicon glyphicon-edit"/><g:link action="showGA" id="${POInstance.id}">${fieldValue(bean: POInstance, field: "po_code")}</g:link></td>

                    <td>${fieldValue(bean: POInstance, field: "po_statement")}</td>

                    <td>${fieldValue(bean: POInstance, field: "program")}</td>

                    <td><g:formatBoolean boolean="${POInstance.is_current}" /></td>

                    <td><g:formatBoolean boolean="${POInstance.is_lock}" /></td>


                    <td>${fieldValue(bean: POInstance, field: "revision_year")}</td>

                </tr>
            </g:each>
        </tbody>
    </table>

</div>
