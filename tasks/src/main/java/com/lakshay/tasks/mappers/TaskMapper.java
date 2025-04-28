package com.lakshay.tasks.mappers;

import com.lakshay.tasks.domain.dto.TaskDto;
import com.lakshay.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
