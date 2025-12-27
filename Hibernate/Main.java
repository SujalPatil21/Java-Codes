package com.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


            Alien a1 = new Alien();

            a1.setAid(101);
            a1.setAname("Sujal");
            a1.setTech("JAVA");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.Hiber.Alien.class);
        config.configure();

        SessionFactory factory = config.buildSessionFactory();


        Session session = factory.openSession(); //hey factory open a new session for me
        Transaction transaction = session.beginTransaction();

        session.persist(a1); //hey session save this object

        transaction.commit();
    }
}