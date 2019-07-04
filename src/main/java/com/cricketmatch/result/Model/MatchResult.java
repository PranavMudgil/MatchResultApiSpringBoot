package com.cricketmatch.result.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BallData", schema = "sys")
public class MatchResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ball_id")
	private Integer id;
	
	@Column(name = "match_status")
	private String matchStatus;
	
	@Column(name = "batting")
	private String batsman;
	
	@Column(name = "over_by")
	private String overBy;
	
	@Column(name = "run")
	private String run;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "total_over")
	private Float over;
	
	@Column(name = "team_score")
	private Integer teamScore;
	
	@Column(name = "first_innings")
	private Integer firstInnings;
	
	@Column(name = "second_innings")
	private Integer secondInnings;
	
	@Column(name = "personal_score")
	private Integer personalScore;
	
	@Column(name = "wickets_given")
	private Integer wicketsGiven;
	
	@Column(name = "wickets_prev")
	private Integer wicketsPrev;
	
	@Column(name = "prev_overs")
	private Integer prevOvers;
	
	@Column(name = "target")
	private Integer target;
	
	@Column(name = "winner")
	private String winner;
	
	@Column(name = "first_innings_by")
	private String firstInningsBy;
	
	@Column(name = "second_innings_by")
	private String secondInningsBy;
	
	@Column(name = "match_id")
	private Integer matchId;
	
	
	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public MatchResult() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setBallId(Integer ballId) {
		this.id = ballId;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getOverBy() {
		return overBy;
	}

	public void setOverBy(String overBy) {
		this.overBy = overBy;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public float getOver() {
		return over;
	}

	public void setOver(Float over) {
		this.over = over;
	}

	public Integer getTeamScore() {
		return teamScore;
	}

	public void setTeamScore(Integer teamScore) {
		this.teamScore = teamScore;
	}

	public Integer getFirstInnings() {
		return firstInnings;
	}

	public void setFirstInnings(Integer firstInnings) {
		this.firstInnings = firstInnings;
	}

	public Integer getSecondInnings() {
		return secondInnings;
	}

	public void setSecondInnings(Integer secondInnings) {
		this.secondInnings = secondInnings;
	}

	public Integer getPersonalScore() {
		return personalScore;
	}

	public void setPersonalScore(Integer personalScore) {
		this.personalScore = personalScore;
	}

	public Integer getWicketsGiven() {
		return wicketsGiven;
	}

	public void setWicketsGiven(Integer wicketsGiven) {
		this.wicketsGiven = wicketsGiven;
	}

	public Integer getWicketsPrev() {
		return wicketsPrev;
	}

	public void setWicketsPrev(Integer wicketsPrev) {
		this.wicketsPrev = wicketsPrev;
	}

	public Integer getPrevOvers() {
		return prevOvers;
	}

	public void setPrevOvers(Integer prevOvers) {
		this.prevOvers = prevOvers;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getFirstInningsBy() {
		return firstInningsBy;
	}

	public void setFirstInningsBy(String firstInningsBy) {
		this.firstInningsBy = firstInningsBy;
	}

	public String getSecondInningsBy() {
		return secondInningsBy;
	}

	public void setSecondInningsBy(String secondInningsBy) {
		this.secondInningsBy = secondInningsBy;
	}
	
	@Override
	public String toString() {
		String str = "Match{id:"+id+","
				+"Status:"+matchStatus+","
				+"FirstInnings:"+firstInnings+","
				+"SecondInnings:"+secondInnings+","
				+"Batting_Team:"+teamName+","
				+"Batting:"+batsman+","
				+"Bowling:"+overBy+","
				+"Run:"+run+","
				+"Current_Over:"+over+","
				+"Team Score:"+teamScore+","
				+"Personal Score:"+personalScore+","
				+"Wickets_given:"+wicketsGiven+","
				+"Wickets_prev:"+wicketsPrev+","
				+"Prev_over:"+prevOvers+","
				+"Target:"+target+","
				+"winner_team:"+winner+","
				+"firstInningsBy:"+firstInningsBy+","
				+"secondInningsBy:"+secondInningsBy+","
				+"match_id:"+ matchId+","
				+ "}";
		return str;
	}
	
}
