package com.lakshay.tasks_be.mappers.impl;

import com.lakshay.tasks_be.domain.dto.TaskListDto;
import com.lakshay.tasks_be.domain.entities.Task;
import com.lakshay.tasks_be.domain.entities.TaskList;
import com.lakshay.tasks_be.domain.entities.TaskStatus;
import com.lakshay.tasks_be.mappers.TaskListMapper;
import com.lakshay.tasks_be.mappers.TaskMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskListMapperImpl implements TaskListMapper {

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
                taskListDto.id(),
                taskListDto.title(),
                taskListDto.description(),
                Optional.ofNullable(taskListDto.tasks())
                        .map(tasks ->
                                tasks.stream()
                                        .map(taskDto -> taskMapper.fromDto(taskDto))
                                .toList()
                        ).orElse(null),
                null,
                null
        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return new TaskListDto(
                taskList.getId(),
                taskList.getTitle(),
                taskList.getDescription(),
                Optional.ofNullable(taskList.getTasks())
                        .map(tasks1 -> tasks1.size())
                        .orElse(0),
                calculateTaskListProgress(taskList.getTasks()),
                Optional.ofNullable(taskList.getTasks())
                        .map(tasks ->
                                tasks.stream()
                                        .map(task -> taskMapper.toDto(task))
                                        .toList()
                        ).orElse(null)
        );
    }

    private Double calculateTaskListProgress(List<Task> tasks) {
        if(null == tasks) return null;

        long closedTaskCount = tasks.stream().filter(task ->
                TaskStatus.CLOSED == task.getStatus()
        ).count();

        return (double) closedTaskCount / tasks.size();
    }
}
