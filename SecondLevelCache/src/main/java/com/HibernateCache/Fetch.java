package com.HibernateCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Fetch {
public static void main(String[] args) {
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta =new MetadataSources(ssr).getMetadataBuilder().build();
       SessionFactory factory= meta.getSessionFactoryBuilder().build();
            Session session=factory.openSession();
           Employee em = session.get(Employee.class,2);
           System.out.println(em.getAddress());
           System.out.println(em.getName());
           Employee e = session.get(Employee.class,2);
           System.out.println(e.getAddress());
           System.out.println(e.getName());
           
            session.close();
            factory.close();
            System.out.println("fetched");
            
            
	 
}
}
