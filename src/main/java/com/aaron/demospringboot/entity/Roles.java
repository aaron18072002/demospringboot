package com.aaron.demospringboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role_name", nullable = false, length = 30)
    private  String roleName;

    @Column(name = "role_desc", columnDefinition = "VARCHAR(150)")
    private String roleDesc;

    @Column(name = "created_date", columnDefinition = "DATETIME")
    private LocalDateTime createdDate;

}
