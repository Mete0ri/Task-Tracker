package com.naukajavy.todolist;

import com.naukajavy.todolist.model.Task;
import com.naukajavy.todolist.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {
    private final TaskRepository taskRepository;

    public DbInit(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        taskRepository.saveAll(List.of(
            new Task("Zadanie 1", "Praca", LocalDate.of(2024, 2, 14)),
            new Task("Zadanie 2", "Dom", LocalDate.of(2025, 6, 21)),
            new Task("Zadanie 3", "Inne", LocalDate.of(2024, 2, 3))
        ));
    }
}
