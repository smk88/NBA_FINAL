package nba_vit

class CourseOutcome {    
    String co_code
    String co_statement
    String acadamic_year   
    Course course   
    
    static belongsTo=[course:Course]    
    
    String toString(){
        co_code
    }
    
    static constraints = {
    }
}
