package com.example.QuizService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Question {

    private Long questionId;

    private String question;

    private Long quizId;

}
