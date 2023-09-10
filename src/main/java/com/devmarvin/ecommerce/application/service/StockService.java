package com.devmarvin.ecommerce.application.service;

import com.devmarvin.ecommerce.application.repository.StockRepository;
import com.devmarvin.ecommerce.domain.Product;
import com.devmarvin.ecommerce.domain.Stock;

import java.util.List;

public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock saveStock(Stock stock){
        return stockRepository.saveStock(stock);
    }

    public List<Stock> getStockByProduct(Product product){
        return stockRepository.getStockByProduct(product);
    }

}
