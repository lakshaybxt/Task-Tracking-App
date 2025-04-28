package com.lakshay.tasks.services.impl;

import com.lakshay.tasks.domain.entities.TaskList;
import com.lakshay.tasks.repositories.TaskListRepository;
import com.lakshay.tasks.services.TaskListService;
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
