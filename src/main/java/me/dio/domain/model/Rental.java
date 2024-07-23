package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "tb_rentals")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rentalId;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;

    private double rentalFee;

    public Rental() {}

    public Rental(String rentalId, Date startDate, Date endDate, Book book, double rentalFee) {
        this.rentalId = rentalId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.book = book;
        this.rentalFee = rentalFee;
    }

    // Getters and Setters
}
