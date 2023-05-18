package ru.gym.tasksserviceapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gym.tasksserviceapi.dto.UserDto;
import ru.gym.tasksserviceapi.model.User;
import ru.gym.tasksserviceapi.service.UserService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<User> create(@RequestBody User user) {
        user = userService.save(user);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
