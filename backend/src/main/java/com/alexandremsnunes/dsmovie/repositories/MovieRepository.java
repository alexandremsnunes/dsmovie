package com.alexandremsnunes.dsmovie.repositories;

import com.alexandremsnunes.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
