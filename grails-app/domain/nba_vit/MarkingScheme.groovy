package nba_vit

class MarkingScheme {
    int homework_assignment
    int tutorial
    int laboratry
    int test1
    int test2
    int end_semester_exam
    int review_one
    int review_two
    int review_three
    int review_four
    int review_five  
    
    static belongsTo=[course_type:CourseType]
   
    static constraints = {
    }
}
