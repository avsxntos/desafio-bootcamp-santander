package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tb_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tb_order_books",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;

    private double totalAmount;

    public Order() {}

    public Order(String orderId, Date date, List<Book> books, double totalAmount) {
        this.orderId = orderId;
        this.date = date;
        this.books = books;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
}
