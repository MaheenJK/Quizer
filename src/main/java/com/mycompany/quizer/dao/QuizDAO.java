/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.dao;

import com.mycompany.quizer.model.Quiz;
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
public class QuizDAO {
    static SessionFactory sessionFactory;
    static Session session;
    
    public QuizDAO() {
        // TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the saveEmployee method.
        //session.beginTransaction();
    }
	
    public void saveQuiz(List<Quiz> newQuizList) {
	Transaction t=session.beginTransaction();  
        for (Quiz newQuizList1 : newQuizList) {
            session.persist((Quiz) newQuizList1);
        }
        t.commit(); 
	}

    public void printQuiz() {
	List<Quiz> quiz = session.createQuery("from Quiz").list();
	Iterator<Quiz> it = quiz.iterator();
        Quiz tempQuiz;
	for(;it.hasNext(); ) {
            tempQuiz = it.next();
            System.out.println(tempQuiz);
        }
    }
	
    public void closeSession() {
        session.close();
        sessionFactory.close();
    }        
}
