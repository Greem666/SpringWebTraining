package com.springtraining.restwebapp.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TaskDto {
    private int id;
    private String title;
    private String content;
}
