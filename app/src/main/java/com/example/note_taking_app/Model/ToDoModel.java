package com.example.note_taking_app.Model;

public class ToDoModel extends TaskId {

    private String task , due;
    private int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }
}