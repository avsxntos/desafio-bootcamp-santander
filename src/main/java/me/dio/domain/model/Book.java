package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private String ISBN;

    private double price;

    private boolean availableForRental;

    public Book() {}

    public Book(String title, String author, String ISBN, double price, boolean availableForRental) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.availableForRental = availableForRental;
    }

    // Getters and Setters
}
