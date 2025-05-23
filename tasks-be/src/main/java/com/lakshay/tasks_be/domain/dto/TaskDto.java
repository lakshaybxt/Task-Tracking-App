package com.lakshay.tasks_be.domain.dto;

import com.lakshay.tasks_be.domain.entities.TaskPriority;
import com.lakshay.tasks_be.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
