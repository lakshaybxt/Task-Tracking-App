package com.lakshay.tasks_be.service;

import com.lakshay.tasks_be.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<Task> listTask(UUID taskListId);
}
