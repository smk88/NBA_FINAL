package nba_vit

class Student {
String name
String grno
String curr_yr
String academic_yr
int fy_rn
int sy_rn
int ty_rn
int btech_rn
String fy_div
String sy_div
String ty_div
String btech_div
boolean grad_status
    String email
    String mob
    Department department
    Program program
    static belongsTo=[department:Department,program:Program]
  
    static constraints = {
         grno nullable:false
         name nullable:false
         email email : true
         mob nullable: true
         curr_yr nullable:false
         academic_yr nullable:false
         fy_rn nullable: true
         sy_rn nullable: true
         ty_rn nullable: true
         btech_rn nullable: true
         fy_div nullable: true
         sy_div nullable: true
         ty_div nullable: true
         btech_div nullable: true
        grad_status nullable:false
        
    }
    static mapping = {
       grad_status defaultValue: false
       //This will reflect in db instead of fy_rn it will be FY_RN 
     /*  table 'student'
       fy_rn column: 'FY_RN'*/
       
    }
}
