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
public class QuestionView {
    public void printQuestionDetails(int id, String type, int position, String text, String options, int correctAnswer, float maxScore){
        System.out.println("Question: ");
        System.out.println("Id: " + id);
        System.out.println("Question type: " + type);
        System.out.println("Position: " + position);
        System.out.println("Question text: " + text);
        System.out.println("Options: " + options);
        System.out.println("Correct Answer: " + correctAnswer);
        System.out.println("Maximum score: " + maxScore);
    }
}
