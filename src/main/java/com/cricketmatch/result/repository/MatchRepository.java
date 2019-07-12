package com.cricketmatch.result.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cricketmatch.result.Model.MatchResult;

@Repository
public interface MatchRepository extends JpaRepository<MatchResult,Integer>{

	
public MatchResult findFirstByOrderByIdDesc();
//	//@Query("SELECT ball_id, from BallData ORDER BY ball_id DESC limit 1")
//	public MatchResult getLastEntry();


@Query(value = "Select match_id from ball_data order by match_id desc limit 1",nativeQuery = true)
public Integer getMatchId();

public List<MatchResult> findByMatchId(int id);

}
