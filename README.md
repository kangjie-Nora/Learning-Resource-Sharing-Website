# Learning Resource Sharing Platform

## Project Overview

The Learning Resource Sharing Platform is a B/S architecture-based system designed to provide a convenient platform for students and teachers to share, download, and manage campus documents. The system is developed using the **Spring Boot** framework and utilizes **MySQL** for data storage, aiming to provide efficient, convenient, and stable document sharing and communication services for users inside and outside the campus.

The platform is divided into two roles: **Administrator** and **User**. Administrators are responsible for overall system management, including user management, document management, feedback handling, and more. Users can register, log in, share documents, comment on documents, collect documents, and more. The system features a clear interface, simple operation, and is capable of meeting the different needs of students, teachers, and administrators.

## Features

### Administrator Features
- **Personal Center**: Administrators can view and edit their personal information.
- **Student Management**: Administrators can view and manage student information, including modifying, deleting, and adding students.
- **Document Sharing Management**: Administrators review and manage documents uploaded by users, including deleting, editing, and categorizing documents.
- **Resource Classification Management**: Administrators manage document categories to help users quickly find the documents they need.
- **Report and Feedback Management**: Administrators handle user-reported issues and maintain order on the platform.
- **System Management**: Administrators configure the system and manage operation logs.

### User Features
- **Registration and Login**: Users can register and log in using their email or phone number.
- **Personal Center**: Users can view and edit their personal information.
- **My Favorites**: Users can collect documents they like for easy access later.
- **Document Comments**: Users can comment on and rate uploaded documents, sharing their thoughts with others.

## Tech Stack

- **Frontend Framework**: Developed using HTML, CSS, JavaScript, and Vue.js.
- **Backend Framework**: Developed using **Spring Boot**, providing stable API endpoints.
- **Database**: **MySQL** is used for data storage, with a well-designed database structure to ensure data consistency and integrity.

## System Architecture

The system uses the **B/S (Browser/Server)** architecture, where the browser acts as the client and the server handles the business logic. Users access the system through their browsers, while all business logic and data storage are handled on the server. The backend is developed using the Spring Boot framework, offering RESTful API interfaces, and the frontend communicates with the backend through AJAX.

## Database Design

The system uses **MySQL** for database management. The primary tables include:
- **Users Table (users)**: Stores basic user information, including username, password, email, and role.
- **Documents Table (resources)**: Stores uploaded documents, including titles, files, uploaders, and categories.
- **Comments Table (comments)**: Stores user comments on documents.
- **Categories Table (categories)**: Stores document categories to help users find documents more efficiently.
- **Favorites Table (favorites)**: Stores user-favorited documents.
- **Feedback Table (feedback)**: Stores feedback and reported issues submitted by users.

## Installation and Running

### System Requirements

- **JDK 1.8** or higher
- **MySQL 5.7** or higher
- **Maven**
- **Node.js** 
