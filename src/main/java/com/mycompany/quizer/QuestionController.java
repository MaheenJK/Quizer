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
public class QuestionController {
    private Question model;
    private QuestionView view;
    
    public void setQuestionId(int id){
        model.setId(id);
    }
    
    public int getQuestionId(){
        return model.getId();
    }
        
    public QuestionController(Question model, QuestionView view){
        this.model = model;
        this.view = view;
    }

    public void setQuestionType(String type){
        model.setType(type);
    }
    
    public String getQuestionType(){
        return model.getType();
    }
    
    public void setQuestionPosition(int position){
        model.setPosition(position);
    }
    
    public int getQuestionPosition(){
        return model.getPosition();
    }

    public void setQuestionText(String text){
        model.setText(text);
    }
    
    public String getQuestionText(){
        return model.getText();
    }
    
    public void setQuestionOptions(String options){
        model.setOptions(options);
    }
    
    public String getQuestionOptions(){
        return model.getOptions();
    }
    
    public void setQuestionCorrectAnswer(int correctAnswer){
        model.setCorrectAnswer(correctAnswer);
    }
    
    public int getQuestionCorrectAnswer(){
        return model.getCorrectAnswer();
    }
    
    public void setQuestionMaxScore(float maxScore){
        model.setMaxScore(maxScore);
    }    

    public float getQuestionMaxScore(){
        return model.getMaxScore();
    }

    public void updateView(){				
      view.printQuestionDetails(model. getId(), model.getType(), model.getPosition(), model.getText(), model.getOptions(), model.getCorrectAnswer(), model.getMaxScore());
   }	    
}
