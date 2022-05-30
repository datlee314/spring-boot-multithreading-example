package com.delta.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
