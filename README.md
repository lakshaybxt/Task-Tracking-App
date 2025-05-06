# Task Manager Backend 🚀

This project is the backend part of a Task Manager application built with **Spring Boot**, **PostgreSQL**, and **Docker**. The application allows users to manage task lists and individual tasks, including creating, updating, deleting, and viewing tasks.

## Features ✨

- **Task Lists** 📋: Create, update, delete, and retrieve task lists.
- **Tasks** ✅: Manage tasks with details like title, description, priority, and status.
- **Error Handling** ⚠️: Global exception handling to return meaningful error responses.
- **Database** 🗄️: Uses **PostgreSQL** for data storage.
- **DTOs & Mappers** 🔄: Data Transfer Objects (DTOs) for API responses and request handling. Custom mappers for conversion between entities and DTOs.

## Tech Stack 💻

- **Spring Boot**: Java-based framework for building the backend.
- **PostgreSQL**: Relational database for storing task lists and tasks.
- **Docker**: For containerization of the application.
- **Maven**: Dependency management and build tool.
- **Lombok**: Java library to reduce boilerplate code (e.g., getters, setters).

## Project Structure 🏗️

- **Controllers**: Handle HTTP requests and responses.
  - `TaskController`: Manages tasks in a task list.
  - `TaskListController`: Manages task lists.
  - `GlobalExceptionHandler`: Handles global exceptions for error responses.

- **Services**: Contains business logic.
  - `TaskService`: Handles task operations.
  - `TaskListService`: Handles task list operations.

- **Repositories**: Interact with the database using Spring Data JPA.
  - `TaskRepository`: CRUD operations for tasks.
  - `TaskListRepository`: CRUD operations for task lists.

- **DTOs**: Data Transfer Objects for tasks and task lists.
  - `TaskDto`: Represents task data.
  - `TaskListDto`: Represents task list data.
  - `ErrorResponse`: Represents error details in case of failure.

- **Mappers**: Convert between entities and DTOs.
  - `TaskMapper`: Maps task entities to DTOs and vice versa.
  - `TaskListMapper`: Maps task list entities to DTOs and vice versa.

## Installation 🛠️

1. Clone the repository:

```bash
git clone https://github.com/yourusername/task-manager-backend.git
```

2. Navigate to the project directory:

```bash
cd task-manager-backend
```