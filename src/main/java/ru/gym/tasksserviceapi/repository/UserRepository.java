package ru.gym.tasksserviceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gym.tasksserviceapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findDistinctFirstByEmailAndId(String email, int id);
}
