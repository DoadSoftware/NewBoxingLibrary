package com.boxing.model;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="Match")
@XmlAccessorType(XmlAccessType.FIELD)
public class Match {

  @XmlElement(name = "matchFileTimeStamp")
  private String matchFileTimeStamp;

  @XmlElement(name = "matchResult")
  private String matchResult;
  
  @XmlElement(name = "matchStatus")
  private String matchStatus;
  
  @XmlElement(name = "matchFileName")
  private String matchFileName;

  @XmlElement(name = "tournament")
  private String tournament;

  @XmlElement(name = "matchIdent")
  private String matchIdent;
  
  @XmlElement(name = "venue")
  private String venue;
  
  @XmlElement(name = "categoryType")
  private String categoryType;
  
  @XmlElement(name = "boxingType")
  private String boxingType;
  
  @XmlElement(name = "matchType")
  private String matchType;
  
  @XmlElement(name = "homeFirstPlayerId")
  private int homeFirstPlayerId;

  @XmlElement(name = "awayFirstPlayerId")
  private int awayFirstPlayerId;

  @XmlElement(name = "homeTeamSetScore")
  private int homeTeamSetScore;

  @XmlElement(name = "awayTeamSetScore")
  private int awayTeamSetScore;
  
  @XmlElement(name = "homeTeamJerseyColor")
  private String homeTeamJerseyColor;

  @XmlElement(name = "awayTeamJerseyColor")
  private String awayTeamJerseyColor;

  @XmlElementWrapper(name = "sets")
  @XmlElement(name = "set")
  private List<Set> sets;
  
  @XmlTransient
  private Player homeFirstPlayer;

  @XmlTransient
  private Player awayFirstPlayer;

  @XmlTransient
  private Clock clock;
  
  @XmlTransient
  private List<Event> events;

public String getMatchFileTimeStamp() {
	return matchFileTimeStamp;
}

public void setMatchFileTimeStamp(String matchFileTimeStamp) {
	this.matchFileTimeStamp = matchFileTimeStamp;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

public String getMatchStatus() {
	return matchStatus;
}

public void setMatchStatus(String matchStatus) {
	this.matchStatus = matchStatus;
}

public String getMatchFileName() {
	return matchFileName;
}

public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
}

public String getTournament() {
	return tournament;
}

public void setTournament(String tournament) {
	this.tournament = tournament;
}

public String getMatchIdent() {
	return matchIdent;
}

public void setMatchIdent(String matchIdent) {
	this.matchIdent = matchIdent;
}

public String getMatchType() {
	return matchType;
}

public void setMatchType(String matchType) {
	this.matchType = matchType;
}

public int getHomeFirstPlayerId() {
	return homeFirstPlayerId;
}

public void setHomeFirstPlayerId(int homeFirstPlayerId) {
	this.homeFirstPlayerId = homeFirstPlayerId;
}

public int getAwayFirstPlayerId() {
	return awayFirstPlayerId;
}

public void setAwayFirstPlayerId(int awayFirstPlayerId) {
	this.awayFirstPlayerId = awayFirstPlayerId;
}

public List<Set> getSets() {
	return sets;
}

public void setSets(List<Set> sets) {
	this.sets = sets;
}

public Player getHomeFirstPlayer() {
	return homeFirstPlayer;
}

public void setHomeFirstPlayer(Player homeFirstPlayer) {
	this.homeFirstPlayer = homeFirstPlayer;
}

public Player getAwayFirstPlayer() {
	return awayFirstPlayer;
}

public void setAwayFirstPlayer(Player awayFirstPlayer) {
	this.awayFirstPlayer = awayFirstPlayer;
}

public List<Event> getEvents() {
	return events;
}

public void setEvents(List<Event> events) {
	this.events = events;
}

public Clock getClock() {
	return clock;
}

public void setClock(Clock clock) {
	this.clock = clock;
}

public String getCategoryType() {
	return categoryType;
}

public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}

public int getHomeTeamSetScore() {
	return homeTeamSetScore;
}

public void setHomeTeamSetScore(int homeTeamSetScore) {
	this.homeTeamSetScore = homeTeamSetScore;
}

public int getAwayTeamSetScore() {
	return awayTeamSetScore;
}

public void setAwayTeamSetScore(int awayTeamSetScore) {
	this.awayTeamSetScore = awayTeamSetScore;
}

public String getBoxingType() {
	return boxingType;
}

public void setBoxingType(String boxingType) {
	this.boxingType = boxingType;
}

public String getHomeTeamJerseyColor() {
	return homeTeamJerseyColor;
}

public void setHomeTeamJerseyColor(String homeTeamJerseyColor) {
	this.homeTeamJerseyColor = homeTeamJerseyColor;
}

public String getAwayTeamJerseyColor() {
	return awayTeamJerseyColor;
}

public void setAwayTeamJerseyColor(String awayTeamJerseyColor) {
	this.awayTeamJerseyColor = awayTeamJerseyColor;
}

public String getVenue() {
	return venue;
}

public void setVenue(String venue) {
	this.venue = venue;
}

@Override
public String toString() {
	return "Match [matchFileTimeStamp=" + matchFileTimeStamp + ", matchResult=" + matchResult + ", matchStatus="
			+ matchStatus + ", matchFileName=" + matchFileName + ", tournament=" + tournament + ", matchIdent="
			+ matchIdent + ", venue=" + venue + ", categoryType=" + categoryType + ", boxingType=" + boxingType
			+ ", matchType=" + matchType + ", homeFirstPlayerId=" + homeFirstPlayerId + ", awayFirstPlayerId="
			+ awayFirstPlayerId + ", homeTeamSetScore=" + homeTeamSetScore + ", awayTeamSetScore=" + awayTeamSetScore
			+ ", homeTeamJerseyColor=" + homeTeamJerseyColor + ", awayTeamJerseyColor=" + awayTeamJerseyColor
			+ ", sets=" + sets + ", homeFirstPlayer=" + homeFirstPlayer + ", awayFirstPlayer=" + awayFirstPlayer
			+ ", clock=" + clock + ", events=" + events + "]";
}

}