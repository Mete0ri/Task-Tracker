package com.naukajavy.todolist.controller;

import com.naukajavy.todolist.model.Task;
import com.naukajavy.todolist.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    private final TaskRepository taskRepository;

    public HomeController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tasks",taskRepository.findAll());
        return "homePanel";
    }
    @PostMapping("/delete/{id}")
    private String deleteTask(@PathVariable Long id){
        taskRepository.deleteById(id);
        return "redirect:/";
    }
}
