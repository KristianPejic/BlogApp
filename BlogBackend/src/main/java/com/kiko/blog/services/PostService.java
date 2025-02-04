package com.kiko.blog.services;

import com.kiko.blog.domain.CreatePostRequest;
import com.kiko.blog.domain.UpdatePostRequest;
import com.kiko.blog.domain.entities.Post;
import com.kiko.blog.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);

    List<Post> getAllPosts(UUID categoryId, UUID tagId);

    List<Post> getDraftPosts(User user);

    Post createPost(User user, CreatePostRequest createPostRequest);

    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);

    void deletePost(UUID id);
}
