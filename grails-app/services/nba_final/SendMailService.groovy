package nba_final

import grails.transaction.Transactional
import groovy.sql.Sql
import java.sql.ResultSet
//import groovy.sql.ResultSet
import nba_vit.Employee
import nba_vit.Student
import nba_vit.Login
import nba_vit.OTP
import nba_vit.Role
import org.grails.datastore.mapping.core.Session
import javax.servlet.http.HttpSession
import nba_vit.Course
import java.util.Properties
import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.PasswordAuthentication
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

import org.springframework.web.servlet.tags.Param
import org.springframework.web.context.request.RequestContextHolder
@Transactional

class SendMailService 
{
    def serviceMethod() 
    {
    }
    boolean compareOTP(params,user)
    {
        println("in compare OTP.."+user);
        String username=user
        String otpval=params.otp
        String timeval
        println("Username:"+username+" "+"Value:"+otpval)
        OTP otp=new OTP();
        String query = "select otpval,time from OTP where username='"+username+"' "    
        def otpdata=otp.executeQuery(query)
        println("Database values::"+otpdata[0][0]+" "+otpdata[0][1])
        String dbtime=otpdata[0][1]
        //match stored OTP with entered OTP
        if(otpdata[0][0]==otpval)
        {
            println("OTP match");          
            //find out difference in terms of number of hours
            long old1=Long.parseLong(dbtime)
            long new1=new java.util.Date().getTime();
            long diff=new1-old1       
            long diffHours = diff / (60 * 60 * 1000)
            long seconds=diff/1000
            long minutes=diff / (1000*60) 
            println("Old Time:"+old1+" New Time:"+new1+" Difference in seconds:"+seconds+" Difference in minutes:"+minutes)
            println("Difference in Hours::"+diffHours)
            if(diffHours>24)
            {                
                println("You cannot enter OTP after 1 day")
                return false
            }
            else            
                return true;
        }
        else
        {
            println("OTP mismatch")
            return false
        }
    }
    boolean sendMail(params)
    {        
        String email
        String username = params.userid
        println("userid::"+username);
        session.user=username
        Login login = new Login()
        String query = "select user_type from Login where username='"+username+"' "      
        def type = login.executeQuery(query)
        println("ty: "+type[0].toString())
        if(type[0].toString()!="null")
        {
            if(type[0].toString()=="Employee" || type[0].toString()=="Admin")
            {                    
                def e = Employee.findByEmployee_code(username)
                email=e.email
                println("Email:"+email)
            }
            if(type[0].toString()=="Student")
            {
                def s = Student.findByGrNumber(username)
                email=s.email
                println("Email:"+email)
            }
            if(type[0].toString()=="Admin")
            {
                def a = Employee.findByEmployeeId(username)
                email=a.email
                println("Email:"+email)
            }    
        int n = (Math.random() * 90000000)%99999999;
        String otpval=""+n;
        println("OTP::"+n);
         java.util.Date date=new java.util.Date();  
         String time=date.getTime();
         println("Current Time:"+time);  
         //insert tnto OTP domain
        OTP otp = new OTP()
        query = "select username from OTP where username='"+username+"' "      
        def ans = otp.executeQuery(query)
        println("return from otp::"+ans[0])
        if(ans[0]!=null)
        {
            //OTP exists, Now update it
            query="update OTP set otpval='"+otpval+"' ,time='"+time+"' where username='"+username+"' "
            println(query)
            int test=otp.executeUpdate(query)
           // int test=otp.executeUpdate(query)
            println("record updated scuccessfully..."+test)
        }
        if(ans[0]==null)
        {
            //OTP not present, insert it
            //query="insert into OTP (otpval,time,username )values ('"+otpval+"','"+time+"','"+username+"')"
            //println(query)
            OTP opt = new OTP()
            opt.setOtpval(otpval)
            opt.setTime(time)
            opt.setUsername(username)
            opt.save()
            //int test=otp.executeUpdate(query)           
           
            println("record inserted scuccessfully...")            
        }
        //mail sending code
        String sendmail = "nbaadmin@vit.com";                
        final String sendpassword = "vit#82#edu";
 
                Properties props = new Properties();
                    props.put("mail.smtp.host", "smtp.gmail.com");
                   // props.put("mail.smtp.socketFactory.port", "465");
                   // props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.port", "465");
                    props.put("mail.smtp.socketFactory.port", "587");
                    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");


 
		Session session1 = Session.getInstance(props,
		  new javax.mail.Authenticator() 
                  {
			protected PasswordAuthentication getPasswordAuthentication() 
                        {
				return new PasswordAuthentication(sendmail, sendpassword);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session1);
			message.setFrom(new InternetAddress(sendmail));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("OTP to reset password for VIT NBA Software");
			message.setText("Dear Sir/Madam,\n OTP to reset password for VIT NBA SOftware is "+otpval+" \nRegards,\n VIT NBA SOftware Team");
 
			Transport.send(message);
                           return true;
                        } 
                catch (MessagingException e) 
                {
			System.out.println("from messaging Please check internet connection....."+e);
                       // return false
                       return true
		}
                catch( Exception e)
                {
                    System.out.println("from exception Please check network connection..."+e);
                    //return false
                    return true
                }
        }    
    }    
     private HttpSession getSession(){
        return RequestContextHolder.currentRequestAttributes().getSession()
    }
}
