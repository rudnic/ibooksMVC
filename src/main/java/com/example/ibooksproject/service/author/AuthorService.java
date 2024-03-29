package com.example.ibooksproject.service.author;

import com.example.ibooksproject.models.authors.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    public List<Author> findAll();
    public Author findById(int id);
}
