package nba_vit

class InstVisionMission {

    String vision
    String mission
    Date vm_created_date    
    boolean is_current
    static belongsTo=[institute:Institute]
    
    static constraints = {
    }
}
