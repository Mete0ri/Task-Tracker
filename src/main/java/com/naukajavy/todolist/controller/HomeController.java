package com.naukajavy.todolist.controller;

import com.naukajavy.todolist.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {

    private List<Task> tasks = List.of(
            new Task("Zadanie 1", "Praca", LocalDate.of(2024,2,14)),
            new Task("Zadanie 2", "Dom", LocalDate.of(2025,5,24)),
            new Task("Zadanie 3", "Zakupy", LocalDate.of(2024,9,6))
    );

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tasks",tasks);
        return "homePanel";
    }
}
