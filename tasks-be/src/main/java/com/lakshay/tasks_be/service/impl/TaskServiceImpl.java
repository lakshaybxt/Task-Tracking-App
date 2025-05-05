package com.lakshay.tasks_be.service.impl;

import com.lakshay.tasks_be.domain.entities.Task;
import com.lakshay.tasks_be.repositories.TaskRepository;
import com.lakshay.tasks_be.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTask(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
