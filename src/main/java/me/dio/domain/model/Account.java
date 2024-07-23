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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    // Getters and Setters
}
