package nba_final

import grails.transaction.Transactional
import groovy.model.DefaultTableModel
import groovy.swing.SwingBuilder
import javax.swing.JTable
import nba_vit.Program
import nba_vit.QuestionCOMapping
import nba_vit.QuestionCOMapping
import nba_vit.QustionwiseMarks
import nba_vit.QustionwiseMarks
import nba_vit.Student
import nba_vit.StudentCourse
import nba_vit.StudentMarks
import nba_vit.Course
import nba_vit.Employee
import nba_vit.Department
//import nba_vit.CourseOutcome
import nba_vit.CourseOffering
import nba_vit.CO
import nba_vit.PO
import nba_vit.COAssessmentMapping
import nba_vit.AssessmentType
import org.grails.datastore.mapping.core.Session
import javax.servlet.http.HttpSession
import org.springframework.web.servlet.tags.Param
import org.springframework.web.context.request.RequestContextHolder


@Transactional
class InformationService {

    def serviceMethod() {
    }
    
    private HttpSession getSession(){
        return RequestContextHolder.currentRequestAttributes().getSession()
    }
    
    List getCoursefromProgram(program)
    {
        //        println("getting courses by program "+program)
        Program prog = Program.findByName(program)
        //        println(prog.department)
        def progs = Program.findAllByDepartment(prog.department)
        //        println(progs)
        //        println(progs.)
        //        def courses = Course.findAllByProgram { Program.name in ['B.Tech-Computer'] }
        //        String query = "program.name == 'IT' || program.name=='B.Tech-Computer'";
        //        def courses = Course.findAll{ program.name == 'IT' || program.name=='B.Tech-Computer'}
        //        def courses = Course.findAll{ program.name == progs[0].toString()}
        //        def courses = Course.findAll{ query }
        //        println(courses)      
        List course_list=new ArrayList();
        for(Program p: progs)
        {
            def crs = Course.findAll{ program.name == p.name }
            if(crs.size() > 0)
            for(Course c : crs)
            course_list.add(c)
        }
        println(course_list)  
        return course_list
        //        def var = 'IT'
        //        Closure query1={program.name == var}
        //        println(courses.findAll(query1))
        //        Course course = new Course();
        //        String query = "select course_name from Course where program = 'IT' "//+username+"' "    
        //        def otpdata=course.executeQuery(query)
        //        println(otpdata)
        
        
        
        //        String dept_query = "select department from Program where name='asdf'"//+program+"'"
        //        println("dept_query="+dept_query)
        //        Program prog = new Program()
        //        def dept = Program.executeQuery(dept_query)
        //        println("dept="+dept)
        //        String all_prog = "select name from Program where department_id="+dept    
        //        def depts = Program.executeQuery(all_prog)
        //        println("all progs ="+depts)
        //        String query1 = "select name from Program where employee_Id ='"+username+"'"
        
    }
    
    List getEmployeefromProgram(program)
    {
        println("getting employees by program "+program)
        Program prog = Program.findByName(program)
        println(prog.department)
        def progs = Program.findAllByDepartment(prog.department)
        println(progs)
        List emp_list=new ArrayList();
        for(Program p: progs)
        {
            def emp = Employee.findAll{ program == p }
            if(emp.size() > 0)
            for(Employee e : emp)
            emp_list.add(e)
        }
        println(emp_list)
        return emp_list
    }
    
    Program getProgramFromEmp(emp)
    {
        Program prog = Program.findByName(emp.program)
        return prog
    }
    
    List getProgramsFromEmp(emp)
    {
        Program prog = Program.findByName(emp.program)
        println(prog.department)
        def progs = Program.findAllByDepartment(prog.department)
        //        println(progs)
        return progs
    }
    
    Department getDepartmentFromUser(user)
    {
        Employee emp = getEmployeeFromUser(user)
        Program prog = Program.findByName(emp.program)
        return prog.department
    }
    
    Employee getEmployeeFromUser(user)
    {
        Employee emp = Employee.findByEmployee_code(user)
        //        println(emp)
        return emp
    }
    
    List getCOsfromCourse(course)
    {
        return CO.findAllByCourse(course)
    }
    
    List getPOsfromProgram(program)//vikas
    {
        //return PO.findAllByProgram(program)
         return PO.findAllByProgramAndIs_current(program,true) 
    }
    
     List getPOsttfromProgram(program)//vikas
    {
        //return PO.findAllByProgram(program)
         return PO.findAllByProgramAndIs_current(program,true).po_statement
    }

    
    
    List getCoursesByYear(year)
    {
        List courseOffered = CoursesOffering.findAll{Course.year=year}
        List courses = new ArrayList<Course>()
        for(CourseOffering coffer : courseOffered)
        {
            courses.add(course.course)
        }
        return courses
    }
    
    String getCOPOTable()
    {
        println("now getting table")
        Course course = Course.findByCourse_code("CS20105")
        Program program = course.program
        def cos = CO.findAllByCourse(course)
        def pos = PO.findAllByProgram(program)
        println("cos="+cos)
        println("pos="+pos)
        
        return str
    }
    
    Course getCourse(code)
    {
        return Course.findByCourse_code(code)
    }
    def getCoursesByProgramAndYear(program, year)
    {
        //Program program = Program.findByName("Master of Computer Applications")
        def courses = Course.list()
        println(courses)
        List courseList = new ArrayList<Course>()
        println("finding courses for "+program)
        for(Course c : courses)
            for(Program p : c.program)
                if(p.name == program.name && c.year == year)
                    courseList.add(c)
        
        println("Courses that belong to "+courseList)
        return courseList
    }
    def getCOFromCourse(course)
    {
        String qcid = "select id from Course where course_code = '"+course+"'"// 'cs42115'"
        def cid = Course.executeQuery(qcid)
        //   println(cid)
        //  String qco = "select co_statement from CO where course = '"+cid[0]+"'"//'1'"
        //String qco = "select co_code from CO where course = '"+cid[0]+"'"//'1'"
        String qco = "select co_code from CO where course = '"+cid[0]+"' and is_current = true"//'1'"
        def co = CO.executeQuery(qco)
        //  println("CO:"+co)
        return co //list
    }
    
    def getCOSttFromCourse(course)//vikas
    {
        String qcid = "select id from Course where course_code = '"+course+"'"// 'cs42115'"
        def cid = Course.executeQuery(qcid)
     //   println(cid)
        String qco = "select co_statement from CO where course = '"+cid[0]+"' and is_current = true"//'1'"
      //String qco = "select co_code from CO where course = '"+cid[0]+"'"//'1'"
        def co = CO.executeQuery(qco)
        println("CO....:"+co)
        return co //list
    }
    
    def getCourseFromEmployee(emp)
    {
        //   println("Employee"+emp)
        
        String qeid = "select id from Employee where employee_code = '"+emp+"'"// 'cs42115'"
        def eid = Employee.executeQuery(qeid)
        //  println(eid)
        String qcrs = "select course_code from Course where employee = '"+eid[0]+"'"//'1'"
        def crs = CO.executeQuery(qcrs)
        //println("Course:"+crs)
        return crs //list
    }

    List getPOCodefromProgram(program)//vikas
    {
        //return PO.findAllByProgram(program).po_code
        return PO.findAllByProgramAndIs_current(program,true).po_code
    }

    String getCourseTypefromCourseCode(String course_code)
    {
        Course course = Course.findByCourse_code(course_code)
        // println("printing course::"+course)
        return course.course_type
    }
    String getAssociatedCoursefromCourseCode(String course_code)
    {
        Course course = Course.findByCourse_code(course_code)
        // println("printing course::"+course)
        return course.associated_course
    }   
    List getAssessmentTypefromCourseCode(String course_code)
    {        
        Course course = Course.findByCourse_code(course_code)
        // String course_type=course.course_type
        List at=AssessmentType.findAllByCourse_type(course.course_type)
        //println(at)
        return at
    }
    List findWeightfromCOAssessmentMapping(String course_code,String ay)
    {
        Course course = Course.findByCourse_code(course_code)       
        List cm=COAssessmentMapping.findAllByCourseAndAcademic_year(course,ay)
        println("testing::"+cm)
        return cm
    }
    boolean storeWeightintoCOAssessmentMapping(String course_code,String ay,List asstype_list,int finrow,int fincol,params)
    {
        println("service::"+course_code+" "+ay+" "+asstype_list+" "+finrow+" "+fincol)
        def matdata=new double[finrow][fincol]   
        int count=0;
        println("\n Entered data by user...")
        for(int i=0;i<finrow;i++)
        {
            for(int j=0;j<fincol;j++)
            {
                matdata[i][j]=Double.parseDouble(params.matdata[count++])    
                println(matdata[i][j])
            }            
        } 
        //First check earlier records are available or not
        Course course = Course.findByCourse_code(course_code)      
        List cm=COAssessmentMapping.findAllByCourseAndAcademic_year(course,ay)   
        println("Earlier records::"+cm)        
        if(cm.empty==true)  //insert
        {
            println("Earlier records not present....");
            //Now insert records
            /* COAssessmentMapping coam=new COAssessmentMapping()
            coam.setAcademic_year(ay)
            coam.setWeightage(10)
            coam.setCourse(course)
            coam.setCo(co)
            coam.setAssessment_type(at)
            coam.save()
            println("record inserted successfully...")*/
            COAssessmentMapping coam=null
            CO co=null
            AssessmentType at=null            
            for(int i=0;i<finrow;i++)  //Number of CO
            {
                for(int j=0;j<fincol;j++)  //Number of Assesment type
                {
                    co=CO.findByCo_code(""+(i+1))
                    at=AssessmentType.findByAssessment_type(asstype_list[j])                     
                    coam=new COAssessmentMapping()
                    coam.setAcademic_year(ay)                   
                    coam.setWeightage(matdata[i][j]) 
                    coam.setCourse(course)     
                    coam.setCo(co)                    
                    coam.setAssessment_type(at)
                    coam.save()                   
                }            
            } 
            println("record inserted successfully...")
        }
        else   //update
        {
            println("Now in record update...")  
            /*   def course1 = Course.findByCourse_code(course_code)      
            println("Course ID::"+course1.id)
            String course_val=course1.id
            COAssessmentMapping coam=new COAssessmentMapping() 
            double otpval=33            
            String query="update COAssessmentMapping set weightage="+otpval+" where course='"+course_val+"' and academic_year='"+ay+"' "
            println(query)
            int test=coam.executeUpdate(query)          
            println("record updated scuccessfully..."+test)  */   
            COAssessmentMapping coam=null                       
            def course1=null 
            def co=null
            def at=null
            String course_val="",co_val="",at_val=""
            for(int i=0;i<finrow;i++)  //Number of CO
            {
                for(int j=0;j<fincol;j++)  //Number of Assesment type
                {
                    course1=Course.findByCourse_code(course_code)      
                    course_val=course1.id                    
                    co=CO.findByCo_code(""+(i+1))
                    co_val=co.id                    
                    at=AssessmentType.findByAssessment_type(asstype_list[j])                     
                    at_val=at.id
                    coam=new COAssessmentMapping()
                    String query="update COAssessmentMapping set weightage="+matdata[i][j]+" where course='"+course_val+"' and co='"+co_val+"' and assessment_type='"+at_val+"' and academic_year='"+ay+"' "
                    println(query)
                    int test=coam.executeUpdate(query)          
                    println("record updated successfully..."+test) 
                    if(test==0)
                    {
                        coam.setAcademic_year(ay)                   
                        coam.setWeightage(matdata[i][j]) 
                        coam.setCourse(course1)     
                        coam.setCo(co)                    
                        coam.setAssessment_type(at)
                        coam.save()                   
                        println("record inserted successfully....")
                    }
                }            
            } 
            println("record updated successfully...")
            
            
        }
        return true
    }
    
    
    def getCoursesForProgram(program)
    {
        def courses = Course.list()
        def cList = new ArrayList<Course>()
        for(Course course: courses)
        {
            def progs = course.program
            for(Program p:progs)
            {
                if(p.name == program.name)
                {
                    cList.add(course)
                    break
                }
            }
        }
        return cList
    }

    String getDepartmentfromCourse(course)
    {
        //code modified by PSC
        List program_list
        def pList = course.program
        Program prog = pList.getAt(0)
//        Program prog = Program.findByName(course.program)
        
        println("course::"+course)
        println("program::"+prog)
        println("Department ID::"+prog.departmentId)
        Department dept=Department.findById(prog.departmentId)
        //println("Department::"+dept.name)
        String dept_name=dept.name
        return dept_name
    }    
    CourseOffering getCourseOfferingfromCourse(course)
    {
        def cy = Calendar.getInstance().get(Calendar.YEAR);        
        String ay = cy +"-"+((cy%1000)+1);        
        println("Academic Year::"+ay+" and Course ID:"+course.id)
        CourseOffering co=CourseOffering.findByCourseAndAcadamic_year(course,ay)
        return co
    }
    List getStudentListfromStudentCourse(coff,teacher_div)    
    {
        def st=StudentCourse.findAllByCourse_offeringAndStudent_division(coff,teacher_div)
        return st
    }
    boolean store_question_co_mapping(String ay,Course course,AssessmentType at,CO co,String qno,String opno,int maxmarks)
    {
        //First check earlier records are available or not
       QuestionCOMapping qcm=QuestionCOMapping.findByCourseAndCoAndAssessment_typeAndAcademic_yearAndQnoAndOpno(course,co,at,ay,qno,opno)
       println("Earlier records::"+qcm) 
        if(qcm==null)  //insert
        {
            println("Earlier records not present....");
            qcm=new QuestionCOMapping()
            qcm.setCourse(course)
            qcm.setCo(co)
            qcm.setAssessment_type(at)
            qcm.setAcademic_year(ay)  
            qcm.setQno(qno)                        
            qcm.setOpno(opno)  
            qcm.setMaxmarks(maxmarks)                                                
            qcm.save()
            println("record inserted successfully...")
        }
        else   //update
        {
            println("Now in record update...")  
            String course_id=course.id
            String co_id=co.id
            String at_id=at.id
            qcm=new QuestionCOMapping()
            String query="update QuestionCOMapping set maxmarks="+maxmarks+" where course='"+course_id+"' and co='"+co_id+"' and assessment_type='"+at_id+"' and academic_year='"+ay+"' and qno='"+qno+"' and opno='"+opno+"' "
            println(query)
            int test=qcm.executeUpdate(query)          
            println("record updated successfully..."+test)
         } 
        //println("record updated successfully...")                                        
       return true 
    }
    boolean store_student_marks(Student st,COAssessmentMapping coassmap,int marks,String semester)
    {
        //First check earlier records are available or not
        StudentMarks sm = StudentMarks.findByStudentAndCo_assessment_mappingAndSemester(st,coassmap,semester)      
        println("Earlier records::"+sm)        
        if(sm==null)  //insert
        {
            println("Earlier records not present....");
            sm=new StudentMarks()
            sm.setActual_marks(marks)
            sm.setCo_assessment_mapping(coassmap)
            sm.setStudent(st)
            sm.setSemester(semester)
            sm.save()
           println("record inserted successfully...")
        }
        else   //update
        {
            println("Now in record update...")  
            String st_id=st.id
            String coassmap_id=coassmap.id
            sm=new StudentMarks()
            String query="update StudentMarks set actual_marks="+marks+" where student='"+st_id+"' and co_assessment_mapping='"+coassmap_id+"' and semester='"+semester+"' "
            println(query)
            int test=sm.executeUpdate(query)          
            println("record updated successfully..."+test)
         } 
      //  println("record updated successfully...")                                
        return true
    }
  boolean store_questionwise_cowise_marks(String semester,int qmarks,String grno,String ay,String qid,Course course,List generated_coid_list,AssessmentType atype,List generated_actual_co_mark_list)
  {
      println("I am in store questionwise and cowise marks")
      //let us find question co mapping
      QuestionCOMapping qcm=null
      QustionwiseMarks qm=null
      COAssessmentMapping com=null
      Student st=Student.findByGr_number(grno)
      println("Student ::"+st)
      //reflect into questinwise marks
      int flag=0
      for(int i=0;i<generated_coid_list.size();i++)
      {
        CO co=CO.findById(generated_coid_list[i])  
        qcm=QuestionCOMapping.findByAcademic_yearAndQnoAndCourseAndCoAndAssessment_type(ay,qid,course,co,atype)
        //println("Question CO Mapping::"+qcm)
        qm=QustionwiseMarks.findBySemesterAndStudentAndQuestion_co_mapping(semester,st,qcm)
        //First check earlier records are available or not
        flag=1
        if(qm==null)  //insert
        {
            println("Earlier records not present....");
            qm=new QustionwiseMarks()
            qm.setSemester(semester)
            qm.setStudent(st)
            qm.setQuestion_co_mapping(qcm)
            qm.setActual_marks(qmarks)
            qm.save()
            println("record inserted into question wise marks successfully...")
        }
        else   //update
        {
            println("Now in record update...")  
            String st_id=st.id
            String qcm_id=qcm.id
            qm=new QustionwiseMarks()
            String query="update QustionwiseMarks set actual_marks="+qmarks+" where student='"+st_id+"' and question_co_mapping='"+qcm_id+"' and semester='"+semester+"' "
            println(query)
            int test=qm.executeUpdate(query)          
            println("record updated successfully into questionwise marks..."+test)
         } 
        if(flag==1)
            break
      }
      //reflect into student marks
      for(int i=0;i<generated_coid_list.size();i++)
      {
            CO co=CO.findById(generated_coid_list[i])
            com=COAssessmentMapping.findByAcademic_yearAndCourseAndCoAndAssessment_type(ay,course,co,atype)
            sm=StudentMarks.findByStudentAndCo_assessment_mappingAndSemester(st,com,semester)
            if(sm==null)  //insert
            {
                println("Earlier records not present....");
                sm=new StudentMarks()
                sm.setSemester(semester)
                sm.setStudent(st)
                sm.setCo_assessment_mapping(com)
                sm.setActual_marks(Integer.parseInt(generated_actual_co_mark_list[i]))
                sm.save()
                println("record inserted into co wise marks successfully...")
            }
            else   //update
            {
                println("Now in record update...")  
                String st_id=st.id
                String com_id=com.id
                sm=new StudentMarks()
                String query="update StudentMarks set actual_marks="+Integer.parseInt(generated_actual_co_mark_list[i])+" where student='"+st_id+"' and co_assessment_mapping='"+com_id+"' and semester='"+semester+"' "
                println(query)
                int test=sm.executeUpdate(query)          
                println("record updated successfully into cowise marks..."+test)
             }             
      }
      return true
  }
    
    
    
    
}
