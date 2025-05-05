package com.lakshay.tasks_be.service.impl;

import com.lakshay.tasks_be.domain.entities.TaskList;
import com.lakshay.tasks_be.repositories.TaskListRepository;
import com.lakshay.tasks_be.service.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskList() {
        return taskListRepository.findAll();
    }
}
