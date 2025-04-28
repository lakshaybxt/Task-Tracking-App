package com.lakshay.tasks.domain.dto;

import com.lakshay.tasks.domain.entities.Task;
import com.lakshay.tasks.domain.entities.TaskList;
import com.lakshay.tasks.domain.entities.TaskPriority;
import com.lakshay.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
