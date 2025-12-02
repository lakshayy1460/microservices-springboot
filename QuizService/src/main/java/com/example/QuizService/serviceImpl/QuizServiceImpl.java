package com.example.QuizService.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.QuizService.repository.QuizRepository;
import com.example.QuizService.service.QuestionClient;
import com.example.QuizService.service.QuizService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.QuizService.entity.Quiz;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    private final QuestionClient questionClient;

    @Override
    public List<Quiz> getAllQuizzes() {
        List<Quiz> quizzes = quizRepository.findAll();

        List<Quiz> quizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return quizList;
    }

    @Override
    public Quiz getQuizById(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found."));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

}
