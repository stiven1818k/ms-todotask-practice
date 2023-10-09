package com.smb18k.todolist.service;

import com.smb18k.todolist.model.Task;
import com.smb18k.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    public List<Task> getAllTask();
    public  Task createTask(Task task);

    public Task getTaskById(Long id);

    public Task updateTask(Long id, Task task);

    public void deleteTask(Long id);
}
