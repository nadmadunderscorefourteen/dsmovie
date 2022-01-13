package com.nadmad.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadmad.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
