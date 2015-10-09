package nba_vit

class Program {
    String name     
    static belongsTo=[programType:ProgramType ,department:Department]
    
    String toString()
    {
        name
    }
    static constraints = {
        
        // institute nullable:false
    }
}
