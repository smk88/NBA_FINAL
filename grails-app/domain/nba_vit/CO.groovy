package nba_vit

class CO {
    String co_code
    String co_statement
    static belongsTo=[course:Course]  
    String revision_year 
    boolean is_lock
    boolean is_current
          
    
    String toString(){
        co_statement
    }
    
    static constraints = {
    }
}
