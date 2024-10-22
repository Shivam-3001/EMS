package com.project.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
