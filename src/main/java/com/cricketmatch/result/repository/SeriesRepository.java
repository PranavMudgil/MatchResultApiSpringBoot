package com.cricketmatch.result.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketmatch.result.Model.SeriesScore;

@Repository
public interface SeriesRepository extends JpaRepository<SeriesScore, Integer>{ 

	public SeriesScore findFirstByOrderByIdDesc();
	
}
