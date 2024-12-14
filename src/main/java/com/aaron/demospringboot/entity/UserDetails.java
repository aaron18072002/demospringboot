package com.aaron.demospringboot.entity;

import jakarta.persistence.*;

@Entity(name = "UserDetails")
public class UserDetails {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "gender", columnDefinition = "VARCHAR(30) NOT NULL")
    private String gender;

    @Column(name = "address", columnDefinition = "VARCHAR(50)")
    private String address;

    @Column(name = "id_card")
    private String idCard;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private Users user;

}
