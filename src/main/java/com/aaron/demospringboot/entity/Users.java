package com.aaron.demospringboot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "fullname", columnDefinition = "VARCHAR(30) NOT NULL")
    private String fullName;

    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dateOfBirth;

    @Column(name = "username", columnDefinition = "VARCHAR(30) NOT NULL")
    private String username;

    @Column(name = "password", columnDefinition = "VARCHAR(200) NOT NULL")
    private String password;

    @Column(name = "created_at", columnDefinition = "DATE")
    private LocalDateTime createdAt;

    @Column(name = "role_id")
    private int roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Roles role;

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
}
