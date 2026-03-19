package com.example.stocktracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.stocktracker.model.FavoriteStock;
import com.example.stocktracker.repository.FavoriteStockRepository;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteStockController {

    @Autowired
    private FavoriteStockRepository favoriteRepository;

    // API to save a new stock for a user
    @PostMapping("/add")
    public FavoriteStock addFavorite(@RequestBody FavoriteStock favorite) {
        return favoriteRepository.save(favorite);
    }

    // API to get all saved stocks for a specific user
    @GetMapping("/user/{userId}")
    public List<FavoriteStock> getFavorites(@PathVariable Long userId) {
        return favoriteRepository.findByUserId(userId);
    }
    
    // API to delete a stock by its ID
    @DeleteMapping("/delete/{id}")
    public String deleteFavorite(@PathVariable Long id) {
        favoriteRepository.deleteById(id);
        return "Stock with ID " + id + " has been deleted successfully!";
    }
    
    // API to search stocks by symbol name
    @GetMapping("/search/{symbol}")
    public List<FavoriteStock> searchBySymbol(@PathVariable String symbol) {
        return favoriteRepository.findByStockSymbol(symbol);
    }
}