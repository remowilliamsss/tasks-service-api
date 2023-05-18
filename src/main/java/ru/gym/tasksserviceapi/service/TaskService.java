package ru.gym.tasksserviceapi.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gym.tasksserviceapi.model.Task;
import ru.gym.tasksserviceapi.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task findById(int id) {
        return taskRepository.findById(id)
                .orElseThrow();
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task save(Task task) {
        return taskRepository.save(task);
    }

//    @Transactional
//    public Tasks update(Tasks task) {
//        Tasks tasks = repository.findItemByExternalId(task.getExternalId())
//                .map(existed -> updateEntity(existed, task));
//        return repository.save(task);
//    }

    @Transactional
    public void delete(int id) {
        taskRepository.deleteById(id);
    }
}
