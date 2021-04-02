package com.example.SpringCRUDUpdate.model;

import com.example.SpringCRUDUpdate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
