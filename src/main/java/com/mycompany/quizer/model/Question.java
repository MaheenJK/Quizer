/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Maheen
 */
@Entity
public class Question implements Serializable {

    @Id
    private int id;
    private String type;
    private int position;
    private String text;
    private String options;
    private int correctAnswer;
    private float maxScore;
    @ManyToOne
    private Quiz quiz;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }   
    
    public int getPosition(){
        return position;
    }
    
    public void setPosition(int position){
        this.position = position;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public String getOptions(){
        return options;
    }
    
    public void setOptions(String options){
        this.options = options;
    }

    public int getCorrectAnswer(){
        return correctAnswer;
    }
    
    public void setCorrectAnswer(int correctAnswer){
        this.correctAnswer = correctAnswer;
    }
    
    public float getMaxScore(){
        return maxScore;
    }
    
    public void setMaxScore(float maxScore){
        this.maxScore = maxScore;
    }
}