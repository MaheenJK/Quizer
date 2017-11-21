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
public class UserView {
    public void printUserDetails(int id, String userName, String password, String role, float score){
        System.out.println("User: ");
        System.out.println("Id: " + id);
        System.out.println("User name: " + userName);
        System.out.println("Password: " + password);
        System.out.println("User role: " + role);
        System.out.println("Score: " + score);
    }
}
