package com.example.stocktracker.model;

import jakarta.persistence.*;

@Entity
@Table(name="favorite_stocks") // This will create a table in Oracle
public class FavoriteStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stockSymbol; // For example: "TCS", "GOOGLE"
    private Long userId;        // This connects the stock to a User ID

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getStockSymbol() { return stockSymbol; }
    public void setStockSymbol(String stockSymbol) { this.stockSymbol = stockSymbol; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}