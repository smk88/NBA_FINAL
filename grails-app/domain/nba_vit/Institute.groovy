package nba_vit

class Institute {
    String name
    String address
    Date establishmentDate
    String vision
    String mission
    Date vmCreatedDate
    
    
    
    String toString()
    {
        name
    }

    
    static constraints = {
        name nullable:false
        address nullable:false
        establishmentDate nullable:false
        vision nullable:false
        mission nullable:false
        vmCreatedDate nullable:false
        
    }
}
