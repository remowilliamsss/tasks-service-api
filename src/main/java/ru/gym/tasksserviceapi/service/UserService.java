package ru.gym.tasksserviceapi.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gym.tasksserviceapi.model.User;
import ru.gym.tasksserviceapi.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }


    public User find(int id) {
        return userRepository.findById(id)
                .orElseThrow();
    }
}
