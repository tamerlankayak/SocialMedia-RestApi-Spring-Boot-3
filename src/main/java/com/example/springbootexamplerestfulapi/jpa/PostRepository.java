package com.example.springbootexamplerestfulapi.jpa;

import com.example.springbootexamplerestfulapi.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
