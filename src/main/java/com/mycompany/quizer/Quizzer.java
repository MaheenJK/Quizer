/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer;

import com.mycompany.quizer.bo.QuestionBO;
import com.mycompany.quizer.bo.QuizBO;
import com.mycompany.quizer.bo.UsersBO;
import com.mycompany.quizer.bo.impl.QuestionBOimpl;
import com.mycompany.quizer.bo.impl.QuizBOimpl;
import com.mycompany.quizer.bo.impl.UsersBOimpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Maheen
 */
public class Quizzer {
    private UsersBO usersHandler = new UsersBOimpl();
    private QuizBO quizHandler = new QuizBOimpl();
    private QuestionBO questionHandler = new QuestionBOimpl();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quizzer quizz = new Quizzer();
        quizz.doAll();
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*Lion lion_jack = (Lion) context.getBean("lion_jack");
	System.out.println(lion_jack.toString());
        Lion lion_cecile = (Lion) context.getBean("lion_cecile");
	System.out.println(lion_cecile.toString());
        Lion lion_babarsher = (Lion) context.getBean("lion_babarsher");
	System.out.println(lion_babarsher.toString());
		
        Elephant elephant = (Elephant) context.getBean("elephant_saheli");			
        System.out.println(elephant.toString());	
	Tiger tiger = (Tiger) context.getBean("tiger");
	System.out.println(tiger.toString());*/
	context.close();
    }
    
    /**
     * Perform all action here
     */
    public void doAll(){
       /* int emp1Id = employeeHandler.addEmployee("fahad");
        int emp2Id = employeeHandler.addEmployee("Obaid");
        int emp3Id = employeeHandler.addEmployee("Zohaib");
        int emp4Id = employeeHandler.addEmployee("Sadaf");
        
        employeeHandler.addRegularEmployee(emp1Id, 1.0f , 0);
        employeeHandler.addContractEmployee(emp2Id, 0.3f , "1 year");
        employeeHandler.addContractEmployee(emp3Id, 0.2f , "1 year");
        employeeHandler.addContractEmployee(emp4Id, 0.6f , "2 years");*/
        
        
        usersHandler.saveUsers();
        quizHandler.saveQuiz();
        questionHandler.saveQuestion();
    }    
}
