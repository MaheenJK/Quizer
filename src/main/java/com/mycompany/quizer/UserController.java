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
public class UserController {
    private User model;
    private UserView view;
    
    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }
    
    public void setUserUserName(String userName){
        model.setUserName(userName);
    }

    public String getUserUserName(){
        return model.getUserName();
    }

    public void setUserPassword(String password){
        model.setPassword(password);
    }

    public String getUserPassword(){
        return model.getPassword();
    }

    public void setUserRole(String role){
        model.setRole(role);
    }

    public String getUserRole(){
        return model.getRole();
    }

    public void setUserScore(float score){
        model.setScore(score);
    }

    public float getUserScore(){
        return model.getScore();
    }
    
    public void updateView(){				
      view.printUserDetails(model.getUserName(), model.getPassword(), model.getRole(), model.getScore());
   }	
}
