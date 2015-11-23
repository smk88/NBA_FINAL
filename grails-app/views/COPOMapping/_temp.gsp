<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>
        <h1>Sample line</h1>
        ${session} <br>
        <br>
        <!--<h3>COS are</h3>  ${session.cos} <br>-->

        <h3>POS are</h3>${session.pos}<br><br><br>
        
            <table id="copoTable">
                <g:each in="${session.pos}" var="v" status="i">
                    <th> ${v} </th>
                    </g:each>
                <g:each in="${session.cos}" var="v1" status="j">
                <tr id="row${j}">
                        <td>${v1}</td>
                        <g:each in="${session.pos}" var="v" status="k">
                            <td><input type="text" name="list" value=""></td>
                        </g:each>
                    </tr>
                </g:each>
            </table>
    </body>
</html>
