package nba_final

import grails.transaction.Transactional
import groovy.sql.Sql
import java.sql.ResultSet
//import groovy.sql.ResultSet
import nba_vit.Employee
import nba_vit.Login
import nba_vit.Role
import org.grails.datastore.mapping.core.Session
import javax.servlet.http.HttpSession
import nba_vit.Course
import org.springframework.web.servlet.tags.Param
import org.springframework.web.context.request.RequestContextHolder

@Transactional
class LoginService {
    def dataSource
    def serviceMethod() {

    }
    boolean getUser(params)
    {
        session.user = null
        session.usertype = null
        session.role = null

        String username = params.username
        String password = params.pwd
        Login login = new Login()
        String query = "select user_type from Login where username='"+username+"' and pwd='"+password+"'"
        println("query="+query)
     //  def l = Login.get(173);
     //  println("l="+l)
        def type = login.executeQuery(query)
        println("ty: "+type[0].toString())
        if(type[0].toString()!="null")
        {
            if(type[0].toString()=="Employee")
            {
                String query1 = "select role from Employee where employee_Id ='"+username+"'"
                println(query1)
                ///find all roles of a employee
                def e = Employee.findByEmployee_code(username)
                session.user = e.employee_code
                session.usertype = type[0]
                session.roleText = e.roles
                def list=[]
                for(role in e.roles)
                {
                    String str = role.toString().replaceAll("\\s","")
                    println("role="+str)
                    if(str=="HeadOfDepartment" || str=="HOD"  )
                        str = "HOD"
                    list.add(str)
                }
                session.roleLink = list
            }
            if(type[0].toString()=="Student")
            {
                session.user = username
                session.usertype = type[0]
//                println("Type->Student")
            }
            if(type[0].toString()=="Admin")
            {
                session.user = username
                session.usertype = type[0]
//                println("Type->Admin")
            }
            println("returning true")
            return true
        }
        else
        {
            println("returning false")
            return false
        }
    }
    private HttpSession getSession(){
        return RequestContextHolder.currentRequestAttributes().getSession()
    }
    
}
