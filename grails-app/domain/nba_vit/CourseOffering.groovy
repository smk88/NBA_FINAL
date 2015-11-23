package nba_vit

class CourseOffering {
    static belongsTo=[course:Course]
    String acadamic_year
    String semester
    String module   
    static constraints = {
        
    }
}
