package com.example.instagram.repo;

import com.example.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {




    User findFirstByEmail(String newEmail);
}
