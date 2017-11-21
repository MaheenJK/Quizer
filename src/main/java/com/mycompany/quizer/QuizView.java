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
public class QuizView {
    public void printQuizDetails(String title, String description, int totalQues){
        System.out.println("Quiz ");
        System.out.println("Quiz title: " + title);
        System.out.println("Quiz description: " + description);
        System.out.println("Total Questions: " + totalQues);
    }
}
