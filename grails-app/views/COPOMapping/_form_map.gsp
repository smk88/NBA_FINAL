<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        This is a form_map template
        cos are ${session.cos}
        <br> pos are ${session.pos}
         <!--<table>
                <th>index</th>
                    <g:each in="${pos}" var="v" status="i">
                    <th> ${pos[i]} </th>
                    </g:each>

                    <g:each in="${cos}" var="v1" status="j">
                        <tr id="row${j}">
                            <td>${cos[j]}</td>
                            <g:each in="${pos}" var="v" status="k">
                                <td><input type="text" name="list" value=""></td>
                            </g:each>
                        </tr>
                    </g:each>
            </table>-->
    </body>
</html>
            