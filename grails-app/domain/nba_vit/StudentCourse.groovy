package nba_vit

class StudentCourse {
    Student student
    String student_division
    CourseOffering courseOffering
       
    static belongsTo=[student:Student,courseOffering:CourseOffering]

    static constraints = {
    }
}
