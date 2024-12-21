package com.example.courses.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Admin")
@Table(name = "Admins")
@NoArgsConstructor
@Getter
@Setter
public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "admin_id" , unique = true, nullable = false)
    private Long id;
    @Column(name = "admin_name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "skype")
    private String skype;

    @Column(name = "password")
    private String password;
}
