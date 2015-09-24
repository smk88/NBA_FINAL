package nba_final

import grails.transaction.Transactional
import groovy.sql.Sql
import java.sql.ResultSet
import nba_vit.Login
import org.grails.datastore.mapping.core.Session
import javax.servlet.http.HttpSession
import nba_vit.Course
import org.springframework.web.servlet.tags.Param
import org.springframework.web.context.request.RequestContextHolder
@Transactional
class ResetPasswordService {

    def serviceMethod() {

    }
    boolean setPassword(params,user)
    {
        //String user=user
        println("User = "+user)
        String newpwd = params.newpwd
        String confpwd = params.confpwd
        if(newpwd==confpwd)
        {
            println("New Password:"+newpwd+" Confirm Password:"+confpwd)
            Login login = new Login()
            String query = "update Login set pwd='"+newpwd+"' where username='"+user+"' "
            login.executeUpdate(query);
            println("password changed successfully...")
            
            return true
        }
        else
        {
            println("new password and confirm password doesn't match...")
            return false
        }
    }    
}
