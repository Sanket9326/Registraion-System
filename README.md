Spring Boot Registration System
This Spring Boot project provides a user registration system with built-in validation and email functionality. The project includes the following features:

User Registration: Users can sign up by providing their first name, last name, address, email, and password.

The password is validated to ensure it contains at least one digit, one lowercase letter, one uppercase letter, and one special character, and is exactly 8 characters long.
Validation for other fields like first name, last name, and email is handled using annotations in the backend.
Validation and Error Handling: Frontend form validation in HTML, CSS, and JavaScript, along with backend validation to ensure only valid data is accepted.

Validation errors are returned with detailed messages.
Email Notification: The system includes functionality to send emails with custom subjects and body content to registered users using the /mail/send endpoint.

Technologies Used:

Backend: Spring Boot with REST APIs for handling registration and email sending.
Frontend: HTML, CSS, JavaScript for the registration form interface.
Validation: Java Bean Validation with jakarta.validation annotations.
Database: Integrated with JPA for user data storage.
This project showcases the integration of form validation, email functionality, and secure user registration.

