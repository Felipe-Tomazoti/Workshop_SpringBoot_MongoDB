package com.workshop.SpringBoot.repository;

import com.workshop.SpringBoot.domain.Post;
import com.workshop.SpringBoot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {}
