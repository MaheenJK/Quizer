/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.dao;

import com.mycompany.quizer.model.Users;
import com.mycompany.quizer.util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Maheen
 */
public class UsersDAO {
    static SessionFactory sessionFactory;
    static Session session;
    
    public UsersDAO() {
        // TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the saveEmployee method.
        //session.beginTransaction();
    }
	
    public void saveUsers(List<Users> newUsersList) {
	Transaction t=session.beginTransaction();  
        for (Users newUsersList1 : newUsersList) {
            session.persist((Users) newUsersList1);
        }
        t.commit(); 
	}

    public void printUsers() {
	List<Users> users = session.createQuery("from Users").list();
	Iterator<Users> it = users.iterator();
        Users tempUsers;
	for(;it.hasNext(); ) {
            tempUsers = it.next();
            System.out.println(tempUsers);
        }
    }
	
    public void closeSession() {
        session.close();
        sessionFactory.close();
    }    
}
