# Task Tracking App Backend 🚀

This project is the backend part of the **Task Tracking App**, built with **Spring Boot**, **PostgreSQL**, and **Docker**. The application allows users to manage task lists and individual tasks, including creating, updating, deleting, and viewing tasks. The frontend code is located in the `task-fe` repository (developed by others), while this repository handles the backend logic in `task-be`.

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
git clone https://github.com/yourusername/Task-Tracking-App.git
```

2. Navigate to the project directory:

```bash
cd Task-Tracking-App/task-be
```

3. Set up your PostgreSQL database (either locally or using Docker).

4. Update application.properties (in src/main/resources/application.properties) with your database configuration.

5. Build the application:

```bash
mvn clean install
```

6. Run the application:

```bash
mvn spring-boot:run
```

## Docker Setup 🐳

Alternatively, you can use Docker to run the application with the database.

1. **Build the Docker image:**

```bash
docker build -t task-tracking-app-backend .
```

2. **Run the Docker container:**


```bash
docker run -p 8080:8080 task-tracking-app-backend.
```

## API Endpoints 📡

### Task Lists

- **GET** `/task-lists`: Get all task lists.
- **POST** `/task-lists`: Create a new task list.
- **GET** `/task-lists/{task_list_id}`: Get a task list by ID.
- **PUT** `/task-lists/{task_list_id}`: Update a task list by ID.
- **DELETE** `/task-lists/{task_list_id}`: Delete a task list by ID.

### Tasks

- **GET** `/task-lists/{task_list_id}/tasks`: Get all tasks in a task list.
- **POST** `/task-lists/{task_list_id}/tasks`: Create a new task in a task list.
- **GET** `/task-lists/{task_list_id}/tasks/{task_id}`: Get a task by ID.
- **PUT** `/task-lists/{task_list_id}/tasks/{task_id}`: Update a task by ID.
- **DELETE** `/task-lists/{task_list_id}/tasks/{task_id}`: Delete a task by ID.

## Error Handling ⚡

Global exception handling is implemented with
