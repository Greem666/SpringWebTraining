package com.springtraining.restwebapp.tasks.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TASKS")
public class Task {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    public Task(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
