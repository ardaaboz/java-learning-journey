package com.example.task.manager.with.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskManagerService {

    @Autowired
    private TaskManagerRepository taskRepository;

    public void createTask(String title, String description, String priority) {
        Task newTask = new Task(title, description, priority);
        taskRepository.save(newTask);
        System.out.println("Task saved successfully!");
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(long id) {
        Task taskToGet = taskRepository.findById(id).get();
        return taskToGet;
    }

    public void deleteTask(long id) {
        taskRepository.delete(taskRepository.findById(id).get());
    }

    public void editTask(long id, String newTitle, String newDescription, String newPriority, boolean newCompleted) {
        Task taskToEdit = taskRepository.findById(id).get();

        taskToEdit.setTitle(newTitle);
        taskToEdit.setDescription(newDescription);
        taskToEdit.setPriority(newPriority);
        taskToEdit.setCompleted(newCompleted);

        taskRepository.save(taskToEdit);
    }

    public boolean checkUniqueName(String titleToCheck) {
        return taskRepository.findByTitle(titleToCheck) == null;
    }
}
