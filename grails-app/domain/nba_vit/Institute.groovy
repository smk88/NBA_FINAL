package nba_vit

class Institute {
    String name
    String address
    Date est_date
    String vision
    String mission
    Date vm_crtd_date
    String toString()
    {
        name
    }

    
    static constraints = {
        name nullable:false
        address nullable:false
        est_date nullable:false
        vision nullable:false
        mission nullable:false
        vm_crtd_date nullable:false
        
    }
}
