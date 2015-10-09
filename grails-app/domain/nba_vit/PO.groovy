package nba_vit

class PO {
    
    String po_code   
    String po_statement
    static belongsTo=[program:Program]
    String revision_year 
    boolean is_lock
    boolean is_current
  
    String toString(){
        po_statement
    }
    static constraints = {
       po_code nullable : true
    }
}
