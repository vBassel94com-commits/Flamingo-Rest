package com.example.flamingo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;

    @ElementCollection
    private List<String> ingredients;

    // Getters and Setters
}

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double discountPercentage;

    // Getters and Setters
}
