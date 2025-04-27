# 📝 Task Tracking Project (Backend)

## Overview

The **Task Tracking Project** backend provides APIs for managing tasks efficiently. This backend allows users to create, update, delete, and categorize tasks based on priority, deadlines, and completion status. It aims to provide a seamless experience for managing tasks through a simple and effective API.

---

## Features

- **Create Tasks**: Add new tasks with details such as title, description, priority, and deadline.
- **Update Tasks**: Edit task details, including marking tasks as completed or changing the priority.
- **Delete Tasks**: Remove tasks that are no longer relevant.
- **Categorization**: Categorize tasks into different sections like "To Do," "In Progress," and "Completed."
- **Task Filtering**: Filter tasks based on priority, deadline, or status to quickly find specific tasks.

---

## Technologies Used

- **Backend**: (Mention your backend technology, e.g., Node.js, Spring Boot, etc.)
- **Database**: (Mention the database used, e.g., MongoDB, MySQL, etc.)
- **Authentication**: (Mention if you're using any authentication methods, e.g., JWT)

---

## API Documentation

### **GET /tasks**
- **Description**: Fetch all tasks.
- **Response**: A list of all tasks.

### **POST /tasks**
- **Description**: Create a new task.
- **Request Body**:
   ```json
   {
     "title": "Task title",
     "description": "Task description",
     "priority": "low",
     "deadline": "2025-05-01"
   }
    Response: Newly created task object.

### **PUT /tasks/{id}**
- **Description**:  Update a task by ID.
- **Request Body**:
   ```json
    {
    "title": "Updated title",
    "status": "Completed"
    }
    Response: Updated task object.

### **DELETE /tasks/{id}**
- **Description**:  Delete a task by ID.
- **Request Body**: Success message.

## Getting Started
Prerequisites:
To run the backend locally, you need the following tools installed:

- Node.js (if using Node.js)

MySQL or any other database (if applicable)

Installation
Clone the repository:

```bash

git clone https://github.com/yourusername/task-tracking-backend.git
```
Navigate to the project directory:

```bash

cd task-tracking-backend
```
Install dependencies (if applicable):

```bash

npm install
```
Set up the database (if applicable):

### Create a database named task_tracker (or your chosen name).

### Run the SQL script to set up tables (if applicable).

### Start the development server:

```bash

npm run dev
```
Open the backend in your web browser or Postman to interact with the API."

©2025 lakshay. All rights reserved.