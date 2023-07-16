package com.example.instagram.controller;

import com.example.instagram.model.Post;
import com.example.instagram.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    //savePost,getPost

    @PostMapping("post")
    public String savePost(@RequestBody Post post){
        return  postService.savePost(post);
    }

    @GetMapping("posts")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}
