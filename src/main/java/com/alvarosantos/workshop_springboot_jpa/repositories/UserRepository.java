package com.alvarosantos.workshop_springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarosantos.workshop_springboot_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
