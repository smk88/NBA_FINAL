package nba_vit

class Course {

    String course_code
    String course_name
    CourseType coursetype
    int credit    
    int semester
    int module
    Employee  employee    
    
    static belongsTo=[coursetype:CourseType,employee:Employee]
    
    String toString(){
        course_code
    }
    static constraints = {
        course_code nullable:false
    }
}
