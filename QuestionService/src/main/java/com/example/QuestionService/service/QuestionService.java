package com.example.QuestionService.service;

import java.util.List;

import com.example.QuestionService.entity.Question;

public interface QuestionService {

    public List<Question> getAllQuestions();

    public Question getQuestionById(Long questionId);

    public Question createQuestion(Question question);

    public List<Question> getQuestionOfQuiz(Long quizId);

}
