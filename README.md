# 🎓 Student Registration System

A full-stack **Student Registration System** built using **Java Spring Boot (backend)**, **MySQL (database)**, and **HTML/CSS/JavaScript (frontend)**.  
This project allows users to register student details (name, parents’ names, marks, DOB, gender, caste, address, etc.) and store them securely in a database.

---

## 🚀 Features
- ✅ Student Registration Form with validation (frontend)  
- ✅ REST API backend using Spring Boot  
- ✅ MySQL database integration with Hibernate/JPA  
- ✅ CRUD Operations (Create, Read, Update, Delete students)  
- ✅ Cross-Origin support for frontend ↔ backend communication  
- ✅ Auto schema update using Hibernate  

---

## 🛠️ Tech Stack
- **Frontend:** HTML, CSS, JavaScript  
- **Backend:** Spring Boot (Java), Spring Data JPA  
- **Database:** MySQL  
- **Build Tool:** Maven  

---

## 📂 Project Structure
registrationsystem/
├── src/main/java/com/example/registrationsystem/
│ ├── RegistrationsystemApplication.java # Main Spring Boot Application
│ ├── model/User.java # Entity class (maps to students table)
│ ├── repository/UserRepository.java # Repository interface for DB operations
│ ├── controller/UserController.java # REST API Controller
│
├── src/main/resources/
│ ├── application.properties # Local DB configuration (ignored in GitHub)
│ ├── application-example.properties # Sample config (for GitHub)
│
└── frontend/
├── index.html # Student Registration Form, # Frontend validation + API integration 
