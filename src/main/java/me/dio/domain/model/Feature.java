package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_features")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String description;

    public Feature() {}

    public Feature(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    // Getters and Setters
}
