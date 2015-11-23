<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        
    </head>
    <body>	
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 
                    <li><g:remoteLink controller="PO" action="createGA" update="newContent"  >  <img src = "${resource(dir: 'images', file: 'add_PO-PEO-GA.png')}">&nbsp;Add PO/GA</g:remoteLink></li>
                    <li> <a href = "#"><img src = "${resource(dir: 'images', file: 'vission_mission.png')}"> &nbsp;View Vision/Mission</a></li>
                    <li> <a href = "#"> <img src = "${resource(dir: 'images', file: 'CO-PO-PEO-GA.png')}"> &nbsp;View CO Attainment</a></li>
                    <li> <g:remoteLink controller="PO" action="index1" update="newContent" > <img src = "${resource(dir: 'images', file: 'mapping.png')}">&nbsp;View GA </g:remoteLink></li>
                    <li> <a href = "#">  <img src = "${resource(dir: 'images', file: 'top.png')}">&nbsp; &nbsp;View Avg/Top/Med Student Performers</a></li>
                </ul>
            </div>

            <div class = "content">
                Welcome ${session.user}
               <div id="newContent">
                   
               </div>
                
            </div>
            
        </div> 


    </body>

</html>