<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="nbalayout">
        <g:javascript library="jquery"/>
        <g:set var="entityName" value="${message(code: 'CO.label', default: 'CO')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
    <body>
        <div id = "container">
            <a href="courseOwner.gsp"></a>
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li> <g:link controller="EmployeeHome" action="createCo" update="newContent"> <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Create CO</g:link></li>
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
                <g:form url="[resource:COInstance, controller:'CO', action:'save1']" >
                    <g:hiddenField name="version" value="${COInstance?.version}" />
                    <div class="w3-card-2" style="width:90%; margin-top: 5%; margin-left: 2%">
                       
                            <div class="w3-blue-grey col-lg-12" style="font-size: 1.2em; text-align: center">Create CO&nbsp;[${session.course}:${session.course.course_name}]</div>
                        
                        <g:render template="form_create"/>

                      
                        <g:actionSubmit  class="w3-btn w3-blue-grey btn-lg active " action="save1" value="${message(code: 'default.button.save.label', default: 'Save')}" />
                    </div>
                </g:form>
                <div id="co_code_div" >
                </div>
            </div></div>

    </body>
</html>
