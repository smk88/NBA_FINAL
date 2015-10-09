package nba_vit

class PEO {

    String peo_code
    String peo_statement
    static belongsTo=[program:Program]    
    String revision_year 
    boolean is_lock
    boolean is_current
  
    String toString(){
        peo_code
    }
    static constraints = {
       peo_code nullable : true
    }
}
