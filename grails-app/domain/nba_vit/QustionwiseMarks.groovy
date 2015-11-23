package nba_vit

class QustionwiseMarks 
{
    int actual_marks    
    static belongsTo=[student:Student,question_co_mapping:QuestionCOMapping]
    static constraints = {
    }
}
