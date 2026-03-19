package com.example.stocktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stocktracker.model.FavoriteStock;
import java.util.List;

public interface FavoriteStockRepository extends JpaRepository<FavoriteStock, Long> {
    
    // This custom method finds all stocks saved by a specific User ID
    List<FavoriteStock> findByUserId(Long userId);
    
	 // English: Add this to search by symbol
	 List<FavoriteStock> findByStockSymbol(String stockSymbol);
}