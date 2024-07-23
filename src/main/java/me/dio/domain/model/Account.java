package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String balance;

    private int books;

    public Account() {}

    public Account(String number, String balance, int books) {
        this.number = number;
        this.balance = balance;
        this.books = books;
    }

    // Getters and Setters
}
