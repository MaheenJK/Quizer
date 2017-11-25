/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.bo.impl;

import com.mycompany.quizer.bo.UsersBO;
import com.mycompany.quizer.dao.UsersDAO;
import com.mycompany.quizer.model.Quiz;
import com.mycompany.quizer.model.Users;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maheen
 */
public class UsersBOimpl implements UsersBO{
    
    public List<Users> usersRoster;

    public UsersBOimpl() {
        usersRoster = new ArrayList<>();
    }

    @Override
    public int addUsers(int id, String userName, String password, String userRole, float score, Quiz quiz) {
        Users tempUser = new Users();
        tempUser.setId(id);
        tempUser.setUserName(userName);
        tempUser.setPassword(password);
        tempUser.setUserRole(userRole);
        tempUser.setScore(score);

        usersRoster.add(tempUser);
        return usersRoster.indexOf(tempUser);
    }

    @Override
    public void saveUsers() {
        UsersDAO userD = new UsersDAO();
        userD.saveUsers(usersRoster);
    }    
}
