package nba_vit

class Role {
    String role
    
    String toString(){
        role
    }
    static constraints = {
        role nullable:false
    }
    static mapping={
        sort role:"asc"
    }
}
