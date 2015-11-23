package nba_vit

import groovy.swing.SwingBuilder
import java.awt.BorderLayout
import java.awt.Dimension
import org.jfree.chart.ChartPanel
import org.jfree.chart.plot.PlotOrientation
import java.awt.Color
import org.jfree.chart.plot.CategoryPlot

class EmployeeHomeController {
    def createChartService
    def InformationService
    def ResetPasswordService
    List asstype_list
    def finrow=0, fincol=0
    def index() { 
        println("Now in index of EmpHome")
    }
    def home(){
        println("session="+session)
        if(session == null)
        redirect(controller:"login",action:"login")
        println("in empHOME home")
        Employee emp = InformationService.getEmployeeFromUser(session.user)
        Department department = InformationService.getDepartmentFromUser(session.user)
        Program program = InformationService.getProgramFromEmp(emp)
        session.employee = emp
        session.program = program
        session.department = department
        //        println(department)
        //        println(session)
    }    
    def HOD(){
        println("in hod")
        session.role="HOD"
        // if(session.usertype.toString()=="HOD" || session.usertype.toString()=="Director")
        //        {
        //            println(session)
        Employee emp = Employee.findByEmployee_code(session.user)
        //          s  [emp:emp]
        //            println("emps="+emp)
        //            Course course = Course.findByProgram(session.program)
        //            [courses:courses]
        //            println("cors"+courses)
        //        }
    }
    def Director(){
        println("in director")
        session.role="Director"
    }
    //    def courseCoordinator(){
    //        println("in course coordinator")
    //    }
    def CourseOwner(){
        println("in course Owner")
        //        println(session)
        def courses = Course.findAllByEmployee(session.employee)
        session.courses = courses
        session.role = "Course Owner"
        //        render(view:'/NBA_VIT/EmployeeHome/courseCoordinator/create')
    }
    def courseInstructor()
    {
               println("in course instructor") 
               session.role = "Course Instructor"
    }
    def Student(){
        println("in student")
        session.role="Student"
    }
    
    /*def assignCoordinator(){
    println("finding out courses")
    Employee emp = Employee.findByEmployee_code(session.user)
    println("emp belongs to "+emp.program)
    //        println("emp belongs to"+emp.department)
    //  def dept = Progrsam.findByName(emp.program);
    //println("emp belongs to Dept = "+dept)
    def courses = InformationService.getCoursefromProgram(emp.program)
    def emps = InformationService.getEmployeefromProgram(emp.program)
        
    List emp_list = new ArrayList<String>()
    for(Employee e:emps)
    {
    emp_list.add(e.employee_code+" "+e.name)
            
    }
    List course_list = new ArrayList<String>()
    for(Course c:courses)
    {
    course_list.add(c.course_code+" "+c.course_name)
            
    }
        
    println("emps "+emp_list)
    println("course "+course_list)
        
    [emps:emps,courses:courses,emp_list:emp_list,course_list:course_list]
    //        redirect(action:'HOD')
    }*/
    
    def updateCoordinator()
    {
        println("Now in updateCorod of EmpHome")
        def emps = Employee.findByEmployee_code(emp.program)
        println("emp_id="+emp_id)
        String query1 = "UPDATE Course SET  role from Employee where employee_Id ='"+username+"'"
    }
    def create()
    {
        
        println("create in Employee Home")
        //        println(params)
        redirect(controller:"PO", action:"create")
    }
    
    /*def plotGraph()
    {
    ChartBuilder builder = new ChartBuilder();
 
    def areachart = builder.areaChart(title:'This is a title', 
    categoryAxisLabel:'category',
    valueAxisLabel:'value',
    orientation:PlotOrientation.VERTICAL,
    legend:true,
    tooltips:false,
    urls:false
    )
        
    defaultCategoryDataset(){
    addValue(1.0, row:'Series 1', column:'Type 1')
    addValue(4.0, row:'Series 1', column:'Type 2')
    addValue(3.0, row:'Series 1', column:'Type 3')
    addValue(5.0, row:'Series 1', column:'Type 4')
    addValue(5.0, row:'Series 1', column:'Type 5')
    addValue(7.0, row:'Series 1', column:'Type 6')
    addValue(7.0, row:'Series 1', column:'Type 7')
    addValue(8.0, row:'Series 1', column:'Type 8')
    addValue(5.0, row:'Series 2', column:'Type 1')
    addValue(7.0, row:'Series 2', column:'Type 2')
    addValue(6.0, row:'Series 2', column:'Type 3')
    addValue(8.0, row:'Series 2', column:'Type 4')
    addValue(4.0, row:'Series 2', column:'Type 5')
    addValue(4.0, row:'Series 2', column:'Type 6')
    addValue(2.0, row:'Series 2', column:'Type 7')
    addValue(1.0, row:'Series 2', column:'Type 8')
    addValue(4.0, row:'Series 3', column:'Type 1')
    addValue(3.0, row:'Series 3', column:'Type 2')
    addValue(2.0, row:'Series 3', column:'Type 3')
    addValue(3.0, row:'Series 3', column:'Type 4')
    addValue(6.0, row:'Series 3', column:'Type 5')
    addValue(3.0, row:'Series 3', column:'Type 6')
    addValue(4.0, row:'Series 3', column:'Type 7')
    addValue(3.0, row:'Series 3', column:'Type 8')

    }
    categoryplot {
    foregroundAlpha 0.7

    renderer {
    seriesPaint(0, paint:new Color(255, 0, 0));
    seriesPaint(1, paint:new Color(0, 255, 0));
    seriesPaint(2, paint:new Color(0, 0, 255));
    }
    }
    def chartPanel = new ChartPanel(areachart.chart, false);
    chartPanel.setPreferredSize(new Dimension(1000, 500));
    chartPanel.setMouseZoomable(true, false);
        
    SwingBuilder swing = new SwingBuilder();
        
    def frame = swing.frame(
    title:'This is a Frame',
    location:[100,100],
    size:[800,400],
    defaultCloseOperation:javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    frame.getContentPane().setLayout(new BorderLayout());
    frame.getContentPane().add( chartPanel, java.awt.BorderLayout.CENTER);
    frame.setVisible(true)
    }*/
    
    def drawGraph()
    {
        println("drawing graph")
        createChartService.plotGraph()
        println("sending to HOD page")
        redirect(controller:'employeeHome',action:'HOD')
    }
    
    def changepassword(){
        println("in change password of EmployeeHome")
    }
    def resetpassword()
    {
        println("in reset password of EmployeeHome :"+session.user)            
        def passwordFlag=ResetPasswordService.setPassword(params,session.user)
        println("passflag="+passwordFlag)
        if(passwordFlag == false)
        {
            println("Password cannot change...")
            render(view:"/employeeHome/changepassword")
        }
        if(passwordFlag==true)
        {            
            if(session.usertype.toString()=="Employee")
            {
                println("sending to employee page")
                redirect(controller:'EmployeeHome',action:'home')
                // render(view:"/employee/EmployeeHome")
            }
            else if(session.usertype.toString()=="Student")
            {
                redirect(controller:'EmployeeHome',action:'student')
                println("sending to student page")
            }
            else if(session.usertype.toString()=="Admin")
            {
                redirect(controller:'EmployeeHome',action:'admin')
                println("sending to admin page")
            }
            else
            println("oops!!!")           
        }
    }

    def createCo()
    {
        println("now in createCo of Emp home controller")
//        render(template:"select_form")   
        //        redirect(controller:'CO',action:'myCreatePage')
    }
    ///////////////vikas
    def selectCourse()
    {
        println("Session"+session)
        // session.selectedcourses = null
        Department dept = Department.findByName(session.department)
        //  println("Dept:"+dept)
        def progLst = Program.findAllByDepartment(dept)
        println("ProgLst:"+progLst)
           
        [crs:session.courses, proglst:progLst]
    }
    def selectAllCourse() //for HOD
    {
        println("Session"+session)
        // session.selectedcourses = null
        Department dept = Department.findByName(session.department)
        //  println("Dept:"+dept)
        def progLst = Program.findAllByDepartment(dept)
        println("ProgLst:"+progLst)
       
        // Program prog = Program.findByName(program)
        //        println(prog.department)
       
        def progs = Program.findAllByDepartment(dept)
     
        List course_list=new ArrayList();
        for(Program p: progs)
        {
            def crs = Course.findAll{ program.name == p.name }
            if(crs.size() > 0)
            for(Course c : crs)
            course_list.add(c)
        }
        println(course_list)  
        
        [crs:course_list, proglst:progLst]
    }
    def selectCourseEdit()
    {
        println("Session"+session)
        // session.selectedcourses = null
        Department dept = Department.findByName(session.department)
        //  println("Dept:"+dept)
        def progLst = Program.findAllByDepartment(dept)
        println("ProgLst:"+progLst)
           
        [crs:session.courses, proglst:progLst]
    }

    def selectAllCourseEdit() //By HOD
    {
        println("Session"+session)
        // session.selectedcourses = null
        Department dept = Department.findByName(session.department)
        //  println("Dept:"+dept)
        def progLst = Program.findAllByDepartment(dept)
        println("ProgLst:"+progLst)
       
        // Program prog = Program.findByName(program)
        //        println(prog.department)
       
        def progs = Program.findAllByDepartment(dept)
     
        List course_list=new ArrayList();
        for(Program p: progs)
        {
            def crs = Course.findAll{ program.name == p.name }
            if(crs.size() > 0)
            for(Course c : crs)
            course_list.add(c)
        }
        println(course_list)  
        
        [crs:course_list, proglst:progLst]
    }


    def coAssesment()
    {
        println("in co assesssment")
        def courses = Course.findAllByEmployee(session.employee)
        session.courses = courses
        // println(session.courses.size)
        List course_list = new ArrayList<String>()
        for(Course c:courses)
        {
            course_list.add(c.course_code+":"+c.course_name)            
        }        
        println("course "+course_list)
        // [emps:emps,courses:courses,emp_list:emp_list,course_list:course_list]  
        [course_list:course_list]
        // render(view:"/employeeHome/coAssesment")
    }
    def coAssesmentMap()
    {
        println("now in coAssesment map")
        println(params)
        println(params.course_list)
        String coursename_coursecode=params.course_list
        //Extract Course code from combine coursename_coursecode
        int flag=0
        String coursecode=""
        for(int i=0;i<coursename_coursecode.length();i++)
        {
            if(coursename_coursecode.charAt(i)==':')       
            {
                flag=1
                break;
            }
            if(flag==0)
            coursecode=coursecode+coursename_coursecode.charAt(i)
        }
        println("course code::"+coursecode)         
        //Let us find Course outcomes for this course                        
        Course course = Course.findByCourse_code(coursecode)
        println("Course::"+course)
        def co=InformationService.getCOsfromCourse(course)
        List co_list = new ArrayList<String>()
        for(CO c:co)
        {
            co_list.add(c.co_code+"."+c.co_statement)            
        }
        println("CO:"+co_list)
        //let us find out course type from course code
        String course_type=InformationService.getCourseTypefromCourseCode(coursecode)
        println("course type::"+course_type)
        //Let us find all assessments for that coursetype
        def at=InformationService.getAssessmentTypefromCourseCode(coursecode)   
        println(at)
        List temp_asstype_list = new ArrayList<String>()     
        List temp_mark_list = new ArrayList<String>()
        temp_asstype_list.add(coursecode)    
        temp_mark_list.add(course.course_name)         
        
        asstype_list = new ArrayList<String>()
        List mark_list = new ArrayList<Double>()
        for(AssessmentType a:at)
        {
            asstype_list.add(a.assessment_type)    
            mark_list.add(a.evaluated_marks)     
        }
        //let us find association for the course
        String associated_course=InformationService.getAssociatedCoursefromCourseCode(coursecode)
        println("Associated Course::"+associated_course)
        if(associated_course!=null)
        {
            println("This course has Lab");
            //Let us find all assessments for that Associated Course             
            def acat=InformationService.getAssessmentTypefromCourseCode(associated_course)
            for(AssessmentType a:acat)
            {
                asstype_list.add(a.assessment_type)    
                mark_list.add(a.evaluated_marks)  
            }
        }
        println("Assesment List::"+asstype_list)
        println("Mark List::"+mark_list) 
        //Let us search in COAssesmentMapping Table to find earlier records
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%1000)+1);
        println("Academic Year::"+ay)
        def coam=InformationService.findWeightfromCOAssessmentMapping(coursecode,ay) 
        //    asstype_list.sort()
        println("After Sorting::"+asstype_list)   
        int cosize=co_list.size(),asssize=asstype_list.size()
        println(cosize+","+asssize+" "+coam.size)             
        def mat=new double[cosize][asssize] 
        for(int i=0;i<cosize;i++)
        {
            for(int j=0;j<asssize;j++)
            {
                mat[i][j]=0;
            }
        }
        int matj=0,val=0;
        for(String a:asstype_list)
        {
            println(a)            
            for(COAssessmentMapping c:coam)
            {
                if(a.equals(c.assessment_type.assessment_type))
                {
                    val=Integer.parseInt(c.co.co_code)
                    val--;
                    mat[val][matj]=c.weightage
                }              
            }    
            matj++;
        }
        println("\n Now matrix is\n")
        String str=""
        for(int i=0;i<cosize;i++)
        {
            for(int j=0;j<asssize;j++)
            {
                str=str+mat[i][j]+"\t";
            }            
            str=str+"\n";
        }    
        println("\n"+str)
        //Store all these values in two dimensional arraylist        
        for(int i=0;i<asstype_list.size();i++)
        temp_asstype_list.add(asstype_list[i])
            
        for(int i=0;i<mark_list.size();i++)
        temp_mark_list.add(mark_list[i])
            
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        listOfLists.add(temp_asstype_list)
        listOfLists.add(temp_mark_list)        
        List temp=null
        for(int i=0;i<cosize;i++)
        {
            temp = new ArrayList<String>() 
            temp.add(""+(i+1))
            for(int j=0;j<asssize;j++)
            {
                temp.add(mat[i][j])
            }                      
            listOfLists.add(temp)            
        }     
        finrow=cosize
        fincol=asssize
        println("\n This is final Now");            
        for(int i=0;i<(cosize+2);i++)
        println(listOfLists[i])        
        [co_list:co_list,listOfLists:listOfLists]
    }
    def storecoAssesmentMap()
    {
        println("I am in store CO Assessment Map")
        println("Number of CO:"+finrow+" Number of Assessment:"+fincol)
        println(params.mathead)        
        println(params.matdata)
        String course_code=params.mathead[0]
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        println("course code::"+course_code)
        String ay = cy +"-"+((cy%1000)+1);
        println("Academic Year::"+ay)
        println("List of Assesments::"+asstype_list)
        boolean flag=InformationService.storeWeightintoCOAssessmentMapping(course_code,ay,asstype_list,finrow,fincol,params)
        if(flag==true)
        println("CO to Assessment Mapping stored successfully....")
        //render(view:"/employeeHome/coAssesmentMap")
    }
    
    def QuestionCOMaping(){
        
    }
 
    def dean()
    {
        println("Now in dean page")
        session.role = "Dean"
    }
    def fetchData(String year, String programs)
    {
        println("in FD..........."+year)
        Employee emp = Employee.findByEmployee_code(session.user)
        def emps = InformationService.getEmployeefromProgram(emp.program)
        List emp_list = new ArrayList<String>()
        for(Employee e:emps)
        {
            emp_list.add(e.employee_code+" "+e.name)
            
        }
        
        List  yr = new ArrayList<String>()
        yr.add(year)
        println(yr)
        println("Fetch Data"+yr)
        Program p = Program.findByName(programs)
        println("Prog:"+p)
        def Pcrs = InformationService.getCoursesByProgramAndYear(p,yr[0])
       
        [emp_list:emp_list,crs:Pcrs]
    }
    def assignData(String emp_list ,String course_list)
    {
        println("i am in ssign\n emp name" +emp_list)
        String[] numberOnly= emp_list.split("\\s+");
        println("emp no"+numberOnly[0])
        println("Course name"+course_list)
        def couse_id=Course.findByCourse_code(course_list).id
        println("couse id"+Course.findByCourse_code(course_list).id)
        def emp_id=Employee.findByEmployee_code(numberOnly).id
        println("empid"+Employee.findByEmployee_code(numberOnly).id)
        Course.executeUpdate("update Course set employee_id = '"+emp_id+"' where id = '"+couse_id+"'")
        session.message = emp_list
        //redirect(action:'assignData')
    }
    def viewallotment()
    {
        println("in FcourseD...........")
        redirect(action:'fetchData1')
    }
    def courseData(String year, String programs)
    {
        println("i am in course data"+year +" "+programs)
        //Program p = Program.findByName(programs)
        //def pcrs = Course.findAllByYear(yr[0])
        // println(pcrs)
         
    }
    def assignCoordinator_1(){
        Employee emp = Employee.findByEmployee_code(session.user)
        def programs = InformationService.getProgramsFromEmp(emp)
        println("Prog.................:"+programs)
        if(programs.equals('Engineering, Sciences & Humanities'))
        println("hi")
        else
        println("bye")
        List year = new ArrayList<String>();
        year.add("FE");
        year.add("SE");
        year.add("TE");
        year.add("BTech");
        [programs:programs,year:year]
        render(template:"courseData");
        //redirect(action:'courseData')
    }
    def assignData1(String emp_list ,String course_list)
    {
        i++;
        println("i am in ssign\n emp name" +i)
       
    }
    def fetchData1()
    {
        println("i am in retrive data")
        Employee emp = Employee.findByEmployee_code(session.user)
        def programs = InformationService.getProgramsFromEmp(emp)
        println("Prog:"+programs)
        String sess=emp.program
        List year = new ArrayList<String>();
        if(sess.equals("Engineering, Sciences & Humanities"))
        {
            year.add("FE");
        }
        else
        {
            year.add("SE");
            year.add("TE");
            year.add("BTech");
        }
      
        [programs:programs,year:year]
    }
    /*  def courseInfo(String year, String programs)
    {
    int i=0,j=0,k=0
    println("i am in courseinfo data"+year +""+programs)
    Program p = Program.findByName(programs)
    println("Prog:"+p)
    def Pcrs = InformationService.getCoursesByProgramAndYear(p,year)
    println("pcs"+Pcrs)
    def courses = InformationService.getCoursefromProgram(programs)
    println("courses"+courses)
    List course_code_list = new ArrayList<String>()
    List course_name_list = new ArrayList<String>()
    List course_empname_list = new ArrayList<String>()
    List pcrs_list = new ArrayList<String>()
    for(j=0;j<Pcrs.size();j++)
    {
    pcrs_list.add(Pcrs[j])
            
    }
    println(pcrs_list)
    List <List<String>> Alllist = new ArrayList<List<String>>()
    // for(i=0;i<Pcrs.size();i++)
    //{
    for(Course c:courses)
    {
    Alllist.add(new ArrayList<String>())
    println(c.course_code+" "+pcrs_list[i])
    if(c.year==year)
    //            if((c.course_code==pcrs_list[i])&& (c.year=year))
    {
    println(i)
    course_code_list.add(c.course_code)
    course_name_list.add(c.course_name)
    course_empname_list.add(c.employee.name)
    Alllist[i].add(course_code_list[i])
    Alllist[i].add(course_name_list[i])
    Alllist[i].add(course_empname_list[i])
    i++
    }
    }
    //}
    [Alllist:Alllist,course_code_list:course_code_list,course_name_list:course_name_list,course_empname_list:course_empname_list,programs:programs]
    }*/
    
    def courseInfo(String year, String programs)
    {
        int i=0,j=0,k=0
        println("i am in courseinfo data"+year +""+programs)
        Program p = Program.findByName(programs)
        println("Prog:"+p)
        def courses = InformationService.getCoursesByProgramAndYear(p,year)
        println("pcs"+courses)
        
        List <List<String>> all_list = new ArrayList<List<String>>()
        
        for(Course course : courses)
        {
            all_list.add(new ArrayList<String>())
            all_list[i].add(course.course_code)
            all_list[i].add(course.course_name)
            all_list[i++].add(course.employee.name)
            println(course.course_code+","+course.course_name+","+course.employee.name)
        }
        [Alllist:all_list,year:year,programs:programs]
    }
    def assignCoordinator(){
        println("finding out courses")
        println(session.user)
      
       
        Employee emp = Employee.findByEmployee_code(session.user)
        def programs = InformationService.getProgramsFromEmp(emp)
        println("emp belongs to "+emp.program)
        String sess=emp.program
        println("sss"+sess)
        //        println("emp belongs to"+emp.department)
        //  def dept = Progrsam.findByName(emp.program);
        //println("emp belongs to Dept = "+dept)
        //        println(emp)
        //        println(emp.name)
        //        def progs =
        //        println(progs)
        //        def courses = InformationService.getCoursefromProgram(emp.program)
        def emps = InformationService.getEmployeefromProgram(emp.program)
        
        List emp_list = new ArrayList<String>()
        for(Employee e:emps)
        {
            emp_list.add(e.employee_code+" "+e.name)
            
        }
        /*  List course_list = new ArrayList<String>()
        for(Course c:courses)
        {
        course_list.add(c.course_code+" "+c.course_name)
            
        }*/
        
        println("emps "+emp_list)
        List year = new ArrayList<String>();
        //  println("course "+course_list)
        if(sess.equals("Engineering, Sciences & Humanities"))
        {
           
            year.add("FE");
        }
        else
        {
            year.add("SE");
            year.add("TE");
            year.add("BTech");
        }
        [emps:emps,programs:programs,emp_list:emp_list,year:year]
        //        redirect(action:'HOD')
    }
    ////////////////vikas

    def viewCourse()
    {
        //render("to be done")
        println("in view Course sessnion "+session)
        println("in view Course sessnio "+session.courses.course_name)
        List<List<String>> listOfLists = new ArrayList<List<String>>(session.courses.size()); 
        
        
        for(int j=0;j<session.courses.size();j++){
            listOfLists.add(new ArrayList<String>())
            listOfLists[j].add(session.courses[j].course_code)
            listOfLists[j].add(session.courses[j].course_name)
            println("in loop:"+session.courses[j].course_code)
            
            def ct = InformationService.getCourseTypefromCourseCode(session.courses[j].course_code)
            listOfLists[j].add(ct);
            listOfLists[j].add(session.courses[j].year);
            //  println("in loops "+val)
            
        }
        [lol:listOfLists]
        
    }

    def admin()
    {
    
    }
    def viewAllCos()
    {
        println("view all Cos")
        def programs = InformationService.getProgramsFromEmp(session.employee)
        session.programs = programs
    }
    def viewAllCourses()
    {
        println("getting all courses for HOD")
        //getting employee from user
        def emp = InformationService.getEmployeeFromUser(session.user)
        session.emp = emp
        //getting department of hod
        def program = InformationService.getProgramFromEmp(emp)
//        println(program)
        def courses = InformationService.getCoursesForProgram(program)
//        println(courses)
        [courses:courses]
    }
    def listCOs()
    {
        println(params)
        
        println("in listCOs of EmpHome")
        println("session.program="+session.program)
        Program program
        if(params.program != null)
        {  
            println(params)
            program = Program.get(params.program.id)
            println(program)
            session.program = program
        }
        else
        {
            println("program is already set")
            program = session.program
        }
        println("program="+program)
        def courses = InformationService.getCoursesForProgram(program)
        List co1 = new ArrayList()
        
        for(Course c : courses)
        {
            co1.addAll(CO.findAllByCourse(c))
        }
        respond co1, model:[COInstanceCount: CO.count()]
    }
    def MarksEntry()
    {
        println("I am in marks entry")
        println("Employee Code::"+session.user)
         //let us find employee from employee code
        Employee emp = InformationService.getEmployeeFromUser(session.user)        
        // let us find courses taught by teacher
        List<List<String>> listOfLists = new ArrayList<List<String>>(); 
        List course_code_list = new ArrayList<String>()                     
        List course_name_list = new ArrayList<String>() 
        List course_code_name_list = new ArrayList<String>()   
        List teacher_div_combined_list = new ArrayList<String>()     
        List evaluation_method_list = new ArrayList<String>()          
        List entry_type_list = new ArrayList<String>()  
        List academic_year_list= new ArrayList<String>()
        List semester_list= new ArrayList<String>()

        listOfLists.add(0,course_code_list)
        listOfLists.add(1,course_name_list)                  
        def tc=TeacherCourse.findAllByEmployee(emp)     
        int i=2
        for(TeacherCourse t:tc)
        {
            println("Teacher Course ID::"+t.id);
            def tt=TeacherCourse.findAllById(t.id)
           List teacher_division_list=new ArrayList<String>()        
            for(TeacherCourse x:tt)
            {
                println("Course Offering ID::"+x.course_offeringId)
                println("Teacher Division::"+x.teacher_divison)
                def co=CourseOffering.findAllById(x.course_offeringId)
                teacher_division_list.add(x.teacher_divison)
                int flag=0
                for(int m=0;m<teacher_div_combined_list.size;m++)
                {
                    if(teacher_div_combined_list[m].equals(x.teacher_divison))
                    {
                        flag=1
                        break
                    }
                }                
                if(flag==0)
                    teacher_div_combined_list.add(x.teacher_divison)
                for(CourseOffering c:co)
                {
                    println("Course ID::"+c.courseId)
                    def cc=Course.findAllById(c.courseId)
                    for(Course cs:cc)
                    {
                        println("Course Code:"+cs.course_code+"::Course Name:"+cs.course_name+"  ")
                        course_code_list.add(cs.course_code)
                        course_name_list.add(cs.course_name)
                        course_code_name_list.add(cs.course_code+":"+cs.course_name)
                    }
                }
            }   
            listOfLists.add(i,teacher_division_list)
            i++
        }  
      //  listOfLists.add(0,course_code_list)
      //  listOfLists.add(1,course_name_list)  
        println("TWO-D List\n"+listOfLists)
        evaluation_method_list.add("In-Semester")
        evaluation_method_list.add("End-Semester")      
        entry_type_list.add("CO-wise")
        entry_type_list.add("Question-wise") 
        academic_year_list.add("2015-16")
        semester_list.add("I")
        semester_list.add("II")        
        [course_name_list:course_name_list,course_code_list:course_code_list,listOfLists:listOfLists,course_code_name_list:course_code_name_list,teacher_div_combined_list:teacher_div_combined_list,evaluation_method_list:evaluation_method_list,entry_type_list:entry_type_list,academic_year_list:academic_year_list,semester_list:semester_list]
    }
    def processMarksEntry()
    {
        String entry_type_list=params.entry_type_list
        String academic_year_list=params.academic_year_list
        session.academic_year_list=academic_year_list
        String semester_list=params.semester_list
        session.semester_list=semester_list
        println("entry_type_list:"+entry_type_list)
        int row=0,col=0
        int dynamic_co_count=0
        int dynamic_question_count=0
        def coassmap=null
        String split="no"    //this is for distributing marks in background, no means splitting not required in background
        def cy = Calendar.getInstance().get(Calendar.YEAR);        
        String ay = cy +"-"+((cy%1000)+1);        
        int co_count=0;
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        List header_list = new ArrayList<String>() 
        List co_weight_list = new ArrayList<String>() 
        List question_weight_list = new ArrayList<String>()         
        List dynamic_co_list = new ArrayList<String>()   
        List dynamic_weight_list= new ArrayList<String>() 
        List dynamic_question_list = new ArrayList<String>()   
        List dynamic_question_weight_list= new ArrayList<String>()         
        int static_col_size=0
        header_list.add("S.NO.")        
        question_weight_list.add("-")
        co_weight_list.add("-")
        static_col_size++
        header_list.add("GR No.")       
        co_weight_list.add("-")
        question_weight_list.add("-")        
        static_col_size++
        header_list.add("Roll No.") 
        question_weight_list.add("-")        
        co_weight_list.add("-")
        static_col_size++
        header_list.add("First Name") 
        question_weight_list.add("-")        
        co_weight_list.add("-")
        static_col_size++
        header_list.add("Middle Name")  
        question_weight_list.add("-")        
        co_weight_list.add("-")
        static_col_size++
        header_list.add("Last Name") 
        question_weight_list.add("-")        
        co_weight_list.add("-")
        static_col_size++
        
        String exam=""
        String mark_list 
        println("I am in process marks entry...")
        //println(params)
        String coursename_coursecode=params.course_list
        String teacher_div=params.div_list
        //Extract Course code from combine coursename_coursecode
        int flag=0
        String coursecode="",coursename=""
        for(int i=0;i<coursename_coursecode.length();i++)
        {
            if(coursename_coursecode.charAt(i)==':')       
            {
                flag=1
                continue;
            }
            if(flag==0)
                coursecode=coursecode+coursename_coursecode.charAt(i)
            if(flag==1)
                coursename=coursename+coursename_coursecode.charAt(i)
        }
        println("Course code::"+coursecode+" Course name:"+coursename+" Teacher Division:"+teacher_div)         
        //Let us find Course outcomes for this course                        
        Course course = Course.findByCourse_code(coursecode)
        String year=course.year        
        println("Year::"+year)
        def co=InformationService.getCOsfromCourse(course)
        List co_list = new ArrayList<String>()
        for(CO c:co)
        {
            co_list.add(c.co_code+"."+c.co_statement) 
            co_count++
        }        
        //let us find out course type from course code
        //CourseType course_type=InformationService.getCourseTypefromCourseCode(coursecode)
        Course crs = Course.findByCourse_code(coursecode)
        CourseType course_type = crs.course_type
        println("course type::"+course_type.type)
        String method=params.evaluation_method_list
        def at=InformationService.getAssessmentTypefromCourseCode(coursecode)
if(entry_type_list.toString().equals("CO-wise"))
{        
        if(course_type.type.toString().equals("Theory"))
        {
            exam="endSemester"
        }
        if(course_type.type.toString().equals("Lab"))
        {
            if(method.equals("In-Semester"))
            exam="inSemester"
            if(method.equals("End-Semester"))
            exam="endSemester"            
        }
        if(course_type.type.toString().equals("CVV"))
        {
            exam="endSemester"            
        }  
        if(course_type.type.toString().equals("Project"))
        {
            exam="endSemester"            
        }  
        if(course_type.type.toString().equals("Seminar"))
        {
            exam="endSemester"            
        }          
        println("Method::"+method+" exam::"+exam+" course type::"+course_type)
        if(course_type.type.toString().equals("Theory") || (course_type.type.toString().equals("Lab") && method.equals("In-Semester")) )
        {
            //Let us find course outcomes according co-assessment mapping           
            for(AssessmentType a:at)
            {
                String temp=a.evaluation_type
                if(a.course_typeId==course_type.id && a.evaluation_type.equals(exam))
                {
                    session.at=a.assessment_type
                    println("testing assessment_type::"+a.assessment_type+" assessment id::"+a.id)   
                    //let us find cos by assessment id and course id
                    coassmap=COAssessmentMapping.findAllByAssessment_typeAndCourseAndAcademic_year(a,course,ay)
                    for(COAssessmentMapping com:coassmap)
                    {
                        println("COAssesmentMappingId::"+com.id)
                        if(com.weightage>0)
                        {
                            header_list.add("CO"+com.coId)
                            co_weight_list.add(com.weightage)
                            dynamic_co_list.add(com.coId)
                            dynamic_weight_list.add(com.weightage)                            
                            dynamic_co_count++
                        }
                    }
               }
            }
        }
        if((course_type.type.toString().equals("Lab") && method.equals("End-Semester")) || course_type.type.toString().equals("CVV") || course_type.type.toString().equals("Project") || course_type.type.toString().equals("Seminar"))
        {
            //Let us find course outcomes according co-assessment mapping           
            for(AssessmentType a:at)
            {
                String temp=a.evaluation_type
                if(a.course_typeId==course_type.id && a.evaluation_type.equals(exam))
                {
                    session.at=a.assessment_type
                    println("testing assessment_type::"+a.assessment_type+" assessment id::"+a.id)   
                    //let us find cos by assessment id and course id
                    coassmap=COAssessmentMapping.findAllByAssessment_typeAndCourseAndAcademic_year(a,course,ay)
                    for(COAssessmentMapping com:coassmap)
                    {
                        println("COAssesmentMappingId::"+com.id)
                        if(com.weightage>0)
                        {
                            //header_list.add("CO"+com.coId)
                            co_weight_list.add(com.weightage)
                            dynamic_co_list.add(com.coId)  
                            dynamic_weight_list.add(com.weightage)
                            split="yes"
                        }
                    }
               }
            }
            
            /*for(int i=1;i<=co_count;i++)
                header_list.add("CO"+i)   */          
        }
}
        //Let us find Question and corrosponding weight distribution
if(entry_type_list.toString().equals("Question-wise"))                
{
        def qcm=null
        if(course_type.type.toString().equals("Theory") && method.equals("End-Semester")) 
        {
            split="no"
            exam="endSemester"
            qcm=QuestionCOMapping.findAllByCourseAndAcademic_year(course,ay)
            def sumq=new int[10]
            def flagq=new int[10]
            for(int i=0;i<10;i++)
            {
                flagq[i]=0
            }
            int qno=0
            for(int i=1;i<=10;i++)
            {       
                sumq[i-1]=0                
                for(QuestionCOMapping q:qcm)
                {
                    // println("Question Number::"+qcm.qno+" Option:"+qcm.opno+" Max. Marks:"+qcm.maxmarks)
                   qno=Integer.parseInt(q.qno)
                   if(qno==i)
                   {
                       sumq[i-1]=sumq[i-1]+q.maxmarks
                       flagq[i-1]=1
                   }                        
               }
               if(flagq[i-1]==1)
               {
                   println("Question Number: Q"+i+"Marks::"+sumq[i-1])
                   dynamic_question_list.add(i)   
                   dynamic_question_weight_list.add(sumq[i-1])      
                   question_weight_list.add(sumq[i-1])  
                   header_list.add("Question-"+i)    
                   dynamic_question_count++
               }
            }
        }
        header_list.add("Total(Out Of 100)")
        question_weight_list.add("-")          
        mark_list="100"
}        
        def dept_name=InformationService.getDepartmentfromCourse(course)        
        println("Department::"+dept_name)        
        //Let us find all assessments for that coursetype        
 if(entry_type_list.toString().equals("CO-wise"))
{               
        int trace=0
        at=InformationService.getAssessmentTypefromCourseCode(coursecode)
        for(AssessmentType a:at)
        {     
            String temp=a.evaluation_type             
            if(temp.equals("endSemester"))
            {
                println("Assessment Type::"+a.assessment_type+" Evaluation Type::"+a.evaluation_type+" Evaluated Marks::"+a.evaluated_marks)  
            }
            if( (temp.equals("endSemester") && course_type.type.toString().equals("Theory")) || (temp.equals("inSemester") && course_type.type.toString().equals("Lab")) || (temp.equals("endSemester") && course_type.type.toString().equals("CVV")) )
            {
                if(course_type.type.toString().equals("Lab") && dept_name.toString().equals("Computer") && temp.equals("inSemester") && method.equals("In-Semester"))
                {
                    header_list.add("Total(Out Of 30)")
                    mark_list="30"
                    trace=1
                    co_weight_list.add("-")
                }
                else
                {
                    header_list.add("Total(Out Of "+(int)a.evaluated_marks+")")
                    mark_list=""+(int)a.evaluated_marks                    
                    trace=1
                    co_weight_list.add("-")
                }
            } 
            if( (temp.equals("endSemester") && course_type.type.toString().equals("Lab")) || (temp.equals("endSemester") && course_type.type.toString().equals("CVV")) )
            {
                if(course_type.type.toString().equals("Lab") && dept_name.toString().equals("Computer") && temp.equals("endSemester") && method.equals("End-Semester"))
                {
                    header_list.add("Total(Out Of 70)")
                    mark_list="70"
                    trace=1
                    co_weight_list.add("-")
                }
                else
                {
                    header_list.add("Total(Out Of "+(int)a.evaluated_marks+")")
                    mark_list=""+(int)a.evaluated_marks 
                    trace=1
                    co_weight_list.add("-")
                }
            }         
            if(trace==1)
            {
                trace=0
                break;
            }
        }
}        
        println("Header List::"+header_list)
        println("CO Weight List::"+co_weight_list)
        println("Question Weight List::"+question_weight_list)        
        listOfLists.add(0,header_list)
if(entry_type_list.toString().equals("CO-wise"))
    listOfLists.add(1,co_weight_list)        
if(entry_type_list.toString().equals("Question-wise"))        
    listOfLists.add(1,question_weight_list)            
        println("Marks::"+mark_list);        
        println("program::"+course.program)
        println("COurse ID::"+course.id)
        //let us find course offering ID from course ID
        CourseOffering coff=InformationService.getCourseOfferingfromCourse(course)
        println("Course Offering ID::"+coff.id)
        def student=InformationService.getStudentListfromStudentCourse(coff,teacher_div)
        int serialno=1
        int rn=0
        int tot_marks=0
        for(StudentCourse s:student)
        {
            tot_marks=0
            List data_list = new ArrayList<String>()                         
            data_list.add(serialno)
            println("Student ID::"+s.studentId)
            Student st=Student.findById(s.studentId)
            data_list.add(st.gr_number)            
            String current_year=st.current_year   
            println("Current_year::"+current_year)
            String lower_current_year=current_year.toLowerCase()
            println("Lowercase Current Year::"+lower_current_year)
            lower_current_year=lower_current_year+"_rollno"            
            if(lower_current_year.equals("fy_rollno"))
            {
                rn=Integer.parseInt(st.fy_rollno.toString())
                data_list.add(""+rn)
            }
            if(lower_current_year.equals("sy_rollno"))
            {
                rn=Integer.parseInt(st.sy_rollno.toString())
                data_list.add(""+rn)
            }
            if(lower_current_year.equals("ty_rollno"))
            {
                rn=Integer.parseInt(st.ty_rollno.toString())
                data_list.add(""+rn)
            }
            if(lower_current_year.equals("btech_rollno"))
            {
                rn=Integer.parseInt(st.btech_rollno.toString())
                data_list.add(""+rn)
            }            
            println("Roll Number::"+rn)
            data_list.add(st.first_name)
            data_list.add(st.middle_name)   
            data_list.add(st.surname)      
            println("First Name:"+st.first_name+" Middle Name:"+st.middle_name+" Last Name:"+st.surname)
            if(entry_type_list.toString().equals("CO-wise"))
            {            
                        //let us find previsous dynamic co marks 
                        int trace_previous_co_flag=0
                         int tracemarks=0
                        for(COAssessmentMapping com:coassmap)
                        {
                            //Let us find in student marks               
                            def fin_sm=StudentMarks.findAllByStudentAndCo_assessment_mapping(st,com)
                            for(StudentMarks smvar:fin_sm)
                            {
                                println("Actual Marks::"+smvar.actual_marks+" CO Assemesment Mapping ID::"+smvar.co_assessment_mappingId)
                                //let us find coid from co_assessment_mappingId
                                COAssessmentMapping temp_com=COAssessmentMapping.findById(smvar.co_assessment_mappingId)
                                String val=temp_com.toString()
                                println("Val::"+val)
                                if(temp_com==null)
                                    data_list.add("0")
                                else
                                {
                                    tracemarks=1;
                                    println("Responsible CO::"+temp_com.coId)
                                    data_list.add(smvar.actual_marks);
                                    tot_marks=tot_marks+Integer.parseInt(smvar.actual_marks.toString())
                                }
                            }
                        }   
                            if(tracemarks==0)
                            {
                                for(int i=0;i<dynamic_co_count;i++)
                                {
                                    data_list.add("0")
                                }
                            }            
                        println("Total Marks after adding CO Marks::"+tot_marks)
                        data_list.add(tot_marks)
                        println(data_list)
                        serialno++
                        listOfLists.add(serialno,data_list)                    
             } 
             if(entry_type_list.toString().equals("Question-wise"))        
             {
                            //let us find previous dynamic question marks of students 
                            at=AssessmentType.findByCourse_typeAndEvaluation_type(course_type,"endSemester")
                            println("Assesment Name::"+at.assessment_type+" Id::"+at.id)
                            def qcm=QuestionCOMapping.findAllByCourseAndAssessment_typeAndAcademic_year(course,at,ay)
                            int trace_previous_question_flag=0
                             int tracemarks=0
                            for(QuestionCOMapping q:qcm)
                            {
                                //Let us find in student marks               
                                def fin_sm=QustionwiseMarks.findAllByStudentAndQuestion_co_mapping(st,q)
                                for(QustionwiseMarks qmvar:fin_sm)
                                {
                                    println("Actual Marks::"+qmvar.actual_marks+" Question CO Mapping ID::"+qmvar.question_co_mappingId)
                                    //let us find coid from question_co_mappingId
                                    QuestionCOMapping temp_qcm=QuestionCOMapping.findById(qmvar.question_co_mappingId)
                                    String val=temp_qcm.toString()
                                    println("Val::"+val)
                                    if(temp_qcm==null)
                                        data_list.add("0")
                                    else
                                    {
                                        tracemarks=1;
                                        println("Responsible CO::"+temp_com.coId)
                                        data_list.add(qmvar.actual_marks);
                                        tot_marks=tot_marks+Integer.parseInt(qmvar.actual_marks.toString())
                                    }
                                }
                            }   
                                if(tracemarks==0)
                                {
                                    for(int i=0;i<dynamic_question_count;i++)
                                    {
                                        data_list.add("0")
                                    }
                                }            
                            println("Total Marks after adding Question Marks::"+tot_marks)
                            data_list.add(tot_marks)
                            println(data_list)
                            serialno++
                            listOfLists.add(serialno,data_list)                    
                }    
        }
        row=serialno+1
        col=header_list.size()
        println("Final Listoflist::"+"row:"+row+" and col:"+col)
        println(listOfLists)
        session.split=split
        session.dynamic_co_list=dynamic_co_list
        session.dynamic_weight_list=dynamic_weight_list
        session.dynamic_question_list=dynamic_question_list
        session.dynamic_question_weight_list=dynamic_question_weight_list        
        finrow=row
        fincol=col
        println("Mark entry type:"+params.entry_type_list)
        session.entry_type_list=params.entry_type_list.toString()
        [coursecode:coursecode,coursename:coursename,course_type:course_type,year:year,teacher_div:teacher_div,dept_name:dept_name,exam:exam,mark_list:mark_list,co_list:co_list,listOfLists:listOfLists,split:split,row:row,col:col,static_col_size:static_col_size,dynamic_question_list:dynamic_question_list,dynamic_question_weight_list:dynamic_question_weight_list,entry_type_list:entry_type_list.toString(),academic_year_list:academic_year_list,semester_list:semester_list]
    }
    def storeMarks()
    {  
        if(session.entry_type_list.toString().equals("CO-wise")) 
        {
                int marks=0
                COAssessmentMapping coassmap=null        
                def cy = Calendar.getInstance().get(Calendar.YEAR);        
                String ay = cy +"-"+((cy%1000)+1);                
                println("I am in store marks...")
                String coursecode=params.coursecode
                println("Course Code::"+coursecode)
                String at=session.at
                println("Assessment Type::"+at)        
                println("Number of rows Including headers(2)::"+finrow)
                println("Number of cols::"+fincol)   
                println("User Values::"+params.matdata)        
                println("split::"+session.split)
                println("Dynamic CO list::"+session.dynamic_co_list)
                println("Dynamic Weight list::"+session.dynamic_weight_list)
                println(params)  
                int indexval=0
                String arr="",grno=""         
                def mat=new String[finrow*2][fincol*2] 
                for(int i=2;i<finrow;i++)
                {            
                    List mark_list = new ArrayList<String>()                         
                    //arr=""
                    for(int j=0;j<fincol;j++)
                    {                
                        mat[i][j]=params.matdata[indexval]
                        if(j==1)
                            grno=params.matdata[indexval]
                        if(j>=6)
                            mark_list.add(params.matdata[indexval])
                        indexval++
                    }        
                   println("Gr number::"+grno+" marks:"+mark_list)
                    Student st=Student.findByGr_number(grno)
                   // println("student id::"+st.id)
                    Course course = Course.findByCourse_code(coursecode)
                    AssessmentType ass_type=AssessmentType.findByAssessment_type(at)
                    println("Course::"+course+" AssessmentType:"+ass_type)
                    //Let us find student id and co-assessment mapping id
                    if(session.split.equals("no"))
                    {
                        println("splitting not needed..")
                        for(int k=0;k<session.dynamic_co_list.size();k++)
                        {
                            String coid=session.dynamic_co_list[k]  
                            String weight=session.dynamic_weight_list[k]
                            println("entry for co::"+coid+" and corrosponding weight::"+weight)
                            //let us find co from coid
                            CO co=CO.findById(coid)
                            println("CO::"+co)
                            //let us find COAssesmentMapping from course,assesment type,co and academic year
                            coassmap=COAssessmentMapping.findByCourseAndCoAndAssessment_typeAndAcademic_year(course,co,ass_type,ay)
                            println("COAssessmentMapping::"+coassmap)
                            marks=Integer.parseInt(mark_list[k])
                            println("Marks to enter:"+marks)
                            boolean flag=InformationService.store_student_marks(st,coassmap,marks,session.semester_list.toString())
                        }
                    }
                    if(session.split.equals("yes"))
                    {
                        println("splitting required...")
                        marks=Integer.parseInt(mark_list[mark_list.size()-1])
                        //Let us find totalweight
                        int total_weight=0                
                        for(int m=0;m<session.dynamic_co_list.size();m++)
                        {
                                String weight=session.dynamic_weight_list[m]
                                double weight_temp=Double.parseDouble(weight)
                                total_weight=total_weight+(int)weight_temp
                         } 
                         println("Actual Marks::"+marks)
                         println("Total Weight::"+total_weight)
                         int fin_marks=0
                        for(int k=0;k<session.dynamic_co_list.size();k++)
                        {
                            String coid=session.dynamic_co_list[k]  
                            String weight=session.dynamic_weight_list[k]
                            double weight_temp=Double.parseDouble(weight)                    
                            println("entry for co::"+coid+" and corrosponding weight::"+weight)
                            //let us find co from coid
                            CO co=CO.findById(coid)
                            println("CO::"+co)
                            //let us find COAssesmentMapping from course,assesment type,co and academic year
                            coassmap=COAssessmentMapping.findByCourseAndCoAndAssessment_typeAndAcademic_year(course,co,ass_type,ay)
                            println("COAssessmentMapping::"+coassmap)
                            double ans=marks*weight_temp/total_weight
                            fin_marks=ans
                            println("Marks to enter:"+fin_marks)
                            //now one total entry is solitted cowise                       
                            boolean flag=InformationService.store_student_marks(st,coassmap,fin_marks)                    
                        }              
                    }           
                }
        }
        if(session.entry_type_list.toString().equals("Question-wise")) 
        {
                int marks=0
                COAssessmentMapping coassmap=null        
                def cy = Calendar.getInstance().get(Calendar.YEAR);        
                String ay = cy +"-"+((cy%1000)+1);                
                println("I am in store marks...")
                String coursecode=params.coursecode
                println("Course Code::"+coursecode)    
                Course course=Course.findByCourse_code(coursecode)
                 String cid=course.id                
                CourseType course_type=InformationService.getCourseTypefromCourseCode(coursecode)
                println("course type::"+course_type.type)
                AssessmentType atype=AssessmentType.findByCourse_typeAndAssessment_typeAndEvaluation_type(course_type,"ESE","endSemester")
                println("Assesment Type:"+atype);
                println("Number of rows Including headers(2)::"+finrow)
                println("Number of cols::"+fincol)   
                println("User Values::"+params.matdata)        
                println("Dynamic Question list::"+session.dynamic_question_list)
                println("Dynamic Quesion Weight list::"+session.dynamic_question_weight_list)                
                println(params)  
                int indexval=0
                String arr="",grno=""         
                def mat=new String[finrow*2][fincol*2] 
                for(int i=2;i<finrow;i++)
                {            
                    List mark_list = new ArrayList<String>()                         
                    //arr=""
                    for(int j=0;j<fincol;j++)
                    {                
                        mat[i][j]=params.matdata[indexval]
                        if(j==1)
                            grno=params.matdata[indexval]
                        if(j>=6)
                            mark_list.add(params.matdata[indexval])
                        indexval++
                    }        
                   println("Gr number::"+grno+" marks:"+mark_list)
                    Student st=Student.findByGr_number(grno)
                   // println("student id::"+st.id)
                     println("splitting not needed..")
                     List generated_coid_list = new ArrayList<String>()  
                     List generated_weight_list=new ArrayList<String>()
                     List generated_actual_co_mark_list=new ArrayList<String>()
                        for(int k=0;k<session.dynamic_question_list.size();k++)
                        {
                            String qid=session.dynamic_question_list[k]  
                            String qweight=session.dynamic_question_weight_list[k]
                            if(Integer.parseInt(qweight)>0)  //if weight is nonzero
                            {
                                println("entry for question::"+qid+" and corrosponding weight::"+qweight)
                                //Let us find linking weight between question and CO including options
                                def qcm=QuestionCOMapping.findAllByAcademic_yearAndQnoAndCourseAndAssessment_type(ay,qid,course,atype)
                                //println("Queston Number:"+qid)
                                for(QuestionCOMapping q:qcm)
                                {
                                  //  println("Question ID:"+q.qno+" "+" Option:"+q.opno+" Max Marks:"+q.maxmarks+"Responsible CO:"+q.co.id)
                                    //first search earlier coid from list
                                    int flag=0
                                    for(int ii=0;ii<generated_coid_list.size();ii++)
                                    {                                       
                                        if(generated_coid_list[ii].equals(q.co.id))
                                        {
                                            flag=1
                                            break;
                                        }
                                    }       
                                    if(flag==0)
                                        generated_coid_list.add(q.co.id)                                    
                                }
                            }
                        }
                        println("Distinct CO ids:"+generated_coid_list)
                        for(int k=0;k<session.dynamic_question_list.size();k++)
                        {
                            String qid=session.dynamic_question_list[k]  
                            String qweight=session.dynamic_question_weight_list[k]
                            if(Integer.parseInt(qweight)>0)  //if weight is nonzero
                            {
                                //Let us find linking weight between question and CO including options
                                generated_weight_list=new ArrayList<String>() 
                                generated_actual_co_mark_list=new ArrayList<String>()
                                int total_co_sum=0
                                for(int ii=0;ii<generated_coid_list.size();ii++)
                                {               
                                    //let us find CO using id                                    
                                    CO co=CO.findById(generated_coid_list[ii])
                                    //println("Final testing::"+co)
                                    def qcm=QuestionCOMapping.findAllByAcademic_yearAndQnoAndCourseAndAssessment_typeAndCo(ay,qid,course,atype,co)
                                    println("Queston Number:"+qid) 
                                    int single_co_sum=0
                                    for(QuestionCOMapping q:qcm)
                                    {
                                        if(qid==q.qno)
                                        {
                                            //println("Question ID:"+q.qno+" "+" Option:"+q.opno+" Max Marks:"+q.maxmarks+"Responsible CO:"+q.co.id)                                     
                                            single_co_sum=single_co_sum+q.maxmarks
                                        }
                                    }
                                    generated_weight_list.add(single_co_sum)
                                    total_co_sum=total_co_sum+single_co_sum  
                                }
                                println("CO wise marks distibution::"+generated_weight_list)
                                println("Total CO sum:"+total_co_sum)
                                //let us find mapping of question marks to co marks distribution
                                println("Actual marks to Question "+qid+":"+mark_list[k])
                                double ratio=(Integer.parseInt(mark_list[k])*1.0)/total_co_sum
                                double comarks=0
                                println("Ratio:"+ratio)
                                for(int jj=0;jj<generated_weight_list.size();jj++)
                                {
                                    comarks=ratio*generated_weight_list[jj]
                                    println("CO marks:"+comarks)
                                    generated_actual_co_mark_list.add(comarks)
                                }
                            }
                           //Code for inserting into database
                           boolean db_flag=InformationService.store_questionwise_cowise_marks(session.semester_list.toString(),Integer.parseInt(mark_list[k]),grno,ay,qid,course,generated_coid_list,atype,generated_actual_co_mark_list)
                        }
                        
                            //let us find co from coid
                         /*   CO co=CO.findById(coid)
                            println("CO::"+co)
                            //let us find COAssesmentMapping from course,assesment type,co and academic year
                            coassmap=COAssessmentMapping.findByCourseAndCoAndAssessment_typeAndAcademic_year(course,co,ass_type,ay)
                            println("COAssessmentMapping::"+coassmap)
                            marks=Integer.parseInt(mark_list[k])
                            println("Marks to enter:"+marks)
                            boolean flag=InformationService.store_student_marks(st,coassmap,marks)*/                         
                        //psc
//                        def cos = CO.findByCourse()
                }            
        }
    }
    def questionCOMapping()
    {
        println("I am in QuestionCOMapping...")
        def courses = Course.findAllByEmployee(session.employee)
        session.courses = courses
       // println(session.courses.size)
        List course_list = new ArrayList<String>()
        for(Course c:courses)
        {
            course_list.add(c.course_code+":"+c.course_name)            
        }        
        println("course "+course_list)
       // [emps:emps,courses:courses,emp_list:emp_list,course_list:course_list]
       List question_list = new ArrayList<String>()
       for(int i=1;i<=10;i++)
        question_list .add(i)
       println("Question List::"+question_list )
       session.question_list=question_list
       
       [course_list:course_list,question_list :question_list ]        
    }
    def questionEntry()
    {
        println("I am in QuestionCOMap")
        println(params)
        println(params.course_list)
        String coursename_coursecode=params.course_list
        //Extract Course code from combine coursename_coursecode
        int flag=0
        String coursecode="",coursename=""
        for(int i=0;i<coursename_coursecode.length();i++)
        {
            if(coursename_coursecode.charAt(i)==':')       
            {
                flag=1
                continue;
            }
            if(flag==1)
                coursename=coursename+coursename_coursecode.charAt(i)
            if(flag==0)
                coursecode=coursecode+coursename_coursecode.charAt(i)
        }
        println("course code::"+coursecode)         
        //Let us find Course outcomes for this course                        
        Course course = Course.findByCourse_code(coursecode)
        println("Course::"+course)
        def co=InformationService.getCOsfromCourse(course)
        List co_list = new ArrayList<String>()
        List final_co_list = new ArrayList<String>()        
        List co_weight_list = new ArrayList<String>()        
        for(CO c:co)
        {
            co_list.add(c.co_code+"."+c.co_statement)            
        }
        println("CO:"+co_list)
        //let us find out course type from course code
        String course_type=InformationService.getCourseTypefromCourseCode(coursecode)
        println("course type::"+course_type)
        CourseType ct=CourseType.findByType(course_type)
        //Let us find assesmnet type from course type, and evalaution type endSemester
        AssessmentType at=AssessmentType.findByCourse_typeAndEvaluation_type(ct,"endSemester")
        println("Assesment Name::"+at.assessment_type+" Id::"+at.id)
        //let us find cowise weightage distribution
        def cy = Calendar.getInstance().get(Calendar.YEAR);        
        String ay = cy +"-"+((cy%1000)+1);
        def coam=null
        for(CO c:co)
        {                 
            coam=COAssessmentMapping.findByAcademic_yearAndCourseAndCoAndAssessment_type(ay,course,c,at) 
            if(coam.weightage>0)
            {
                final_co_list.add("CO"+c.id)
                co_weight_list.add(coam.weightage)
            }
        }
        println("CO List:"+co_list)        
        println("CO weight List:"+co_weight_list)
        session.coursecode=coursecode
        session.coursename=coursename
        session.co_list=co_list
        session.co_weight_list=co_weight_list
        session.final_co_list=final_co_list
       [coursecode:coursecode,coursename:coursename,co_list:co_list,co_weight_list:co_weight_list,final_co_list:final_co_list]
    }
    def questionOptionEntry()
    {
        println("I am in question option entry..")
        println("Number of question selected..."+params.question_list)
        String noq_temp=params.question_list
        int noq=Integer.parseInt(noq_temp)
        session.noq=noq
        //let us find previous records
        
    }
    def questionOptionTableChart()
    {
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        println("I am in questionOptionTableChart")        
        println("Number of questions::"+session.noq)
        println("Selected options::"+params.selected_option_list) 
        List ls=params.selected_option_list
        session.selected_option_list=ls
        println("List of CO::"+session.final_co_list)
        List temp=null
        List temp1=new ArrayList<String>()
        listOfLists.add(temp1)
        int noo
        for(int i=0;i<params.selected_option_list.size();i++)
        {
            int x=97;
            temp = new ArrayList<String>()                    
            noo=Integer.parseInt(params.selected_option_list[i])
            for(int j=0;j<noo;j++)
            {                
                char ans=(char)x;
                temp.add(""+ans)
                x++;
            }
            println(temp)
            listOfLists.add(temp)            
        }
        [listOfLists:listOfLists]
    }
    def storequestionCOMap()
    {
        int index=0,maxmarks=0;
        int noq=session.noq
        println("I am in storequestionCOMap")
        println("Number of question::"+session.noq)
        println("Number of options::"+session.option_list)
        def cy = Calendar.getInstance().get(Calendar.YEAR);
        String ay = cy +"-"+((cy%1000)+1);
        println("Academic Year::"+ay)
        Course course = Course.findByCourse_code(session.coursecode)
        println("Course::"+course)
        String course_type=InformationService.getCourseTypefromCourseCode(session.coursecode)
        println("course type::"+course_type)
        CourseType ct=CourseType.findByType(course_type)
        //Let us find assesmnet type from course type, and evalaution type endSemester
        AssessmentType at=AssessmentType.findByCourse_typeAndEvaluation_type(ct,"endSemester")
        println("Assesment Name::"+at.assessment_type+" Id::"+at.id)
        
        println("CO wise distribution") 
        int x=97
        char y
        for(int i=1;i<=noq;i++)    
        {
            x=97
            int noo=Integer.parseInt(session.selected_option_list[i-1].toString())
            for(int j=1;j<=noo;j++)
            {         
                y=(char)x
                x++
                for(int k=0;k<session.final_co_list.size();k++)
                {
                    String temp=session.final_co_list[k]
                    String co_code=""
                    for(int m=2;m<temp.length();m++)
                        co_code=co_code+temp.charAt(m)
                    //println(co_code)
                   CO co=CO.findByCo_code(co_code)
                  // println(co)
                   if(params.data[index].toString().equals(""))
                        maxmarks=0
                   else
                        maxmarks=Integer.parseInt(params.data[index].toString())
                   //println("index::"+index)
                   //insert or update into database code
                   boolean flag=InformationService.store_question_co_mapping(ay,course,at,co,""+i,""+y,maxmarks)
                    index++
                }               
            }   
        }
    }
}
