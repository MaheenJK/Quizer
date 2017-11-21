/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer;

/**
 *
 * @author Maheen
 */
public class QuizController {
    private Quiz model;
    private QuizView view;
    
    public void setQuizId(int id){
        model.setId(id);
    }
    
    public int getQuizId(){
        return model.getId();
    }
        
    public void setQuizTitle(String title){
        model.setTitle(title);
    }
        
    public String getQuizTitle(){
        return model.getTitle();
    }

    public void setQuizDescription(String description){
        model.setDescription(description);
    }
        
    public String getQuizDescription(){
        return model.getDescription();
    }

    public void setQuizTotalQues(int totalQues){
        model.setTotalQues(totalQues);
    } 
    
    public int getQuizTotalQues(){
        return model.getTotalQues();
    }
    
    public void updateView(){				
      view.printQuizDetails(model.getId(), model.getTitle(), model.getDescription(), model.getTotalQues());
   }
}
