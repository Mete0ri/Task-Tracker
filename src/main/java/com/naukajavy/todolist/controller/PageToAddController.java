package com.naukajavy.todolist.controller;

import com.naukajavy.todolist.model.Task;
import com.naukajavy.todolist.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class PageToAddController {

    private final TaskRepository taskRepository;

    public PageToAddController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @GetMapping
    private String pageToAdd(){
        return "addTask";
    }

    @PostMapping
    private String addTask(Task task){
        taskRepository.save(task);
        return "redirect:/";
    }
}
