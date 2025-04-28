package com.lakshay.tasks.mappers;

import com.lakshay.tasks.domain.dto.TaskListDto;
import com.lakshay.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
