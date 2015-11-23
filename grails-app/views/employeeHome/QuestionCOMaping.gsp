<html>
    <head>
        <meta name="layout" content="nbalayout"/>
        <style>
            table{
            width:500px;
            height:100px;
            }
            table td{
            min-width: 120px;
            padding:5px;
            margin:5px;
            border:1px solid #ccc;
            }
            
             table tr{
            max-height: 40px; 
            }
            
            input{
                width: 100px; 
            }
            
            select{
                width: 100px; 
            }
        </style>

        <script>
            var coList = [[1,"CO1",30],[2,"CO1",10],[3,"CO1",15], [4,"CO1",10],[5,"CO1",20],[6,"CO1",15]];
            var noCO = coList.length; 
            
        function addSubPartGrid(){
            var noQ =  document.getElementById("noOfQuestions1").value;
            alert(noQ);
            mytable1 = $('<table></table>').attr({ id: "basicTable1" });
            for(var i = 0 ; i <= noQ; i++)
            {  
               var row = $('<tr></tr>').attr({ class: ["class1"].join(' ') }).appendTo(mytable1);
                for(var j = 0 ; j < 2; j++)
                {
                    if(i==0)
                    {
                        if(j==0)
                        {
                                var td = $("<td></td>").text('Questions Number').appendTo(row);
                            }
                            else
                            {
                                var td = $("<td></td>").text('Number of Sub Questions').appendTo(row);
                        }
                    }
                    else
                    {
                        if(j==0)
                        {
                            var td = $("<td></td>").text(i).appendTo(row);
                        }
                       else
                        {
                            var td = $("<td></td>").text('').appendTo(row);
                            var selectBox = $("<select></select>").attr({id: "subpart"+i}).appendTo(td); 
                            var option1 = $("<option>1</option>").attr({value:"1", id: "Q1"}).appendTo(selectBox); 
                            var option2 = $("<option>2</option>").attr({value:"2", id: "Q2"}).appendTo(selectBox);
                            var option3 = $("<option>3</option>").attr({value:"3", id: "Q3"}).appendTo(selectBox); 
                            var option4 = $("<option>4</option>").attr({value:"4", id: "Q4"}).appendTo(selectBox);
                            var option5 = $("<option>5</option>").attr({value:"5", id: "Q5"}).appendTo(selectBox); 
                            var option6 = $("<option>6</option>").attr({value:"6", id: "Q6"}).appendTo(selectBox);
                            var option7 = $("<option>7</option>").attr({value:"7", id: "Q7"}).appendTo(selectBox); 
                            var option8 = $("<option>8</option>").attr({value:"8", id: "Q8"}).appendTo(selectBox);
                            var option9 = $("<option>9</option>").attr({value:"9", id: "Q9"}).appendTo(selectBox); 
                            var option10 = $("<option>10</option>").attr({value:"10", id: "Q10"}).appendTo(selectBox);
                        }
                    }  
                 }
             }
             var row1 = $('<tr></tr>').attr({ class: ["class1"].join(' ') }).appendTo(mytable1);
             var td = $("<td colspan = '2'></td>").text('        ').appendTo(row1);             
             var button1 = $("<input type = 'button' ></input>").attr({value:"Submit", id: "questionButton", onclick: "addCOQues();"}).appendTo(td);              
             mytable1.appendTo("#box");	
             
             document.getElementById("noOfQuestions1").style.visibility = "hidden";
             document.getElementById("subPartGrid1").style.visibility = "hidden";
             document.getElementById("addques").style.visibility = "hidden";
             
        }
            
            
            
            
        function addCOQues(){
                
            var noQ =   parseInt(document.getElementById("noOfQuestions1").value);
            var noSPArray = new Array(); 
            var i = 1 ; 
            var totalSubParts = 0; 
            
            for(i = 0 ; i < noQ ; i++)
            {
                noSPArray[i] =  parseInt(document.getElementById("subpart"+(i+1)).value);  // [2,3,4,4]
                totalSubParts = totalSubParts + noSPArray[i];
            }
            var QuesArray = new Array(totalSubParts); 
            var k = 0; 
            for(i = 0 ; i < noQ; i ++)
            {
                for(j=0;j<noSPArray[i];j++)
                {   
                    QuesArray[k] = i+1; 
                    k++;
                }
            }
            alert(QuesArray);
            
            
            var SubPartArray = new Array(totalSubParts); 
            k = 0; 
            for(i = 0 ; i < noQ; i ++)
            {
                for(j=0;j<noSPArray[i];j++)
                {   
                    SubPartArray[k] = 97+j; 
                    k++;
                }
            }
            alert(SubPartArray);
            
            
            
            mytable1 = $('<table></table>').attr({ id: "basicTable2" });
                for(var i = 0 ; i <=totalSubParts  ; i++)
                {  
                    var row = $('<tr></tr>').attr({ class: ["class1"].join(' ') }).appendTo(mytable1);
                    for(var j = 0 ; j < noCO+2; j++)
                    {
                        if(i==0)
                        {
                            if(j==0)
                            {
                                var td = $("<td></td>").text('Question No.').appendTo(row);
                            }
                            else if(j==1)
                            {
                                var td = $("<td></td>").text('Sub Ques No.').appendTo(row);
                            }
                            else
                                var td = $("<td></td>").text('CO'+(j-1)+'['+coList[j-2][2]+']').appendTo(row);
                        }

                       else
                        {
                            if(j==0)
                            {   
                                var td = $("<td></td>").appendTo(row);
                                var inputbox = $("<input type = 'text' ></input>").attr({value:QuesArray[i-1], id: "hi3", disabled:"true", style:"background-color:#ecf0f1"}).appendTo(td);
                            }
                            else if(j==1)
                            {
                                 var td = $("<td></td>").appendTo(row);
                                 var inputbox = $("<input type = 'text' ></input>").attr({value:String.fromCharCode(SubPartArray[i-1]), id: "hi3", disabled:"true", style:"background-color:#ecf0f1"}).appendTo(td);
                            }
                            else
                            {
                               var td = $("<td></td>").appendTo(row);
                               var inputbox = $("<input type = 'text' ></input>").attr({value:"0", id: "hi3"}).appendTo(td); 
                            }
                        }
                    }
                }
                
            
     

            
            mytable1.appendTo("#box");	
            hideSubQuesGrid()
        }

        function AddQuestion(){

        }


        function hideSubQuesGrid()
        {
             var d = document.getElementById('box');
             var olddiv = document.getElementById('basicTable1');
             d.removeChild(olddiv);
        }
        
     


        </script>
    </head>
    <body>	
        <div id = "container">
            <div class = "sidebar">
                <ul id = "sideBarList"> 



                </ul>
            </div>

            <div class = "content">
                <div class="label label-success col-lg-12" style="font-size: 1.5em">Question to CO Maping for ESE </div>  <br><br>
              
                <font style="font-size: 1em;">  Course Code:  <br/></font>
                <font style="font-size: 1em;">  Course Name:  <br/></font>
                <font style="font-size: 1em;" id = "addques">  Add Number of Questions in ESE:  </font>
                <g:select name="noOfQuestions1"  id="noOfQuestions1" from="${1..10}" 
                     noSelection="['':'-Select No. of Questions-']"/>
                
                

                <input type="button" onclick="addSubPartGrid();" value="Add Question" id="subPartGrid1" />
                
                <div id="box" style="max-height: 68%; max-width:98%; overflow-x: scroll; overflow-y: scroll">
                    
                </div>
                
                <div id="report1">
                    <input type  = "button" onclick="validate();"  value = "validate" id="validate">
                    <div>


                        <div id="report2">
                            <input type  = "button" onclick="GSPservice();"  value = "submit" id="submit">
                            <div>

                            </div>
                        </div> 
                    </div>			
                </div>	

            </div>
        </div>
    </body>

    <SCRIPT>
        document.getElementById('submit').disabled = true;
    </SCRIPT>
</html>
