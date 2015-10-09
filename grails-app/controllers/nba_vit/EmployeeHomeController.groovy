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
    def index() { }
    def home(){
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
       // if(session.usertype.toString()=="HOD" || session.usertype.toString()=="Director")
//        {
//            println(session)
            Employee emp = Employee.findByEmployee_code(session.user)
//          s  [emp:emp]
//            println("emps="+emp)
            Course course = Course.findByProgram(session.program)
//            [courses:courses]
//            println("cors"+courses)
//        }
    }
    def Director(){
        println("in director")
    }
//    def courseCoordinator(){
//        println("in course coordinator")
//    }
    def CourseOwner(){
        println("in course Owner")
//        render(view:'/NBA_VIT/EmployeeHome/courseCoordinator/create')
    }
    def Student(){
        println("in student")
    }
    
    def assignCoordinator(){
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
    }
    
    def updateCoordinator()
    {
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
        redirect(controller:'courseOutcome',action:'create')
    }
    
}
