package com.cricketmatch.result.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "series_score", schema = "sys")
public class SeriesScore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "series_id")
	private int id;
	private String team1_name;
	private int team1_score;
	private String team2_name;
	private int team2_score;

	public SeriesScore() {

	}

	public int getSeries_id() {
		return id;
	}

	public void setSeries_id(int series_id) {
		this.id = series_id;
	}

	public String getTeam1_name() {
		return team1_name;
	}

	public void setTeam1_name(String team1_name) {
		this.team1_name = team1_name;
	}

	public int getTeam1_score() {
		return team1_score;
	}

	public void setTeam1_score(int team1_score) {
		this.team1_score = team1_score;
	}

	public String getTeam2_name() {
		return team2_name;
	}

	public void setTeam2_name(String team2_name) {
		this.team2_name = team2_name;
	}

	public int getTeam2_score() {
		return team2_score;
	}

	public void setTeam2_score(int team2_score) {
		this.team2_score = team2_score;
	}

	@Override
	public String toString() {
		String str = "Series{id:" + this.getSeries_id() + ","
		+ "team1:"+getTeam1_name()+","
		+ "team1_score:"+getTeam1_score()+","
		+ "team2:"+getTeam2_name()+","
		+ "team2_score:"+getTeam2_score()
		+ "}";
		return str;
	}

}
