package com.lakshay.tasks_be.mappers;

import com.lakshay.tasks_be.domain.dto.TaskDto;
import com.lakshay.tasks_be.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
