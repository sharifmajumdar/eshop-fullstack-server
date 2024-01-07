package com.rest_api.fs14backend.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "user")
@Table(name = "\"user\"")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    @Column(nullable = false, columnDefinition = "varchar(50)", unique = true)
    private String username;
    @Column(nullable = false, columnDefinition = "varchar(50)", unique = true)
    private String email;
    @Column(nullable = false, columnDefinition = "varchar(50)")
    private String password;
    @Column(nullable = true, columnDefinition = "varchar(50)")
    private String firstName;
    @Column(nullable = true, columnDefinition = "varchar(50)")
    private String lastName;
    @Column(nullable = false, columnDefinition = "varchar(150)")
    private String address;
    @Column(nullable = false, columnDefinition = "varchar(25)")
    private String phone;

    public User(String username, String email, String password, String firstName, String lastName, String address, String phone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }
}

