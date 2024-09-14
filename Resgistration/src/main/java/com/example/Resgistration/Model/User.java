package com.example.Resgistration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "First name is required")
    @Size(min = 4,message = "Size of first name should be more than 4")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Size(min = 4,message = "Size of last name should be more than 4")
    private String lastName;

    @NotEmpty(message = "Address is required")
    private String address;

    @Email(message = "Valid Email required")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8,max = 8,message = "password length should be 8 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
            message = "Password must contain at least one digit, one lowercase, one uppercase letter, and one special character")
    private String password;

}
