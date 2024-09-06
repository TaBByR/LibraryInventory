# 📚 Library Inventory Management Web App

This is a fullstack, end-to-end Maven Web Application developed in Java with traditional Spring and Hibernate for the backend. Then Thymeleaf, HTML, and CSS for the frontend. This application allows you to manage an inventory of books by viewing a list of them and managing individual ones (add, edit, delete). It also exposes a RESTful API for CRUD operations on the library inventory through the `/api/` endpoint. The application is deployed in Docker.

## 🛠️ Technologies Used
<div style="display: flex; flex-wrap: wrap; gap: 10px;">
    <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white" style="height: 30px;" alt="Java"/>
    <img src="https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white" style="height: 30px;" alt="Maven"/>
    <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white" style="height: 30px;" alt="Spring"/>
    <img src="https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white" style="height: 30px;" alt="Hibernate"/>
    <img src="https://img.shields.io/badge/MySQL-00758F?style=flat&logo=mysql&logoColor=white" style="height: 30px;" alt="MySQL"/>
    <img src="https://img.shields.io/badge/HTML-E34F26?style=flat&logo=html5&logoColor=white" style="height: 30px;" alt="HTML"/>
    <img src="https://img.shields.io/badge/CSS-1572B6?style=flat&logo=css3&logoColor=white" style="height: 30px;" alt="CSS"/>
    <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=flat&logo=thymeleaf&logoColor=white" style="height: 30px;" alt="Thymeleaf"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat&logo=intellij-idea&logoColor=white" style="height: 30px;" alt="IntelliJ IDEA"/>
    <img src="https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white" style="height: 30px;" alt="Docker"/>
</div>

## 🚀 How to Run

To run this project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/TaBByR/LibraryInventory.git
   ```
2. Go into the cloned directory:
   ```bash
   cd LibraryInventory
   ```
3. Make sure you have Docker and Maven installed.
4. Inside the directory, run:
   ```bash
   docker-compose up --build
   ```
5. Make sure the built Docker container is running.
6. In your web browser go to the URL http://localhost:8080/library/
7. (Optional) If you make changes in the code, run these commands to rebuild the project in Docker:
   ```bash
   docker-compose down -v
   ```
   ```bash
   docker-compose up --build
   ```
   
## 📡 RESTful API Endpoints and Request Methods
- **GET** `/api/books` - Retrieve a list of all books.
- **GET** `/api/books/<id>` - Retrieve details of a specific book by ID.
- **POST** `/api/books` - Add a new book.
- **PUT** `/api/books/<id>` - Update an existing book by ID.
- **DELETE** `/api/books/<id>` - Delete a book by ID.

<img src="https://media.tenor.com/MtJdP2cF4dEAAAAC/book.gif" style="width: 50%;" />
