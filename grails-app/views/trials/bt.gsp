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
        <script>
            function myFunction() {
//               var newData = ${remoteFunction(controller: 'Trials', action: 'getData', params: '[string_from_form]')};
            //
                var newData = ${remoteFunction(controller: 'trials', action: 'getData',  params: [string_from_form])};
            }
        </script>
    </head>
    <body>
        <h1>Sample line</h1>
        <button onclick="myFunction()">Click me</button>
</html>
