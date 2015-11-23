    package nba_vit



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)
class COPOMappingController {
    def InformationService
    int poNo, coNo
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        println("Now in COPOMapping index")
        //course should be passed as parameter to getCOPOTable
        def c = Course.findByCourse_code("CS20103")
        println(c)
        def prog = c.program
        println(prog)
        def cos = InformationService.getCOsfromCourse(c)
        def pos = InformationService.getPOsfromProgram(c.program[0])
        println("cos= "+cos)
        println("pos= "+pos)
        session.cos = cos
        session.pos = pos
        [cos:cos,pos:pos]

        //        params.max = Math.min(max ?: 10, 100)
        //        respond COPOMapping.list(params), model:[COPOMappingInstanceCount: COPOMapping.count()]
    }

    def show(COPOMapping COPOMappingInstance) {
        respond COPOMappingInstance
    }
    
    def create() {
        println("Now in COPOMapping create")
        println(session)
//        List cos = InformationService.getCOsforCourse(session.course)
        //        List pos = InformationService.getPOforPogram
//        println(cos)
        respond new COPOMapping(params)
    }

    @Transactional
    def save(COPOMapping COPOMappingInstance) {
        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        if (COPOMappingInstance.hasErrors()) {
            respond COPOMappingInstance.errors, view:'create'
            return
        }

        COPOMappingInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'COPOMappingInstance.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect COPOMappingInstance
            }
            '*' { respond COPOMappingInstance, [status: CREATED] }
        }
    }

    def edit(COPOMapping COPOMappingInstance) {
        respond COPOMappingInstance
    }

    @Transactional
    def update(COPOMapping COPOMappingInstance) {
        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        if (COPOMappingInstance.hasErrors()) {
            respond COPOMappingInstance.errors, view:'edit'
            return
        }

        COPOMappingInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'COPOMapping.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect COPOMappingInstance
            }
            '*'{ respond COPOMappingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(COPOMapping COPOMappingInstance) {

        if (COPOMappingInstance == null) {
            notFound()
            return
        }

        COPOMappingInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'COPOMapping.label', default: 'COPOMapping'), COPOMappingInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'COPOMappingInstance.label', default: 'COPOMapping'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    
    def saveCOPO()
    {
        println("Now in save COPO of COPOMapping")
        println(params)
        def list = params.list
        def cos = params.cos
        def pos = params.pos
        //        println(pos)
        //        println(pos[0])
        println("pos_size="+session.pos.size())
        println("cos_size="+session.cos.size())
        println("list="+list.size())
        //        def rowWiseList = list.collate(pos.size())
        //        println("row wise list")
        //        println(rowWiseList)
    }
    
    /*def COPOMap_Create()
    {
        def c = Course.findByCourse_code("CS20105")
        def cos = InformationService.getCOsfromCourse(c)
        def pos = InformationService.getPOsfromProgram(c.program)
        println("cos= "+cos)
        println("pos= "+pos)
        session.cos = cos
        session.pos = pos
        [cos:cos,pos:pos]
    }*/
    
    /*def getCOPOforCourse()
    {
        println("Now in getCOPOforCourse")
        Course course = Course.findByCourse_code("CS20103");
        //        if(i>1)
        //        {
        //            Course course = session.course[i-2]
        def programs  = course.program
        //        }
        Program program = course.program[1]
        println(program)
        def cos = InformationService.getCOsfromCourse(course)
        def pos = InformationService.getPOsfromProgram(program)
        println(cos)
        println(pos)
        
        for(CO co:cos)
        {
            for(PO po:pos)
            {
                def copoval = COPOMapping.findByCoAndPo(co,po)
                println(copoval)
            }
        }
    }*/
    
    def COPOMap()
    {
        println("Now in COPOMap")
//        println(params)
    }
    def setCourse()
    {
        println("setting course")
        println(params)
        session.course = Course.get(params.id)
        session.program = session.course.program
        println(session)
//        println(session.course.program)
    }
    
    def setProgram()
    {
        println("setting program now")
        println(params)
        def program = Program.get(params.id)
        session.program = program
        
         def c = Course.findByCourse_code("CS20103")
        println(c)
        def prog = c.program
        println(prog)
        def cos = InformationService.getCOsfromCourse(c)
        def pos = InformationService.getPOsfromProgram(c.program[0])
        println("cos= "+cos)
        println("pos= "+pos)
        session.cos = cos
        session.pos = pos
        
        
        
        request.withFormat {
                form_map {
//                form {
                    redirect action: "form_map", method: "GET"
//                    redirect action: "create", method: "GET"
                }
//                "form_map" { render view: "form" }
            }
//            def htmlContent = new File('/NBA_VIT/COPOMapping/COPOMap.gsp').text
//            render text: htmlContent, contentType:"text/html", encoding:"UTF-8"
//            redirect action:"form_map"
            println("now rendering template")
            render(template: "temp")
    }
    def form_map()
    {
        println("in form_map")
        
//        render(view:"form_map")
//        respond "params"
    }
    def saveMap()
    {
        println("saveMap called")
        println(params)
        def map = new String[session.cos.size()][session.pos.size()]
        println("list size = "+params.list.size())
        println("cos size = "+session.cos.size())
        println("pos size = "+session.pos.size())
        int row,col;
        row=col=0;
        for(int i=0;i<params.list.size();i++)
        {
            if(i%session.pos.size()==0 && i!=0)
            { row++; col=0; }
            print(""+params.list[i])
            map[row][col] = params.list[i]
            println("index="+i+" foe loc "+row+","+col);
            col++;
        }
        
        println("COPO Map is ")
        for(def r:map)
        {
                print(r)
        }
    }
    
       
    def COPOMap_Create()
    {
           println("In COPO:"+params)
           if(params.Programs=="null" || params.Courses == "null"){
            //render("Select Programs and course")
            flash.message = "Select Programs and course!"
            //redirect(controller:'EmployeeHome',action: 'selectCourse')
            redirect(controller: "EmployeeHome", action: "selectCourse")
            
        }
        else{
            
        def progSel = Program.get(params.Programs)
        def crsSel = Course.get(params.Courses)
        //  def crsSel = "cs42115"
        // println("In COPOMap_Create Session"+crsSel)
        println("Selected Prog and Course "+progSel +" "+crsSel)
        //println("In COPOMap_Create Param"+Course.get(params.Courses))
        Course cc = new Course()
        Program p = new Program()
        
        def CourseName = Course.get(params.Courses)
        println("............."+CourseName)
        def ProgramName = Program.get(params.Programs)
        println("............."+ProgramName)
         
        def crs = InformationService.getCourseFromEmployee(session.employee)
        println("Course:"+crs)
        for(int i=0;i<crs.size();i++)
        {
            def co = InformationService.getCOFromCourse(crs[i])//("cs42115")
            println("CO for "+crs[i]+":"+co)
        }
        //List POs = InformationService.getPOsfromProgram(session.program)//for stt
        //List POs = InformationService.getPOCodefromProgram(session.program)
        List POs = InformationService.getPOCodefromProgram(progSel)
        println("POs of "+progSel+" : "+POs)
        
  
        //List POstt = InformationService.getPOsfromProgram(session.program)
       // List POstt = InformationService.getPOsfromProgram(progSel)
       // or
        List POstt = InformationService.getPOsttfromProgram(progSel)
        def COstt = InformationService.getCOSttFromCourse(crsSel)//(crs[2])
        def cos = InformationService.getCOFromCourse(crsSel)//(crs[2])
        println("COPO_STT:"+POstt+" "+COstt)
        coNo = cos.size()
        poNo = POs.size()
        CO costt = new CO()
        
        [pos:POs,cos:cos,postt:POstt,costt:COstt,crsname:CourseName,progname:ProgramName]
        }
    }
     def AddCOPO(){
        //println("In addCoPo course selected "+params.course_name)
        // def crsSel = Course.get(params.Courses)
        println("In Add COPO params "+params)
        if(params.copo!=null){
            println("No of COs and POs:"+coNo+" "+poNo +" "+params.copo.size())//in COPOMap_create
            def crsSel = params.course_name
            def progSel = params.prog_name
            // def crsSel = "cs42115"
            // def crsSel = Course.get(params.Courses)
            for(int i=0;i<params.copo.size();i++)
            {
                if(params.copo[i]=="")
                {
                    println("No Co for po..assigning 0")
                    params.copo[i] = "0"
                }
                else
                println("CO:"+params.copo[i])
            }
            // render("Hi"+params.copo)
            println("Bye.....")

            //                def COs = InformationService.getCOFromCourse("CS11111")//("cs42115")//
            // List POs = InformationService.getPOCodefromProgram(session.program)
            println("Pro crs selected:"+progSel+" "+crsSel)
            Program p1 = Program.findByName(progSel)
            println("Prog:"+p1)
            List POs = InformationService.getPOCodefromProgram(p1)
            Course c = Course.findByCourse_code(crsSel)//("cs42115")//
            println("Crs:"+c.course_name)
            List colst = CO.findAllByCourseAndIs_current(c,true)
            println("CO:"+colst.co_code)
                
            //Program p = Program.findByName(session.program)
            //  Program p = Program.findByName(progSel)
            boolean f = false   
            //////////////////
            
            //  finding by is_current
            //////////////////
            List polst = PO.findAllByProgramAndIs_current(p1,true)
            println("PO:"+polst.po_code)
            int k=0
            for(int i=0;i<colst.size();i++)
            { 
                for(int j=0;j<polst.size();j++)
                {
                    COPOMapping x = new COPOMapping()
                    x.setPo(polst[j])
                    x.setCo(colst[i])
                    x.setValue(Integer.parseInt(params.copo[k++]))
                    def found =(COPOMapping.findAllByPoAndCo(x.po,x.co).value)[0]
                   
                    if(found==null)
                    {
                        println("Status:"+k+"Added ")
                        x.save()//uncomment for add
                    }    
                    else
                    {
                        f= true
                        println("Status: Dup "+k)
                    }
                }
            }
            if(f==false)
                render("Added Successfully")
            if(f==true)
            {
                //render("Mapping already Done...For edit refer edit section")
                flash.message = "Mapping already Done...Redirected to View/Edit CO-PO Map"
                redirect(controller: "EmployeeHome", action: "selectCourseEdit")
            }
        }
        else{
                //render("Plz enter CO and PO for the course selected")
                flash.message = "No CO or PO entered for the course selected!"
            
                redirect(controller: "EmployeeHome", action: "CourseOwner")
        }
    }
    def COPOMap_viewEdit()
    {
           if(params.Programs=="null" || params.Courses == "null"){
            //render("Select Programs and course")
            flash.message = "Select Programs and course!"
            //redirect(controller:'EmployeeHome',action: 'selectCourse')
            redirect(controller: "EmployeeHome", action: "selectCourse")
            
        }
        else{
        def progSel = Program.get(params.Programs)
        def crsSel = Course.get(params.Courses)
        //  def crsSel = "cs42115"
        // println("In COPOMap_Create Session"+crsSel)
        println("Selected Prog and Course "+progSel +" "+crsSel)
        //println("In COPOMap_Create Param"+Course.get(params.Courses))
        Course cc = new Course()
        Program p = new Program()
        
        def CourseName = Course.get(params.Courses)
        println("............."+CourseName)
        def ProgramName = Program.get(params.Programs)
        println("............."+ProgramName)
         
        def crs = InformationService.getCourseFromEmployee(session.employee)
        println("Course:"+crs)
        for(int i=0;i<crs.size();i++)
        {
            def co = InformationService.getCOFromCourse(crs[i])//("cs42115")
            println("CO for "+crs[i]+":"+co)
        }
        //List POs = InformationService.getPOsfromProgram(session.program)//for stt
        //List POs = InformationService.getPOCodefromProgram(session.program)
        List POs = InformationService.getPOCodefromProgram(progSel)
        println("POs of "+progSel+" : "+POs)
        
  
        //List POstt = InformationService.getPOsfromProgram(session.program)
        List POstt = InformationService.getPOsfromProgram(progSel)
        def COstt = InformationService.getCOSttFromCourse(crsSel)//(crs[2])
        def cos = InformationService.getCOFromCourse(crsSel)//(crs[2])
        println("COPO_STT:"+POstt+" "+COstt)
        coNo = cos.size()
        poNo = POs.size()
        CO costt = new CO()
        //pass CO_PO values////////////////////////////////////////////////////////////////////
        def coObjs = CO.findAllByCourseAndIs_current(crsSel,true)
        println("CO-OBJs "+coObjs.id)
        def poObjs = PO.findAllByProgramAndIs_current(progSel,true)
        println("PO-OBJs "+poObjs.id)
        List copolst = new ArrayList<Integer>();
      
        List<List<String>> listOfLists = new ArrayList<List<String>>(coObjs.size()); 
        for(int i=0;i<coObjs.size();i++)
        for(int j=0;j<poObjs.size();j++){
            def val = COPOMapping.findByPoAndCo(poObjs[j],coObjs[i]).value ///getting value from copomapping table
            listOfLists.add(new ArrayList<String>());
            listOfLists[i].add(val);
            println("in loops "+val)
            // copolst.add(COPOMapping.findByPoAndCo(poObjs[j],coObjs[i]).value[0])
        }
       // println("COPOLST "+listOfLists[0][0])
        //ArrayList[][] table = new ArrayList[coObjs.size()][poObjs.size()];
        [pos:POs,cos:cos,postt:POstt,costt:COstt,crsname:CourseName,progname:ProgramName,listOfLists:listOfLists]
        }
    }
  
    def ViewEditCoPo(){
      
        println("In ViewEditCOPO params "+params)
        if(params.copo!=null){
            println("No of COs and POs:"+coNo+" "+poNo +" "+params.copo.size())//in COPOMap_create
            def crsSel = params.course_name 
            def progSel = params.prog_name
            // def crsSel = "cs42115"
            // def crsSel = Course.get(params.Courses)
 
            
            for(int i=0;i<params.copo.size();i++)
            {
                if(params.copo[i]=="")
                {
                    println("No Co for po..assigning 0")
                    params.copo[i] = "0"
                }
                else
                println("CO:"+params.copo[i])
            }
            Course cSel = Course.findByCourse_code(crsSel)
            Program pSel = Program.findByName(progSel)
             //render("Hi"+params.copo)
            def coObjs = CO.findAllByCourseAndIs_current(cSel,true)
            println("CO-OBJs "+coObjs.id)
            def poObjs = PO.findAllByProgramAndIs_current(pSel,true)
            println("PO-OBJs "+poObjs.id)
            int k=0;
            for(int i=0;i<coObjs.size();i++)
            for(int j=0;j<poObjs.size();j++){
                //def val = COPOMapping.findByPoAndCo(poObjs[j],coObjs[i]).value ///getting value from copomapping table
                CO c = CO.get(coObjs[i].id)//returning obj
                PO p = PO.get(poObjs[j].id)//returning obj
                String query = "update COPOMapping set value='"+Integer.parseInt(params.copo[k++])+"' where co='"+c.id+"' "+ "and po = '"+p.id+"'"
                println("Q...."+query)
                COPOMapping.executeUpdate(query);
                //println("in loops "+val)
            // copolst.add(COPOMapping.findByPoAndCo(poObjs[j],coObjs[i]).value[0])
            }
            //render("Yet to be done")
            flash.message = "Added Successfully...Redirected to Home Page"
            
            redirect(controller: "EmployeeHome", action: "CourseOwner")
//            render("Plz enter CO and PO for the course selected")
       }
       else
       {
          // render("Plz enter CO and PO for the course selected")
          flash.message = "No CO or PO entered for the course selected!"
            
                redirect(controller: "EmployeeHome", action: "CourseOwner")
       }
       
    }
    
}

  
  

