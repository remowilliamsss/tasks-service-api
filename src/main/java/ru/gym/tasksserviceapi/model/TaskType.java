package ru.gym.tasksserviceapi.model;

public enum TaskType {

    WORK("Рабочая задача"), HOBBY("Хобби задача"), EDUCATIONAL("Учебная задача"), OTHER("Прочая задача");
    private final String text;

    TaskType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
