/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.bo.impl;

import com.mycompany.quizer.bo.QuizBO;
import com.mycompany.quizer.dao.QuizDAO;
import com.mycompany.quizer.dao.UsersDAO;
import com.mycompany.quizer.model.Question;
import com.mycompany.quizer.model.Quiz;
import com.mycompany.quizer.model.Users;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maheen
 */
public class QuizBOimpl implements QuizBO{

    public List<Quiz> quizRoster;

    public QuizBOimpl() {
        quizRoster = new ArrayList<>();
    }

    @Override
    public int addQuiz(int id, String title, String description, int totalQues, List<Question> Ques, Users myUser) {
        Quiz tempQuiz = new Quiz();
        tempQuiz.setId(id);
        tempQuiz.setTitle(title);
        tempQuiz.setTotalQues(totalQues);

        quizRoster.add(tempQuiz);
        return quizRoster.indexOf(tempQuiz);
    }

    @Override
    public void saveQuiz() {
        QuizDAO quizD = new QuizDAO();
        quizD.saveQuiz(quizRoster);
    }    
}
