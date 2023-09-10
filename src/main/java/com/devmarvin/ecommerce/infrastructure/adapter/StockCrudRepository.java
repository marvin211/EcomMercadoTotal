package com.devmarvin.ecommerce.infrastructure.adapter;

import com.devmarvin.ecommerce.infrastructure.entity.ProductEntity;
import com.devmarvin.ecommerce.infrastructure.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockCrudRepository extends CrudRepository<StockEntity, Integer> {
    List<StockEntity> findByProductEntity(ProductEntity productEntity);
}
