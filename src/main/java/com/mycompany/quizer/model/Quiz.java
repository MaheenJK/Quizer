/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Maheen
 */
@Entity
public class Quiz implements Serializable {
    @Id
    private int id;
    private String title;
    private String description;
    private int totalQues;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quiz")
    List<Question> Ques;
    @OneToOne
    Users myUser;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
        
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
