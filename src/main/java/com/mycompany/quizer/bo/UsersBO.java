/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.bo;

import com.mycompany.quizer.model.Quiz;

/**
 *
 * @author Maheen
 */
public interface UsersBO {

    int addUsers(int id, String userName, String password, String userRole, float score, Quiz quiz);

    void saveUsers();    
}
