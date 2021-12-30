package com.example.airbnb.service;


import com.example.airbnb.model.Post;

public interface IPostService extends IService<Post> {
    Iterable<Post> findByModeId();

}
