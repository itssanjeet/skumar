package com.sk.skumar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.skumar.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
