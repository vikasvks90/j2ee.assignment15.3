package assignment15.session3.util;

import java.util.Date;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

import assignment15.session3.bean.Student;  
  
public class StudentClient {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();
    Student s1=new Student(); 
    Date date = new Date(9999999);
    s1.setStud_name("Abhay");  
    s1.setStud_marks(89);  
    s1.setStud_join_date(date);
      
    session.saveOrUpdate(s1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
    System.out.println("Student successfully saved");  
      
}  
}