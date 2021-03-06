package me.lily.movie.service;

import me.lily.movie.domain.Movie;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MovieService {
    void save(Movie movie);

    Page<Movie> findAll(Integer page,Integer size);
    List<Movie> findAll();
    Movie getOne(Long id);
}
