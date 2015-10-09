package nba_final

import grails.transaction.Transactional
import nba_vit.Program
import nba_vit.Course
import nba_vit.Employee
import nba_vit.Department
import nba_vit.CourseOutcome
import nba_vit.CourseOffering

@Transactional
class InformationService {

    def serviceMethod() {

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
    
    List getCOforCourse(course)
    {
        return CourseOutcome.findAllByCourse(course)
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
}
