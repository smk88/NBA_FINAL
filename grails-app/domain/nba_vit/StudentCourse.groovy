package nba_vit

class StudentCourse {
  
    String student_division
       
    static belongsTo=[student:Student,course_offering:CourseOffering]

    static constraints = {
    }
}
