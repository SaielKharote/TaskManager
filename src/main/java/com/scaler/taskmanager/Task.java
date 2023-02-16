package com.scaler.taskmanager;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Task {
    Integer id;
    String title;
    String description;
    Date dueDate;


    public Task(Integer id, String title, String description, Date dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public Task() {}


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle() {
        this.title = title;
    }

    public void setDescription() {
        this.description = description;
    }

    public void setDueDate() {
        this.dueDate = dueDate;
    }
}
