package com.cricketmatch.result.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricketmatch.result.Model.MatchResult;
import com.cricketmatch.result.repository.MatchRepository;
import com.cricketmatch.result.repository.SeriesRepository;

@RestController
@RequestMapping(value = "/api")
public class MatchResource {

	@Autowired
	MatchRepository repository;
	@Autowired
	SeriesRepository series_repo;
	
	@RequestMapping(value="score")
	@ResponseBody
	public List<Object> getScore() {
		List<Object> list = new ArrayList<>();
		list.add(repository.findFirstByOrderByIdDesc());
		list.add(series_repo.findFirstByOrderByIdDesc());
		
		return list;
	}
	

	@RequestMapping(value = "/match")
	public MatchResult getResult() {
		System.out.println("match api hittt");
		MatchResult balls = repository.findFirstByOrderByIdDesc();
		return balls;
	}

	@RequestMapping(value = "/all")
	public List<MatchResult> getAll() {
		int id = repository.getMatchId();
		return repository.findByMatchId(id);
	}

	@RequestMapping(value = "hello")
	public String getString() {
		return ("Hello");
	}
	
	@RequestMapping(value="/match/{id}")
	@ResponseBody
	public List<MatchResult> getMatch(@PathVariable("id") int id){
		return repository.findByMatchId(id);
	}
	
	@RequestMapping(value = "/lastId")
	public int getId(){
		return repository.getMatchId();
	}
	

}
