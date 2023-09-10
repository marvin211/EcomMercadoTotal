package com.devmarvin.ecommerce.application.repository;

import com.devmarvin.ecommerce.domain.Product;
import com.devmarvin.ecommerce.domain.Stock;

import java.util.List;

public interface StockRepository {
    Stock saveStock(Stock stock);
    List<Stock> getStockByProduct(Product product);
}
