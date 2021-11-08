package com.example.ibooksproject.service;

import com.example.ibooksproject.models.book.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public List<Book> findAll();
    public Book findById(int id);
}
