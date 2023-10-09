package com.smb18k.todolist.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;
}
