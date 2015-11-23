package nba_vit

class QuestionCOMapping 
{
    String academic_year
    String qno
    String opno
    int maxmarks
    static belongsTo=[course:Course,co:CO,assessment_type:AssessmentType]    
    static constraints = {
    }
}
