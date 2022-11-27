package com.HibernateCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String[] args) {
               StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
                 Metadata meta =new MetadataSources(ssr).getMetadataBuilder().build();
                    SessionFactory factory= meta.getSessionFactoryBuilder().build();
                         Session session=factory.openSession();
                         Transaction tr=session.beginTransaction();
                         Employee em = new Employee();
                         em.setName("Dev");
                         em.setAddress("wagholi");
                         
                         Employee e = new Employee();
                         e.setName("Rehansh");
                         e.setAddress("pune");
                         session.save(e);
                         session.save(em);
                 
                         tr.commit();
                         session.close();
                         factory.close();
                         System.out.println("Successfully Saved");
	}
}
