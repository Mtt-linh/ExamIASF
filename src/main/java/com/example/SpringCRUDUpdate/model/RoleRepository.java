package com.example.SpringCRUDUpdate.model;

import com.example.SpringCRUDUpdate.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
