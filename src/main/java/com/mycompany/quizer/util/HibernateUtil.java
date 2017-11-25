/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mycompany.quizer.model.*;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Maheen
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml)
            // config file.
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Users.class);
            cfg.addAnnotatedClass(Quiz.class);
            cfg.addAnnotatedClass(Question.class);
            cfg.configure();
            sessionFactory = cfg.buildSessionFactory();
            return sessionFactory;
        }
        catch (Exception e) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory() {
    if(sessionFactory==null){
        buildSessionFactory();
    }
    return sessionFactory;
    }
}
