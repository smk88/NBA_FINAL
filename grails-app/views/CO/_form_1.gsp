<%@ page import="nba_vit.CO" %>

<g:formRemote url="[controller:'CO', action:'save1']" method="post" name="remoteCreateCOForm" update = "newContent" >

    <div class="w3-container" style="width:90%">
        <ul class="w3-ul w3-card-4 w3-small w3-light-grey">
            <li>
                 <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'co_code', 'error')} ">
                    <label for="co_code" >
                        <g:message code="CO.co_code.label" default="Cocode" />
                    </label>

                    <g:textField class="w3-input" name="co_code" value="${session.count}" readonly="readonly"/>
                </div>
                
            </li>
            <li> 
               <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'co_statement', 'error')} ">
                    <label for="co_statement" >
                        <g:message code="CO.co_statement.label" default="Costatement" />
                    </label>
                    <g:textField class="w3-input" name="co_statement" value="${COInstance?.co_statement}"/>
                </div>
            </li>
           <!-- <li>
                <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'is_current', 'error')} ">
                    <label for="is_current" >
                        <g:message code="CO.is_current.label" default="Iscurrent" />
                    </label>
                    <g:checkBox name="is_current" value="${COInstance?.is_current}" onclick="<g:remoteFunction controller="CO" action="myudpateFunction" />
                    <button onclick="<g:remoteFunction controller="greeting" action="count" update="greetingBox"/>">Count</button> 
                </div>
                 
            <li>
                <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'is_lock', 'error')} ">
                    <label for="is_lock" >
                        <g:message code="CO.is_lock.label" default="Islock" />

                    </label>
                    <g:checkBox name="is_lock" value="${COInstance?.is_lock}" />
                </div>
            </li> -->
            <li> <div class="fieldcontain ${hasErrors(bean: COInstance, field: 'revision_year', 'error')} ">
                    <label for="revision_year" >
                        <g:message code="CO.revision_year.label" default="Revisionyear" />

                    </label>
                    <g:textField class="w3-input" name="revision_year" value="${session.ay}" readonly="readonly"/>
                </div>
            </li>
            <li>
               
                    <g:actionSubmit class="btn w3-btn w3-blue-grey btn-lg active" action="save1" value="${message(code: 'default.button.save.label', default: 'Save')}" />
               
            </li>

        </ul>
    </div>

</g:formRemote>
