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
    public User save(User user) {
        return userRepository.save(user);
    }

    public User find(int id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    @Transactional
    public User update(User user) {
        user = find(user.getId());

        user.setName("name");

        save(user);

        return user;
    }






//    public User byEmail(String ema, int id) {
//        return userRepository.findDistinctFirstByEmailAndId(ema, id);
//    }


}
