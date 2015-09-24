package nba_vit

class EmployeeHomeController {

    def index() { }
    def home(){
        println("in emp home")
    }
    def HOD(){
        println("in hod")
        Employee emp = Employee.findByEmployee_code(session.user)
        [emp:emp]
    }
    def Director(){
        println("in director")
    }
    def Student(){
        println("in student")
    }
    
}
