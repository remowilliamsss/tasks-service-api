package ru.gym.tasksserviceapi.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gym.tasksserviceapi.model.Task;
import ru.gym.tasksserviceapi.service.TaskService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
@Tag(name = "задачи", description = "CRUD для работы с задачами пользователями")
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/{id}")
    public ResponseEntity<Task> find(int id) {
        taskService.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Task> findAll() {
        taskService.findAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Task> create(@RequestBody Task task) {
        task = taskService.save(task);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }
}
