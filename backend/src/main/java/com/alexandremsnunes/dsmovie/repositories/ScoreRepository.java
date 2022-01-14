package com.alexandremsnunes.dsmovie.repositories;

import com.alexandremsnunes.dsmovie.entities.Score;
import com.alexandremsnunes.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
    
}
