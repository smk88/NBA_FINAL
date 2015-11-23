package nba_vit

class DeptVisionMission {
    String vision
    String mission
    Date vm_created_date    
    boolean is_current
    static belongsTo=[department:Department]
    static constraints = {
    }
}
