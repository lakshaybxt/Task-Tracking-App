package com.lakshay.tasks_be.controllers;

import com.lakshay.tasks_be.domain.dto.TaskDto;
import com.lakshay.tasks_be.mappers.TaskMapper;
import com.lakshay.tasks_be.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/task-lists/{task_list_id}/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @GetMapping
    public List<TaskDto> listTasks(@PathVariable("task_list_id") UUID taksListId) {
        return taskService.listTask(taksListId)
                .stream()
                .map(task -> taskMapper.toDto(task))
                .toList();
    }

}
