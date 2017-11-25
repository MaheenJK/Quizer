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
public class Users implements Serializable {

    @Id
    private int id;
    private String userName;
    private String password;
    private String userRole;
    private float score;
    @OneToOne(mappedBy = "myUser")
    private Quiz quiz;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
        
    public String getUserName(){
        return userName;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUserRole(){
        return userRole;
    }
    
    public void setUserRole(String userRole){
        this.userRole = userRole;
    }
    
    public float getScore(){
        return score;
    }
    
    public void setScore(float score){
        this.score = score;
    }
}
