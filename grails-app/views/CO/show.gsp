
<%@ page import="nba_vit.CO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="nbalayout">
        <g:set var="entityName" value="${message(code: 'CO.label', default: 'CO')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>

        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li> <g:link controller="EmployeeHome" action="selectCourse" <a href = "#"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;Add CO-PO Map</a></g:link></li>
                    <li> <a href = "/NBA_VIT/EmployeeHome/selectCourseEdit"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO-PO Map</a></li>
                    <li> <g:link controller="CO" action="index1"> <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View/Edit CO</g:link></li>
                    <li><li> <g:link controller="EmployeeHome" action="coAssesment" <a href = "#"> <img src = "${resource(dir: 'images', file: 'addMap.png')}">&nbsp;Map CO with Assesment..</a></g:link></li>
                    <li> <a href = "/NBA_VIT/EmployeeHome/viewCourse"> <img src = "${resource(dir: 'images', file: 'course.png')}">&nbsp;View Courses</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'report.png')}">&nbsp;Report Mappings</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp;View CO attainment of Course</a></li>
                </ul>
            </div>

            <div class = "content">
                <div class="w3-card-24" style="width:70%;height: 50%;margin-left: 8%;margin-top: 3%">
                    <div id="show-CO" class="scaffold-show" role="main">

                        <div class="label w3-blue-grey col-lg-12" style="font-size: 1.2em"><g:message code="default.show.label" args="[entityName]" /></div>  <br><br>

                        <g:if test="${flash.message}">
                            <div class="message bg-danger" role="status" style="font-size: 1em" >${flash.message}</div>
                        </g:if>


                        <g:if test="${COInstance?.co_code}">
                            <li class="fieldcontain">
                                <span id="co_code-label" class="property-label"><g:message code="CO.co_code.label" default="Cocode" /></span>

                                <span class="property-value" aria-labelledby="co_code-label"><g:fieldValue bean="${COInstance}" field="co_code"/></span>

                            </li>
                        </g:if>

                        <g:if test="${COInstance?.co_statement}">
                            <li class="fieldcontain">
                                <span id="co_statement-label" class="property-label"><g:message code="CO.co_statement.label" default="Costatement" /></span>

                                <span class="property-value" aria-labelledby="co_statement-label"><g:fieldValue bean="${COInstance}" field="co_statement"/></span>

                            </li>
                        </g:if>

                        <g:if test="${COInstance?.course}">
                            <li class="fieldcontain">
                                <span id="course-label" class="property-label"><g:message code="CO.course.label" default="Course" /></span>

                                <g:fieldValue bean="${COInstance}" field="course" value="${}"/>
                                <!--<span class="property-value" aria-labelledby="course-label"><g:link controller="course" action="show" id="${COInstance?.course?.id}">${COInstance?.course?.encodeAsHTML()}</g:link></span>-->

                            </li>
                        </g:if>

                      <!--  <g:if test="${COInstance?.is_current}">
                            <li class="fieldcontain">
                                <span id="is_current-label" class="property-label"><g:message code="CO.is_current.label" default="Iscurrent" /></span>

                                <span class="property-value" aria-labelledby="is_current-label"><g:formatBoolean boolean="${COInstance?.is_current}" /></span>

                            </li>
                        </g:if>

                        <g:if test="${COInstance?.is_lock}">
                            <li class="fieldcontain">
                                <span id="is_lock-label" class="property-label"><g:message code="CO.is_lock.label" default="Islock" /></span>

                                <span class="property-value" aria-labelledby="is_lock-label"><g:formatBoolean boolean="${COInstance?.is_lock}" /></span>

                            </li>
                        </g:if>-->

                        <g:if test="${COInstance?.revision_year}">
                            <li class="fieldcontain">
                                <span id="revision_year-label" class="property-label"><g:message code="CO.revision_year.label" default="Revisionyear" /></span>

                                <span class="property-value" aria-labelledby="revision_year-label"><g:fieldValue bean="${COInstance}" field="revision_year"/></span>

                            </li>
                        </g:if>


                        <g:form url="[resource:COInstance, action:'delete']" method="DELETE">
                            <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <g:link class="btn w3-btn w3-blue-grey btn-lg active" action="edit" resource="${COInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                           <!-- <g:actionSubmit class="" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />-->

                        </g:form>
                    </div>



                </div>
            </div>
        </div> 


    </body>
</html>
