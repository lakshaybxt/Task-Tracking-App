package com.lakshay.tasks_be.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
