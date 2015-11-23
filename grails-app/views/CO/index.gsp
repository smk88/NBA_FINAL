
<%@ page import="nba_vit.CO" %>
<!DOCTYPE html>



<div id="list-CO" role="main" >
    <table class="table table-striped" style="width:100%" id="data">
        <thead>
            <tr class="success" >
                <g:sortableColumn property="co_code" title="${message(code: 'CO.co_code.label', default: 'Cocode')}" />

                <g:sortableColumn property="co_statement" title="${message(code: 'CO.co_statement.label', default: 'Costatement')}" />

                                <!--<th class="success"><g:message code="CO.course.label" default="Course" /></th>-->

                <g:sortableColumn property="course" title="${message(code: 'CO.course.label', default: 'Course')}" />
                <g:sortableColumn property="is_current" title="${message(code: 'CO.is_current.label', default: 'Iscurrent')}" />

                <g:sortableColumn property="is_lock" title="${message(code: 'CO.is_lock.label', default: 'Islock')}" />

                <g:sortableColumn property="revision_year" title="${message(code: 'CO.revision_year.label', default: 'Revisionyear')}" />

            </tr>
        </thead>
        <tbody>
            <g:each in="${COInstanceList}" status="i" var="COInstance">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                    <td class="warning"><g:link action="show" id="${COInstance.id}">${fieldValue(bean: COInstance, field: "co_code")}</g:link></td>

                    <td>${fieldValue(bean: COInstance, field: "co_statement")}</td>

                    <td>${fieldValue(bean: COInstance, field: "course")}</td>

                    <td><g:formatBoolean boolean="${COInstance.is_current}" /></td>

                    <td><g:formatBoolean boolean="${COInstance.is_lock}" /></td>

                    <td>${fieldValue(bean: COInstance, field: "revision_year")}</td>

                </tr>
            </g:each>
        </tbody>
    </table>
    <script>
        $(document).ready(function(){
            $('#data').after('<div id="nav" align="center" ></div>');
        var rowsShown = 6;
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

<!--                    <div class="pagination">
    <g:paginate total="${COInstanceCount ?: 0}" />
</div>-->
</div>

