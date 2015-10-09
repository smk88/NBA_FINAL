package nba_vit

class Department {
    String name       
    static belongsTo=[institute:Institute]
    
    String toString()
    {
        name
    }
    static constraints = {
       
        // institute nullable:false
    }
}
