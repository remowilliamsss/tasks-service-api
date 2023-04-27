package ru.gym.tasksserviceapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import ru.gym.tasksserviceapi.dto.UserDto;
import ru.gym.tasksserviceapi.model.User;
import ru.gym.tasksserviceapi.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    //ObjectMapper
    //MapStruct
    private final Mapper mapper;

    //Http status
    public ResponseEntity<UserDto> find(int id) {
        User user = userService.find(id);

        UserDto userDto = mapper.toDto(user);

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
