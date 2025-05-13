package com.example.todo_api.member;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_email")
    private String email;

    @Column(name = "member_password", columnDefinition = "varchar(30)")
    private String password;

    @Column(name = "member_search",columnDefinition = "varchar(30)")
    private String search;
}
