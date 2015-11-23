package nba_vit

class AssessmentType {
    static belongsTo=[course_type:CourseType]
    String assessment_type  //ESE,Lab,CT,MSE
    String evaluation_type // inSemester , endSemester
    double converted_marks
    double evaluated_marks    
    
    String toString ()  {
        assessment_type    
    }
    static constraints = {
       
    }
}
