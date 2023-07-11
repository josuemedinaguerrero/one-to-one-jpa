package com.jpa.OneToOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.OneToOne.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
