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
public interface QuestionBO {
    
    int addQuestion(int id, String type, int position, String text, String options, int correctAnswer, float maxScore, Quiz quiz);

    void saveQuestion();    
}
