package nba_vit

class Employee {
    String name
    String eid
    Role role
    String email
    String mob
    Department department
    Program program    
    static belongsTo=[department:Department,program:Program,role:Role]
    static hasMany=[role:Role]
    
    static constraints = {
        name nullable:false
        eid nullable:false
        email email : true
        
    }
}
