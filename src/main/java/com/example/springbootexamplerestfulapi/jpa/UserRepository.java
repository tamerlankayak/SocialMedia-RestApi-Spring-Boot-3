package com.example.springbootexamplerestfulapi.jpa;

import com.example.springbootexamplerestfulapi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
