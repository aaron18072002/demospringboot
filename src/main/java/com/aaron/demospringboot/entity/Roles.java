package com.aaron.demospringboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

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

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<Users> users;

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public List<Users> getUsers() {
        return users;
    }

}
