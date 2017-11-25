/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.controller;

import com.mycompany.quizer.view.UserView;
import com.mycompany.quizer.model.Users;

/**
 *
 * @author Maheen
 */
public class UserController {
    private Users model;
    private UserView view;
    
    public UserController(Users model, UserView view){
        this.model = model;
        this.view = view;
    }
    
    public void setUsersId(int id){
        model.setId(id);
    }
    
    public int getUsersId(){
        return model.getId();
    }
    
    public void setUsersUserName(String userName){
        model.setUserName(userName);
    }

    public String getUsersUserName(){
        return model.getUserName();
    }

    public void setUsersPassword(String password){
        model.setPassword(password);
    }

    public String getUsersPassword(){
        return model.getPassword();
    }

    public void setUsersUserRole(String userRole){
        model.setUserRole(userRole);
    }

    public String getUsersUserRole(){
        return model.getUserRole();
    }

    public void setUsersScore(float score){
        model.setScore(score);
    }

    public float getUsersScore(){
        return model.getScore();
    }
    
    public void updateView(){				
      view.printUserDetails(model.getId(), model.getUserName(), model.getPassword(), model.getUserRole(), model.getScore());
   }	
}