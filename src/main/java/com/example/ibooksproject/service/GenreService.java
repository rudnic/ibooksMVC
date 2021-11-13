package com.example.ibooksproject.service;

import com.example.ibooksproject.models.genres.Genre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenreService {
    public List<Genre> findAll();
}
