package nba_vit

class Employee {
    String name
    String employee_code    
    String email
    String mob     
    static hasMany=[roles:Role]    
    static belongsTo=[designation:Designation, program:Program]
    
   // static hasOne=[program:Program,department:Department]
    
     String toString ()  {
        employee_code
    }
    
    static constraints = {
        employee_code unique : true, blank: false
        email email : true        
    }
}
