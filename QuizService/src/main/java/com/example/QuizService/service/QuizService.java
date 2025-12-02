package com.example.QuizService.service;

import java.util.List;

import com.example.QuizService.entity.Quiz;

public interface QuizService {

    public List<Quiz> getAllQuizzes();

    public Quiz getQuizById(Long id);

    public Quiz addQuiz(Quiz quiz);

}
