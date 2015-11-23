<%@ page import="nba_vit.CO" %>

<div class="w3-card-2" style="width:80%">
    <ul class="w3-ul w3-light-grey">
        <li>
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'co_code', 'error')} ">
                <label for="co_code">
                    <g:message code="CO.co_code.label" default="Cocode" />

                </label>
                <g:textField class="w3-input w3-sand" name="co_code" value="${COInstance?.co_code}" readonly="readonly" data-toggle="tooltip" title ="co code can't be modified"/>
            </div>
        </li>
        <li>
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'co_statement', 'error')} ">
                <label for="co_statement">
                    <g:message code="CO.co_statement.label" default="Costatement" />

                </label>
                <g:textField class="w3-input w3-sand" name="co_statement" value="${COInstance?.co_statement}"/>
            </div>
        </li>
        <li>
            <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'revision_year', 'error')} ">
                <label for="revision_year">
                    <g:message code="CO.revision_year.label" default="Revisionyear" />

                </label>
                <g:textField class="w3-input w3-sand" name="revision_year" value="${COInstance?.revision_year}"/>
            </div> 
        </li>

</div>





 <!--  <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'course', 'error')} required">
        <label for="course">
                <g:message code="CO.course.label" default="Course" />
                <span class="required-indicator">*</span>
        </label>
                <g:select id="course" name="course.id" from="${nba_vit.Course.list()}" optionKey="id" required="" value="${COInstance?.course?.id}" class="many-to-one" readonly="readonly" /> 
</div>

<div class="fieldcontain ${hasErrors(bean: COInstance, field: 'is_current', 'error')} ">
        <label for="is_current">
                <g:message code="CO.is_current.label" default="Iscurrent" />
                
        </label>
        <g:checkBox name="is_current" value="${COInstance?.is_current}" />
</div>

<div class="fieldcontain ${hasErrors(bean: COInstance, field: 'is_lock', 'error')} ">
        <label for="is_lock">
                <g:message code="CO.is_lock.label" default="Islock" />
                
        </label>
        <g:checkBox name="is_lock" value="${COInstance?.is_lock}" />
</div>
-->




