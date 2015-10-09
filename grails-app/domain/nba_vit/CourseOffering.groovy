package nba_vit

class CourseOffering {
    String acadamic_year
    String semester
    static belongsTo=[course:Course]
     
    String toString()
    {
        "course : "+course+"  sem : "+sem+" AY : "+academic_year
    }
    static constraints = {
        
    }
}
