package org.com.HibernateProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Dept dept=new Dept();
        dept.setDeptno(10);
        dept.setDname("Accounting");
        dept.setLoc("Mumbai");
        System.out.println(dept);
        
        Dept dept2=new Dept();
        dept2.setDeptno(20);
        dept2.setDname("Finance");
        dept2.setLoc("Nashik");
        System.out.println(dept2);
        
        Dept dept3=new Dept();
        dept3.setDeptno(30);
        dept3.setDname("Research");
        dept3.setLoc("Pune");
        System.out.println(dept3);
        
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(dept);
        session.save(dept2);
        session.save(dept3);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
