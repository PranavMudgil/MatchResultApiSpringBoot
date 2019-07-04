package com.cricketmatch.result.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketmatch.result.Model.MatchResult;
import com.cricketmatch.result.repository.MatchRepository;

@RestController
@RequestMapping(value = "/api")
public class MatchResource {

	@Autowired
	MatchRepository repository;

	@RequestMapping(value = "/match")
	public List<MatchResult> getResult() {
		System.out.println("match api hittt");
		List<MatchResult> balls = repository.findFirstByOrderByIdDesc();
		return balls;
	}

	@RequestMapping(value = "/all")
	public List<MatchResult> getAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "hello")
	public String getString() {
		return ("Hello");
	}
//	@RequestMapping(value="/last")
//	public MatchResult getLastEntry() {
//		MatchResult result = repository.getLastEntry();
//		return result;
//	}

}
