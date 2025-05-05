package com.lakshay.tasks_be.service;

import com.lakshay.tasks_be.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskList();
}
