package com.devmarvin.ecommerce.application.service;

import com.devmarvin.ecommerce.application.repository.OrderRepository;
import com.devmarvin.ecommerce.domain.Order;
import com.devmarvin.ecommerce.domain.User;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order){
        return  orderRepository.createOrder(order);
    }

    public Iterable<Order> getOrders(){
        return  orderRepository.getOrders();
    }

    public Iterable<Order> getOrdersByuser(User user){
        return orderRepository.getOrdersByUser(user);
    }
}
