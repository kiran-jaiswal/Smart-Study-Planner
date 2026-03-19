package com.example.Smart.Study.Planner.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private LocalDate deadline;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String priority;

    public enum Status {
        PENDING,
        COMPLETED
    }
}
