package nba_vit

class CourseOffering {
    String acadamic_year
    String semester
    String module
    String year
    
     static belongsTo=[course:Course]
  //   static hasOne=[course:Course]
     
    static constraints = {
        
    }
}
