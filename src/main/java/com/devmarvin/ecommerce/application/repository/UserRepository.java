package com.devmarvin.ecommerce.application.repository;

import com.devmarvin.ecommerce.domain.User;

public interface UserRepository {
    public User createUser(User user);
    public User findByEmail(String email);
    public User findById(Integer id);

}
