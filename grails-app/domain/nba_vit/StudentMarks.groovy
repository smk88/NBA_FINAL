package nba_vit

class StudentMarks {
    
    int assessment_marks
    int actual_marks
    
    static belongsTo=[student:Student,course_offering:CourseOffering,assessment_type:AssessmentType]
        
    static constraints = {
    }
}
