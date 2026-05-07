#  Product Management System (Spring Boot & Thymeleaf)

A full-stack inventory management web application developed using Spring Boot, Thymeleaf, and Spring Security.  
This project demonstrates a complete CRUD workflow with authentication, validation, dynamic search, and role-based access control.

---

##  Features

###  Product Management (CRUD)

- ➕ Add new products with:
  - Product Name
  - Price
  - Quantity

-  Display all products in a dynamic table
-  Update existing product information
-  Delete products from the database

---

### 🔍 Dynamic Search

- Search and filter products using keywords
- Implemented with Spring Data JPA query methods

---

###  Security

- Form-based authentication
- Role-based authorization:
  - `ADMIN` → Full access (Create, Edit, Delete)
  - `USER` → View-only access
- Spring Security integration
- In-memory authentication (extensible to JDBC/UserDetailsService)

---

###  Form Validation

Implementation of JSR-303 validation annotations:

- `@NotEmpty`
- `@Size`
- `@Min`

Used to ensure data integrity and proper user input validation.

---

###  UI Templating

- Thymeleaf Layout Dialect
- Reusable layouts and fragments
- Consistent design across all pages
- Reduced code duplication

---

##  Technology Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Spring Security

### Frontend
- Thymeleaf
- HTML5
- CSS3
- Bootstrap

### Database
- H2 Database (development)
- MySQL support

### Utilities
- Lombok
- Maven

---

## Prerequisites

Before running the project, make sure you have:

- JDK 17 or higher
- Maven 3.6+
- IntelliJ IDEA / Eclipse / VS Code

---

## ⚙️ Configuration

The application runs on port `8084` by default.

### `application.properties`

```properties
server.port=8084

spring.datasource.url=jdbc:h2:mem:productDb
spring.h2.console.enabled=true
