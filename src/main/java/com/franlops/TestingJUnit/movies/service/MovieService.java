package com.franlops.TestingJUnit.movies.service;

import com.franlops.TestingJUnit.movies.data.MovieRepository;
import com.franlops.TestingJUnit.movies.model.Genre;
import com.franlops.TestingJUnit.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }
}
