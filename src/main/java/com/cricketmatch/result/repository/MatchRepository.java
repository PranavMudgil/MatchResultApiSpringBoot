package com.cricketmatch.result.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cricketmatch.result.Model.MatchResult;

@Repository
public interface MatchRepository extends JpaRepository<MatchResult,Integer>{

	
public List<MatchResult> findFirstByOrderByIdDesc();
//	//@Query("SELECT ball_id, from BallData ORDER BY ball_id DESC limit 1")
//	public MatchResult getLastEntry();
}
