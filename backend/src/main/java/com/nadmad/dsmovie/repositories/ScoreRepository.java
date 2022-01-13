package com.nadmad.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadmad.dsmovie.entities.Score;
import com.nadmad.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}