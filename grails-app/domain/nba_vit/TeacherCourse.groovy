package nba_vit

class TeacherCourse {
    String teacher_divison
    
    static belongsTo=[employee:Employee,course_offering:CourseOffering]   
    
    static constraints = {
    }
}
