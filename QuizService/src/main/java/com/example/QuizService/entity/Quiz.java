package com.example.QuizService.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    transient List<Question> questions; // We use transient here because we don't want to save this field in the DB

}

// We will add open fiegn dependency in quiz pom.xl while getting questions of
// quizzes because the quiz microservice is targetting question microservice
// here.