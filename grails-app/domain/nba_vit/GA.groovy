package nba_vit

class GA {  
  String ga_code  
  String ga_statement
  static belongsTo=[program_type:ProgramType]  
  String revision_year 
  boolean is_lock
  boolean is_current
  
    String toString(){
        ga_code
    }
    static constraints = {
       ga_code nullable : true 
    }
}
