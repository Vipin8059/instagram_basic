package com.example.instagram.service;

import com.example.instagram.model.Post;
import com.example.instagram.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public String savePost(Post post) {
        postRepo.save(post);
        return "post saved";
    }

    public List<Post> getAllPost() {
        return  postRepo.findAll();
    }
}
