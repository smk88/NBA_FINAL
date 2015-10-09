<html>
    <head>
        <title>VIT NBA Software </title> 
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'global.css')}">
        <link rel = "stylesheet" type = "text/css" href="${resource(dir: 'css', file: 'bootstrap.min.css')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'jquery.min.js')}">
        <link rel = "stylesheet" type = "script/js" href="${resource(dir: 'js', file: 'bootstrap.min.js')}">
    </head>

    <body>
        <div id="header">
            <img id ="vitlogo" src = "${resource(dir: 'images', file: 'vit_logo.png')}" alt="vitlogo" >					
            <p> Vishwakarma Institute Of Technology, Pune </br><small id ="header1">NBA Software</small></p>
        </div>
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 

                </ul>
            </div>
            <div id="create-PEO" class="content scaffold-create" role="main">
                <div class="alert alert-info">
                    <h3>Create Program Education Objective(PEO)</h3>
                </div>



                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
                <g:hasErrors bean="${PEOInstance}">
                    <ul class="errors" role="alert">
                        <g:eachError bean="${PEOInstance}" var="error">
                            <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                            </g:eachError>
                    </ul>
                </g:hasErrors>
                <g:form url="[resource:PEOInstance, action:'save']" >
                    <fieldset class="form">
                        <g:render template="form"/>
                    </fieldset>
                </g:form>
            </div>


            <div id = "footer" >
                <div class = "logo"> 
                    <a href = "#"> <small>@Credits NBA Software Team</small></a>
                </div> 
            </div>  

    </body>
</html>
