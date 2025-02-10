# Expense Tracker Application

## Overview
The **Expense Tracker** is a Spring-based application that allows users to manage their expenses efficiently. It provides RESTful APIs for creating, updating, deleting, and retrieving expenses, ensuring smooth financial tracking. The API documentation is generated using **Swagger**, offering clear insights into the endpoints, request/response models, and authentication mechanisms.

## Features
- **User Authentication & Authorization** (JWT-based security)
- **Expense Management** (CRUD operations)
- **Category-based Expense Tracking**
- **Monthly & Yearly Expense Reports**
- **Search & Filter Expenses**
- **Swagger API Documentation**
- **Database Integration (JPA/Hibernate with PostgreSQL or MySQL)**
- **Exception Handling & Validation**

## Technologies Used
- **Spring Boot** (Backend framework)
- **Spring Security** (Authentication & authorization)
- **Spring Data JPA** (Database interaction)
- **Hibernate** (ORM framework)
- **PostgreSQL/MySQL** (Database)
- **Swagger/OpenAPI** (API documentation)
- **Lombok** (Boilerplate code reduction)
- **Maven** (Dependency management)

## Setup & Installation
### Prerequisites
Ensure you have the following installed:
- **JDK 17+**
- **Maven**
- **PostgreSQL/MySQL** (Ensure a database is running)

### Steps to Run the Application
1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-repo/expense-tracker.git
   cd expense-tracker
   ```
2. **Configure Database**:
   - Update `application.properties` or `application.yml` with your database credentials.
3. **Build the application**:
   ```sh
   mvn clean install
   ```
4. **Run the application**:
   ```sh
   mvn spring-boot:run
   ```

## API Documentation
The API documentation is available via Swagger UI. Once the application is running, visit:
```
http://localhost:8080/swagger-ui/index.html
```
This interface provides a detailed overview of all available API endpoints, including request parameters, responses, and authentication methods.

## License
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

## Contribution
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`feature-xyz`).
3. Commit your changes.
4. Push to your branch and create a pull request.

## Contact
For any inquiries or support, reach out at: **your-email@example.com**
