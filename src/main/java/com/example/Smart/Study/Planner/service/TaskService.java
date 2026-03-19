package com.example.Smart.Study.Planner.service;

import com.example.Smart.Study.Planner.entity.Task;
import com.example.Smart.Study.Planner.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id, Task task) {
        Task existing = taskRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(task.getTitle());
            existing.setDescription(task.getDescription());
            existing.setDeadline(task.getDeadline());
            existing.setStatus(task.getStatus());
            existing.setPriority(task.getPriority());
            return taskRepository.save(existing);
        }
        return null;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
