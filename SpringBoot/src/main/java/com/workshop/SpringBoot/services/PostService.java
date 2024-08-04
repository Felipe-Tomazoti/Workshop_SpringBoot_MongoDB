package com.workshop.SpringBoot.services;

import com.workshop.SpringBoot.domain.Post;
import com.workshop.SpringBoot.domain.User;
import com.workshop.SpringBoot.dto.UserDTO;
import com.workshop.SpringBoot.repository.PostRepository;
import com.workshop.SpringBoot.repository.UserRepository;
import com.workshop.SpringBoot.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        return repo.fullSearch(text, minDate, maxDate);
    }
}
