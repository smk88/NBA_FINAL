package nba_vit

class Course {
    String course_code
    String course_name    
    int course_credit
    boolean has_tutortial
    int semester
    int module
    String year
    static belongsTo=[program:Program,courseCategory:CourseCategory,course_type:CourseType,employee:Employee]
    
    String toString(){
        course_code
    }
    static constraints = {
         
    }
}
