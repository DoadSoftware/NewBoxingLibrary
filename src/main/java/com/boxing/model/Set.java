package com.boxing.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Sets")
@XmlAccessorType(XmlAccessType.FIELD)
public class Set {
	
	@XmlElement(name="setNumber")
	private int set_number;

	@XmlElement(name="setStatus")
	private String set_status;
	
	@XmlElement(name="setWinner")
	private String set_winner;
	
	@XmlElement(name = "homeScore")
	  private int homeScore;

	@XmlElement(name = "awayScore")
	private int awayScore;
	
	@XmlElement(name = "homeFoul")
	  private int homeFoul;

	@XmlElement(name = "awayFoul")
	private int awayFoul;


	public Set(int set_number, String set_status) {
		super();
		this.set_number = set_number;
		this.set_status = set_status;
	}

	public Set() {
		super();
	}

	public String getSet_status() {
		return set_status;
	}

	public void setSet_status(String set_status) {
		this.set_status = set_status;
	}

	public int getSet_number() {
		return set_number;
	}

	public void setSet_number(int set_number) {
		this.set_number = set_number;
	}

	public String getSet_winner() {
		return set_winner;
	}

	public void setSet_winner(String set_winner) {
		this.set_winner = set_winner;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	public int getHomeFoul() {
		return homeFoul;
	}

	public void setHomeFoul(int homeFoul) {
		this.homeFoul = homeFoul;
	}

	public int getAwayFoul() {
		return awayFoul;
	}

	public void setAwayFoul(int awayFoul) {
		this.awayFoul = awayFoul;
	}

	@Override
	public String toString() {
		return "Set [set_number=" + set_number + ", set_status=" + set_status + ", set_winner=" + set_winner
				+ ", homeScore=" + homeScore + ", awayScore=" + awayScore + ", homeFoul=" + homeFoul + ", awayFoul="
				+ awayFoul + "]";
	}

}
