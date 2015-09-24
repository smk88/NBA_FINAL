package nba_vit

    class Student {
    String first_name
    String middle_name
    String surname
    String gr_number
    String current_year
    String current_module
    String academic_year
    String fy_rollno
    String sy_rollno
    String ty_rollno
    String btech_rollno
    String fy_division
    String sy_division
    String ty_division
    String btech_division
    boolean graduation_status
    String email
    String mobile_number
    String current_address
    String permanent_address
    
    static belongsTo=[program:Program]
    String toString(){
        gr_number
    }
    static constraints = {     
         gr_number unique : true, blank: false 
         email email : true, nullable: true     
         mobile_number nullable: true       
         fy_rollno nullable: true
         sy_rollno nullable: true
         ty_rollno nullable: true
         btech_rollno nullable: true
         fy_division nullable: true
         sy_division nullable: true
         ty_division nullable: true
         btech_division nullable: true   
         middle_name nullable: true 
         first_name nullable: true 
         current_address nullable: true 
         permanent_address nullable: true  
    }
    static mapping = {
       graduation_status defaultValue: false
       //This will reflect in db instead of fy_rn it will be FY_RN 
     /*  table 'student'
       fy_rn column: 'FY_RN'*/
       
    }
}
