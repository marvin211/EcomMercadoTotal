package com.devmarvin.ecommerce.infrastructure.adapter;

import com.devmarvin.ecommerce.infrastructure.entity.ProductEntity;
import com.devmarvin.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository  extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity> findByUserEntity (UserEntity userEntity);
}
