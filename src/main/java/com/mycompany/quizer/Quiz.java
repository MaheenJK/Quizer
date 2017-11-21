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
public class Quiz {
    private String title;
    private String description;
    private int totalQues;
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public int getTotalQues(){
        return totalQues;
    }
    
    public void setTotalQues(int totalQues){
        this.totalQues = totalQues;
    }    
}
