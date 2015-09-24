package nba_vit

class Login {

    String username
    String pwd
    
    static belongsTo=[user_type:UserType]
        
    static constraints = {
      username unique : true, blank: false
    }
}
