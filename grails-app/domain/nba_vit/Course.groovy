package nba_vit

class Course {
    String course_code
    String course_name    
    int course_credit    
    int semester
    int module
    static belongsTo=[program:Program, course_type:CourseType,employee:Employee]
    
    String toString(){
        course_code
    }
    static constraints = {
         
    }
}
