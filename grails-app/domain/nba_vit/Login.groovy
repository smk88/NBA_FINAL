package nba_vit

class Login {

    String username
    String pwd
    UserType usertype
    
    static belongsTo=[usertype:UserType]
        
    static constraints = {
        username nullable:false
        pwd nullable:false, password:true
        
    }
}
