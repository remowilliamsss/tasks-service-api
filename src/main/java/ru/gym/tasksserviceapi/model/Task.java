package ru.gym.tasksserviceapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

    @Getter
    @Setter
    @Entity(name = "tasks")
    public class Task {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotNull
        private TaskType title;

        @NotNull
        private String description;

        @NotNull
        @Column(name = "create_at")
        private LocalDateTime createDate = LocalDateTime.now();

        @Null
        @Column(name = "completed_at")
        private LocalDateTime completedDate;

        @NotNull
        private String status;



//    user_id int REFERENCES users(id) ,
//    status varchar(50) not null
    }

