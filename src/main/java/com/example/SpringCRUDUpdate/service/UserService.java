package com.example.SpringCRUDUpdate.service;

import com.example.SpringCRUDUpdate.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
