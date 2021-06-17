package com.franlops.TestingJUnit.movies.data;

import com.franlops.TestingJUnit.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
