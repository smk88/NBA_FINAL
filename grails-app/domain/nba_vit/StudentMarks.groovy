package nba_vit

class StudentMarks {
    
   // int assessment_marks
    int actual_marks
    
    static belongsTo=[student:Student,co_assessment_mapping:COAssessmentMapping]
        
    static constraints = {
    
    }
}
