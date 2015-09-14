package nba_vit

class CourseOffering {
    Course course
    String acadamic_year
    String semester
    String module
    String year
    
     static belongsTo=[course:Course]
     
    static constraints = {
        
    }
}
