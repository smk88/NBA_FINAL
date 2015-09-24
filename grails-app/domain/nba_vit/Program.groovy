package nba_vit

class Program {
    String name     
    static belongsTo=[department:Department]
    
    String toString()
    {
        name
    }
    static constraints = {
        
        // institute nullable:false
    }
}
