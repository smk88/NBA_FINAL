<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="nbalayout"/>
        <title>CO to Assessment Mapping</title>

    </head>
    <body>

        <div id = "container">
                  <!--<div class = "sidebar">
                      <ul id = "sideBarList"> 
  
                     
                  </ul>
              </div>-->

            <div class = "content1">

                <button style="width:20%;text-align: center" class="btn btn-md btn-info">Hide/View CO Lists </button>
                <div id="tgle" class="w3-card-2" style="max-height: fit-content">
                <g:each in="${co_list}" var="c" status="j">
                    <ul  class="w3-ul w3-small ">
                        <li >
                            ${co_list[j]}
                        </li>
                    </ul>
                        </g:each>
                </div>
                
                        <g:form role="form" url="[action:'storecoAssesmentMap',controller:'EmployeeHome']">
                           <div style="overflow-y: scroll; max-height: 60%; max-width: 100%"> 
                                <table class="table table-bordered table-condensed table-responsive table-hover" name="dt" >
                                    <tr class="info">
                                        <g:each in="${listOfLists[0]}" var="c" status="j">            
                                            <th><g:field type="text" name="mathead" id="{0+${j}" value="${listOfLists[0][j]}" readonly="readonly" class="w3-input w3-light-grey" /></th>
                                            </g:each>            
                                    </tr>
                                    <tr>
                                        <g:each in="${listOfLists[1]}" var="c" status="j">            
                                            <th class="warning"><g:field type="text" name="mathead" id="{1+${j}" value="${listOfLists[1][j]}" readonly="readonly" class="w3-input w3-light-grey" /></th>
                                            </g:each>            
                                    </tr>   
                                    <g:if test="${co_list.size()!=0}">      
                                        <g:set var="x" value="${co_list.size()+1}"/>        
                                        <g:each in="${(2..x).toList()}" var="i" status="d">              
                                            <tr>            
                                                <g:each in="${listOfLists[i]}" var="c" status="j"> 
                                                    <g:if test="${j==0}">                   
                                                        <td><g:field type="text" name="mathead" id="{${i}+${j}" value="${listOfLists[i][j]}" readonly="readonly" class="w3-input" /></td> 
                                                    </g:if>
                                                    <g:else>
                                                        <td><g:textField name="matdata" id="{${i}+${j}" value="${listOfLists[i][j]}" class="w3-input"/></td>  
                                                    </g:else>             
                                                </g:each>   
                                            </tr>                    
                                        </g:each>     
                                    </g:if>
                                </table>           
                            
                        <center>
                            <g:submitButton style="width:10%" class="btn w3-btn w3-blue-grey btn-md active" name="save" value="save" ></g:submitButton>
                            </center></div>
                    </g:form> 
                        




            </div>
        </div>  
    <!--    ${listOfLists}   --> 
<script>
    
  $("button").mouseover(function(){
    $("#tgle").show();
  });
 $("button").mouseout(function(){
    $("#tgle").hide();
  });

</script>
    </body>
</html>
