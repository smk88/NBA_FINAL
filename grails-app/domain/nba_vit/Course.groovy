package nba_vit

class Course {
    String course_code
    String course_name    
    int course_credit
    boolean has_tutortial
    String semester
    String module
    String year
    static belongsTo=[program:Program,courseCategory:CourseCategory,course_type:CourseType,employee:Employee]
    
    String toString(){
        course_code
    }
    static constraints = {
        semester nullable : true
        module nullable : true
        has_tutorial nullable : true
    }
}
