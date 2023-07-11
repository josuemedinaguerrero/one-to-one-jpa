package com.jpa.OneToOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.OneToOne.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
