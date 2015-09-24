package nba_vit

class CoMarksMapping {   
    int percentage
    int actual_marks
    int assessment_marks    
    
    static belongsTo=[course:Course,employee:Employee,assessment_type:AssessmentType,course_offering:CourseOffering]
   // static hasOne=[course:Course,employee:Employee,assessmentType:AssessmentType,courseOffering:CourseOffering]
  
    static constraints = {  
    }
}

