package nba_vit

class COAssessmentMapping {
    String academic_year
    double weightage
    static belongsTo=[course:Course,co:CO,assessment_type:AssessmentType]
    String toString()
    {
        // "course : "+course+" assessment_type: "+assessment_type+" weightage : "+weightage  
       "course : "+course+" CO : "+co+" assessment_type: "+assessment_type+" weightage : "+weightage
    }
    static constraints = 
    {
    }
}
