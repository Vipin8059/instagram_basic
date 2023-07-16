package com.example.instagram.repo;

import com.example.instagram.model.Post;
import com.example.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

}
