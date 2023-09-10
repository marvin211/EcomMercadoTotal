package com.devmarvin.ecommerce.application.repository;

import com.devmarvin.ecommerce.domain.Order;
import com.devmarvin.ecommerce.domain.User;

public interface OrderRepository {
    public Order createOrder(Order order);
    public Iterable<Order> getOrders();
    public Iterable<Order> getOrdersByUser(User user);
}
