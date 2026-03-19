package com.example.Smart.Study.Planner.repository;

import com.example.Smart.Study.Planner.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
