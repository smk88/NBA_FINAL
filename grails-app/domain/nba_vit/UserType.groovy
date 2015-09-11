package nba_vit

class UserType {
    String usertype
   
    String toString ()  {
        usertype    
    }
    static constraints = {
        usertype nullable: false
    }
}
