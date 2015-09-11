package nba_vit

class Program {
    String name
    Department department
    
    static belongsTo=[department:Department]
    String toString()
    {
        name
    }
    static constraints = {
         name nullable:false
        // institute nullable:false
    }
}
