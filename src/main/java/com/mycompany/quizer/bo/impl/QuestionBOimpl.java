/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.bo.impl;

import com.mycompany.quizer.bo.QuestionBO;
import com.mycompany.quizer.dao.QuestionDAO;
import com.mycompany.quizer.dao.QuizDAO;
import com.mycompany.quizer.model.Question;
import com.mycompany.quizer.model.Quiz;
import com.mycompany.quizer.model.Users;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maheen
 */
public class QuestionBOimpl implements QuestionBO{

    public List<Question> questionRoster;

    public QuestionBOimpl() {
        questionRoster = new ArrayList<>();
    }

    @Override
    public int addQuestion(int id, String type, int position, String text, String options, int correctAnswer, float maxScore, Quiz quiz) {
        Question tempQuestion = new Question();
        tempQuestion.setId(id);
        tempQuestion.setType(type);
        tempQuestion.setPosition(position);
        tempQuestion.setText(text);
        tempQuestion.setOptions(options);
        tempQuestion.setCorrectAnswer(correctAnswer);
        tempQuestion.setMaxScore(maxScore);
        
        questionRoster.add(tempQuestion);
        return questionRoster.indexOf(tempQuestion);
    }

    @Override
    public void saveQuestion() {
        QuestionDAO questionD = new QuestionDAO();
        questionD.saveQuestion(questionRoster);
    }        
}
