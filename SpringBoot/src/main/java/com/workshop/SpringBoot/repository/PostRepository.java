package com.workshop.SpringBoot.repository;

import com.workshop.SpringBoot.domain.Post;
import com.workshop.SpringBoot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
