package com.smb18k.todolist.service;

import com.smb18k.todolist.model.Task;
import com.smb18k.todolist.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ITaskService implements  TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Tarea no encontrada"));
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task aux = taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Tarea no encontrada"));
        aux.setTitle(task.getTitle());
        aux.setCompleted(task.isCompleted());
        return  taskRepository.save(aux);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
