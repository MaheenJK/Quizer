/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizer.bo;

import com.mycompany.quizer.model.Question;
import com.mycompany.quizer.model.Quiz;
import com.mycompany.quizer.model.Users;
import java.util.List;
import javax.persistence.OneToOne;

/**
 *
 * @author Maheen
 */
public interface QuizBO {

    int addQuiz(int id, String title, String description, int totalQues, List<Question> Ques, Users myUser);

    void saveQuiz();    
}
