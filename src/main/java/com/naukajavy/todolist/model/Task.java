package com.naukajavy.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Task {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String category;
    private LocalDate date;

    public Task(String name, String category, LocalDate date) {
        this.name = name;
        this.category = category;
        this.date = date;
    }
}
