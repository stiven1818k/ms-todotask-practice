package com.smb18k.todolist.controllers;


import com.smb18k.todolist.dto.ResponseDto;
import com.smb18k.todolist.model.Task;
import com.smb18k.todolist.service.ITaskService;
import com.smb18k.todolist.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

        @Autowired
        ITaskService  iTaskService;

       @GetMapping("/")
        public ResponseDto getAllTask(){
            return Response.success(iTaskService.getAllTask());
        }

        @PostMapping("/")
        public ResponseDto createTask(@RequestBody Task task){
            return Response.success(iTaskService.createTask(task));
        }
        @PutMapping("/{id}")
        public ResponseDto createTask(@PathVariable Long id,@RequestBody Task task){
            return Response.success(iTaskService.updateTask(id,task));
        }




}
