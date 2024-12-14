package com.aaron.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Roles")
public class Roles {

    @Id
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role_name")
    private  String roleName;

}
