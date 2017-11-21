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
public class User {
    private int id;
    private String userName;
    private String password;
    private String role;
    private float score;
    
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
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public float getScore(){
        return score;
    }
    
    public void setScore(float score){
        this.score = score;
    }
}
