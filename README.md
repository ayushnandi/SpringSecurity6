
#  Spring Security 6 + JWT Microservices Authentication System

A comprehensive project to **learn, explore, and implement** robust authentication & authorization using **Spring Security 6**, **JWT (JSON Web Tokens)**, **Spring Boot**, **Hibernate**, and **MySQL**, designed with **microservices architecture** in mind.

This project simulates a real-world secure backend system where user identity and access are managed via stateless token-based authentication. It’s built to be **modular, scalable, and production-ready** for distributed systems.

---

##  Project Description

This project is a deep dive into modern backend security using **Spring Security 6**. It includes features like:

-  User registration and secure login
-  JWT-based stateless authentication
-  Secure logout and token validation
-  Layered security filter chain architecture
-  CSRF protection setup
-  MySQL-based user management with JPA/Hibernate
-  Foundation for microservices authentication module

>  **Goal**: To build real-world experience in secure API development, mastering the flow of security filters, authentication providers, custom configurations, and stateless session handling in distributed systems.

---

##  What I Learned

This journey helped me deeply understand several complex backend security concepts. Here's what I took away from it:

###  Why Spring Security 6?
- It simplifies implementation of enterprise-grade security through filters, configurations, and annotations.
- Provides a flexible security filter chain and granular role-based access control.

###  Why JWT?
- Stateless and scalable authentication mechanism, ideal for microservices.
- Tokens carry user identity and roles — no need to persist sessions on the server.
- Includes expiration, issuer, and claims to securely authorize users.

###  Why CSRF?
- CSRF (Cross-Site Request Forgery) prevents unauthorized commands from being transmitted as if done by an authenticated user.
- Important when cookies are used or dealing with web forms.
- This project ensures CSRF tokens are disabled for stateless APIs, but taught me how and when to enable them.

###  Why Hibernate + MySQL?
- Hibernate offers ORM that abstracts SQL complexity and handles transactions and sessions.
- MySQL offers robust, production-level data storage to persist user credentials securely.

---

##  Technologies & Dependencies Used

| Technology | Purpose |
|------------|---------|
| ![Spring Boot](https://www.vectorlogo.zone/logos/springio/springio-icon.svg) **Spring Boot** | Framework for building standalone backend applications |
| ![Spring Security](https://www.vectorlogo.zone/logos/springio/springio-icon.svg) **Spring Security 6** | Securing REST APIs, roles, filter chains |
| ![JWT](https://www.vectorlogo.zone/logos/jsonwebtoken/jsonwebtoken-icon.svg) **JJWT (Jackson)** | Stateless authentication and access control |
| ![Hibernate](https://www.vectorlogo.zone/logos/hibernate/hibernate-icon.svg) **Hibernate** | Object Relational Mapping for DB |
| ![MySQL](https://www.vectorlogo.zone/logos/mysql/mysql-icon.svg) **MySQL** | Persistent database for user authentication data |
| ![Maven](https://www.vectorlogo.zone/logos/maven/maven-icon.svg) **Maven** | Project dependency management and build tool |

---

##  Key Concepts Covered

- **Spring Security Core**: Filter chain, authentication manager, security context
- **JWT Lifecycle**: Generation, validation, expiry, and revocation (logout)
- **AuthenticationProvider**: Custom logic to verify users from database
- **UserDetailsService**: DB-driven user fetching instead of in-memory
- **Token Validation**: Extracting JWT claims securely
- **Exception Handling**: For expired/invalid/missing tokens
- **Stateless Session Design**: Statelessness enables scalable services
- **CSRF Understanding**: When to use it and when to safely disable it

---

##  Architecture (Add These Visuals)

Include your architecture diagrams below this section:

### 1.  JWT Authentication Lifecycle  
![{47815608-3B08-4A30-BDBA-69516E1E07EE}](https://github.com/user-attachments/assets/0a1d2ce0-8ede-425f-aec2-742778028e43)


### 2.  Security Filter Chain Flow  
![{AC6E58E9-F2CC-43A9-9680-CEC03C674F6E}](https://github.com/user-attachments/assets/2eb077ed-fbed-4a1e-a78c-b0c836543777)


---

##  How to Run the Project

1. **Clone the Repo**  
   ```bash
   git clone https://github.com/your-username/SpringSecurityLearning.git
   ```
2. **Test with Postman**:
   - `POST /register` – Create new user
   - `POST /login` – Receive JWT Token
   - Add token to `Authorization: Bearer <token>` header for protected APIs

