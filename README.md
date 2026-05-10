Use this README style for your MovieBooking project. I used your uploaded format as reference. 

# 🎬 Spring Boot Movie Booking Backend Project

## 📌 Project Overview

This project is a complete Movie Booking Backend Application developed using:

* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* MySQL
* Swagger OpenAPI
* Razorpay Payment Gateway
* Java Mail Sender

The application provides REST APIs for managing:

* Movies
* Theaters
* Seats
* Bookings
* Users
* Admin
* Payments
* Poster Upload
* Email Sending

This project simulates a real-world online movie ticket booking system.

---

# 🚀 Features

## ✅ User Features

* User Registration
* User Login
* Browse Movies
* Search Movies
* Book Tickets
* View Available Seats
* Online Payment
* Email Notifications
* Upload Movie Posters

---

## ✅ Admin Features

* Add Movies
* Manage Theaters
* Manage Seats
* Manage Bookings
* View Users
* Swagger API Documentation

---

# 🛠️ Technologies Used

| Technology       | Purpose               |
| ---------------- | --------------------- |
| Java 17          | Programming Language  |
| Spring Boot      | Backend Framework     |
| Spring MVC       | REST APIs             |
| Spring Data JPA  | Database Operations   |
| Hibernate        | ORM Framework         |
| MySQL            | Database              |
| Swagger OpenAPI  | API Documentation     |
| Razorpay         | Payment Gateway       |
| Maven            | Dependency Management |
| Java Mail Sender | Email Sending         |

---

# 📁 Project Structure

```text
src/main/java/com/moviebooking/project/main
│
├── controller
│   ├── AdminController.java
│   ├── BookingController.java
│   ├── EmailController.java
│   ├── MovieController.java
│   ├── PaymentController.java
│   ├── PosterUploadController.java
│   ├── SeatController.java
│   ├── TheaterController.java
│   └── UserController.java
│
├── Entity
│   ├── Admin.java
│   ├── Booking.java
│   ├── Movie.java
│   ├── Payment.java
│   ├── Seat.java
│   ├── Theater.java
│   └── User.java
│
├── Repository
│   ├── AdminRepository.java
│   ├── BookingRepository.java
│   ├── MovieRepository.java
│   ├── PaymentRepository.java
│   ├── SeatRepository.java
│   ├── TheaterRepository.java
│   └── UserRepository.java
│
├── Service
│   ├── AdminService.java
│   ├── AdminServiceImpl.java
│   ├── BookingService.java
│   ├── BookingServiceImpl.java
│   ├── EmailService.java
│   ├── EmailServiceImpl.java
│   ├── MovieService.java
│   ├── MovieServiceImpl.java
│   ├── PaymentService.java
│   ├── PaymentServiceImpl.java
│   ├── PosterUploadService.java
│   ├── PosterUploadServiceImpl.java
│   ├── SeatService.java
│   ├── SeatServiceImpl.java
│   ├── TheaterService.java
│   ├── TheaterServiceImpl.java
│   ├── UserService.java
│   └── UserServiceImpl.java
│
├── exception
│   ├── ErrorResponse.java
│   └── GlobalExceptionHandler.java
│
├── config
│   ├── OpenApiConfig.java
│   └── RazorPayConfig.java
│
└── MainApplication.java
```

---

# ⚙️ Setup Instructions

## ✅ Step 1: Clone Repository

```bash
git clone https://github.com/JeevaniGowda/MovieBookingSystem.git
```

---

## ✅ Step 2: Open Project

Open project in:

* Eclipse
* Spring Tool Suite (STS)
* IntelliJ IDEA
* VS Code

---

## ✅ Step 3: Configure MySQL

```sql
CREATE DATABASE moviebooking;
```

---

## ✅ Step 4: Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/moviebooking?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8083

spring.servlet.multipart.enabled=true

spring.mail.host=smtp.gmail.com
spring.mail.port=587

spring.mail.username=yourgmail@gmail.com
spring.mail.password=your_app_password

spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Razorpay
razorpay.key=your_key
razorpay.secret=your_secret
```

---

# 📦 Maven Dependencies

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>com.razorpay</groupId>
    <artifactId>razorpay-java</artifactId>
    <version>1.4.4</version>
</dependency>
```

---

# ▶️ Running the Project

Run:

```text
MainApplication.java
```

OR

```bash
mvn spring-boot:run
```

---

# 📖 Swagger Documentation

## Swagger UI

```text
http://localhost:8083/swagger-ui/index.html
```

---

# 📌 API Endpoints

# 🎬 Movie APIs

| Method | Endpoint         | Description     |
| ------ | ---------------- | --------------- |
| POST   | /api/movies      | Add Movie       |
| GET    | /api/movies      | Get All Movies  |
| GET    | /api/movies/{id} | Get Movie By Id |
| DELETE | /api/movies/{id} | Delete Movie    |

---

# 🎟️ Booking APIs

| Method | Endpoint                | Description       |
| ------ | ----------------------- | ----------------- |
| POST   | /api/bookings           | Book Ticket       |
| GET    | /api/bookings           | Get All Bookings  |
| GET    | /api/bookings/user/{id} | Get User Bookings |
| DELETE | /api/bookings/{id}      | Cancel Booking    |

---

# 💺 Seat APIs

| Method | Endpoint             | Description     |
| ------ | -------------------- | --------------- |
| POST   | /api/seats           | Add Seat        |
| GET    | /api/seats           | Get All Seats   |
| GET    | /api/seats/available | Available Seats |
| DELETE | /api/seats/{id}      | Delete Seat     |

---

# 🏢 Theater APIs

| Method | Endpoint           | Description      |
| ------ | ------------------ | ---------------- |
| POST   | /api/theaters      | Add Theater      |
| GET    | /api/theaters      | Get All Theaters |
| DELETE | /api/theaters/{id} | Delete Theater   |

---

# 👤 User APIs

| Method | Endpoint            | Description   |
| ------ | ------------------- | ------------- |
| POST   | /api/users/register | Register User |
| POST   | /api/users/login    | User Login    |
| GET    | /api/users          | Get All Users |

---

# 👨‍💼 Admin APIs

| Method | Endpoint            | Description    |
| ------ | ------------------- | -------------- |
| POST   | /api/admin/register | Register Admin |
| POST   | /api/admin/login    | Admin Login    |

---

# 🖼️ Poster Upload APIs

| Method | Endpoint    | Description         |
| ------ | ----------- | ------------------- |
| POST   | /api/poster | Upload Movie Poster |

---

# 📧 Email APIs

| Method | Endpoint        | Description |
| ------ | --------------- | ----------- |
| POST   | /api/email/send | Send Email  |

---

# 💳 Payment APIs

| Method | Endpoint                  | Description           |
| ------ | ------------------------- | --------------------- |
| POST   | /api/payment/create-order | Create Razorpay Order |

---

# 🧪 Testing APIs

APIs can be tested using:

* Swagger UI
* Postman
* Thunder Client

---

# 📚 Concepts Learned

* Spring Boot
* REST APIs
* CRUD Operations
* JPA & Hibernate
* Exception Handling
* Swagger Documentation
* File Upload
* Email Integration
* Razorpay Integration
* Maven

---

# 👩‍💻 Author

## Jeevani Gowda

Java Full Stack Developer

---

# 📌 Git Commands

```bash
git init

git add .

git commit -m "Initial commit for movie booking backend project"

git branch -M main

git remote add origin https://github.com/JeevaniGowda/MovieBookingSystem.git

git push -u origin main
```

---

# ⭐ Conclusion

This Movie Booking Backend Project demonstrates real-world backend development using Spring Boot.

The project includes:

✅ CRUD APIs
✅ Swagger Documentation
✅ Payment Integration
✅ Email Sending
✅ Poster Upload
✅ Exception Handling
✅ REST APIs
