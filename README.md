Item Management REST API

Backend Documentation

1. Introduction

This project is a Java-based RESTful backend application developed using Spring Boot.
The application provides APIs to manage a collection of items (e.g., products or movies) using in-memory data storage.

The purpose of this project is to demonstrate:

REST API development

Clean backend architecture

Input validation

In-memory data handling without a database

2. Technology Stack
Technology	Description
Java	Version 17
Spring Boot	Backend framework
Maven	Build & dependency management
REST API	Communication protocol
ArrayList	In-memory data storage
3. Project Architecture

The application follows a layered architecture to ensure separation of concerns and maintainability.

Controller → Service → In-Memory Storage

Architecture Layers

Controller Layer
Handles HTTP requests and responses.

Service Layer
Contains business logic and manages data operations.

Model Layer
Defines the structure of the data objects.

4. Project Structure
src/main/java
 └── com.example.itemapi
     ├── controller
     │    └── ItemController.java
     ├── service
     │    └── ItemService.java
     ├── model
     │    └── Item.java
     └── ItemApiApplication.java
