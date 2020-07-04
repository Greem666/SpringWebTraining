package com.springtraining.restwebapp.tasks.controller;

import com.springtraining.restwebapp.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/task")
public class TaskController {
//    private TaskMapper taskMapper;
//    private DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(long taskId) {
        return new TaskDto(0, "PH", "PH");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask() {
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public void updateTask() {
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask")
    public void createTask() {
    }
}
