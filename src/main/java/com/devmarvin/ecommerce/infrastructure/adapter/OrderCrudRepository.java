package com.devmarvin.ecommerce.infrastructure.adapter;

import com.devmarvin.ecommerce.infrastructure.entity.OrderEntity;
import com.devmarvin.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderCrudRepository extends CrudRepository<OrderEntity , Integer> {
    public Iterable<OrderEntity> findByUser(UserEntity userEntity);
}
