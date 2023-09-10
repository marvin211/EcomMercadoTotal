package com.devmarvin.ecommerce.infrastructure.adapter;

import com.devmarvin.ecommerce.infrastructure.mapper.UserMapper;
import com.devmarvin.ecommerce.application.repository.OrderRepository;
import com.devmarvin.ecommerce.domain.Order;
import com.devmarvin.ecommerce.domain.User;
import com.devmarvin.ecommerce.infrastructure.mapper.OrderMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final OrderCrudRepository orderCrudRepository;
    private final OrderMapper orderMapper;
    private  final UserMapper userMapper;

    public OrderRepositoryImpl(OrderCrudRepository orderCrudRepository, OrderMapper orderMapper, UserMapper userMapper) {
        this.orderCrudRepository = orderCrudRepository;
        this.orderMapper = orderMapper;
        this.userMapper = userMapper;
    }

    @Override
    public Order createOrder(Order order) {
        return orderMapper.toOrder( orderCrudRepository.save( orderMapper.toOrderEntity(order) ) );
    }

    @Override
    public Iterable<Order> getOrders() {
        return orderMapper.toOrders( orderCrudRepository.findAll() );
    }

    @Override
    public Iterable<Order> getOrdersByUser(User user) {
        return orderMapper.toOrders(orderCrudRepository.findByUser(userMapper.toUserEntity(user) ));
    }
}
