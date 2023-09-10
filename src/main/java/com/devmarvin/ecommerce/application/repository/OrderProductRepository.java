package com.devmarvin.ecommerce.application.repository;

import com.devmarvin.ecommerce.domain.Order;
import com.devmarvin.ecommerce.domain.OrderProduct;

import java.util.List;

public interface OrderProductRepository {
    public OrderProduct create (OrderProduct orderProduct);
    public Iterable<OrderProduct>  getOrderProducts();
    public List<OrderProduct> getOrdersProductByOrder(Order order);
}
