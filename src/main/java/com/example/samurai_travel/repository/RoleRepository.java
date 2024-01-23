package com.example.samurai_travel.repository;

 import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samurai_travel.entity.Role;

 public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String string);

}