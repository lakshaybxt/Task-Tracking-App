package com.lakshay.tasks.controllers;

import com.lakshay.tasks.domain.dto.TaskListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/task-lists")
public class TaskListController {

    @GetMapping
    public List<TaskListDto> listTaskLists() {

    }
}
