package ru.gym.tasksserviceapi.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    @NotNull
    @Column(unique = true)
    private String name;

    @Email
    private String email;
}
