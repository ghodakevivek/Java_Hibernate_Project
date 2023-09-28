
//create a hibernate project showing one to one relation ship between product and customer(uni-directional)


package com.hibernate.lab28sept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        // Creating the session factory 
        SessionFactory factory=cfg.buildSessionFactory();
       
        // Creating the object of Customer entity
        Customer c1=new Customer();
        c1.setCid(101);  // Setting the values
        c1.setCname("Prakash");
        c1.setCmob(12345678);
        
        // Creating the object of Product entity 
        Product p1=new Product();
        p1.setPid(201); // Setting the values
        p1.setPname("Toothbrush");
        p1.setPcolor("Blue");
        
        c1.setProd(p1);
        
        //Opening the session
        Session session=factory.openSession(); 
        
        // Starting the transaction
        Transaction tx=session.beginTransaction();
        session.save(c1);
        session.save(p1);
        tx.commit();
        
        // Closing the session and sessionfactory
        session.close();
        factory.close();
        
    }
}
