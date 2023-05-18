package ru.gym.tasksserviceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gym.tasksserviceapi.model.Task;
import ru.gym.tasksserviceapi.model.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
