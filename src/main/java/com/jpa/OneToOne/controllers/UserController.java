package com.jpa.OneToOne.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.OneToOne.entities.Address;
import com.jpa.OneToOne.entities.User;
import com.jpa.OneToOne.repositories.AddressRepository;
import com.jpa.OneToOne.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private AddressRepository addressRepository;

  @GetMapping
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @GetMapping("/address")
  public List<Address> getAddresses() {
    return addressRepository.findAll();
  }

  @PostMapping
  public User saveUser(@RequestBody User user) {
    return userRepository.save(user);
  }
  
}
