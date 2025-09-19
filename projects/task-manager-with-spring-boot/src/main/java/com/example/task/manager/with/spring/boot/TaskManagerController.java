package com.example.task.manager.with.spring.boot;

import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskManagerController {

    @Autowired
    TaskManagerService taskService;

    @GetMapping("/add-task-form")
    public String showAddTaskForm() {
        return "add-task-form";
    }

    @PostMapping("/add-task")
    public String addTask(@RequestParam String title, @RequestParam String description, @RequestParam String priority) {
        if (taskService.checkUniqueName(title)) {
            taskService.createTask(title, description, priority);
            return "redirect:/display-tasks";
        } else {
            return "redirect:/task-error";
        }
    }

    @GetMapping("/display-tasks")
    public String displayTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "display-tasks";
    }

    @GetMapping("/delete-task")
    public String deleteTask(@RequestParam long id) {
        taskService.deleteTask(id);
        return "redirect:/display-tasks";
    }

    @GetMapping("/edit-task-form")
    public String showEditTaskForm (long id,  Model model) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "edit-task-form";
    }

    @PostMapping("/edit-task")
    public String editTask(@RequestParam long id, @RequestParam String newTitle,
                           @RequestParam String newDescription, @RequestParam String newPriority,
                           @RequestParam boolean newCompleted) {
        if (taskService.checkUniqueName(newTitle)) {
            taskService.editTask(id, newTitle, newDescription, newPriority, newCompleted);
            return "redirect:/display-tasks";
        } else {
            return "redirect:/task-error";
        }
    }

    @GetMapping("/task-error")
    public String showTaskError() {
        return "task-error";
    }
}
