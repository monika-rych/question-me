package com.team2.questionme.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn
    private User user;

    private String contents;
    private LocalDate localDate;
    private String category;
    @OneToMany(cascade = CascadeType.ALL)
    @OrderBy("rating DESC")
    private List<Answer> answers;

    @Autowired
    public Question(User user, String text, String category) {
        this.user = user;
        this.contents = text;
        this.localDate = LocalDate.now();
        this.category = category.trim().toLowerCase();
        this.answers = new ArrayList<>();
    }

    protected Question() {
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }
}
