package nba_vit

class Course {
    String course_code
    String course_name    
    int course_credit
    String year    
    static belongsTo=[associated_course:Course,courseCategory:CourseCategory,course_type:CourseType,employee:Employee]
    static hasMany = [program: Program]
    
    String toString(){
        course_code
    }
    static constraints = {       
        course_code unique : true   
    }
}
