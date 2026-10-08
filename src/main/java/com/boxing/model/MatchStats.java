package com.boxing.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="matchStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class MatchStats {

  @XmlElement(name = "statsId")
  private int statsId;

  @XmlElement(name = "teamId")
  private int teamId;
  
  @XmlElement(name = "playerId")
  private int playerId;
  
  @XmlElement(name = "matchHalves")
  private String matchHalves;
  
  @XmlElement(name = "statsType")
  private String stats_type;

  @XmlElement(name = "statsCount")
  private int statsCount;

  @XmlElement(name = "matchTotalMilliSeconds")
  private long matchTotalMilliSeconds;

  @XmlTransient
  private Player player;
  
  @XmlTransient
  private Team team;
  
public MatchStats() {
	super();
}

public MatchStats(int statsId, int teamId, int playerId, String matchHalves, String stats_type, int statsCount,
		long matchTotalMilliSeconds) {
	super();
	this.statsId = statsId;
	this.teamId = teamId;
	this.playerId = playerId;
	this.matchHalves = matchHalves;
	this.stats_type = stats_type;
	this.statsCount = statsCount;
	this.matchTotalMilliSeconds = matchTotalMilliSeconds;
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

public int getTeamId() {
	return teamId;
}

public void setTeamId(int teamId) {
	this.teamId = teamId;
}

public long getMatchTotalMilliSeconds() {
	return matchTotalMilliSeconds;
}

public void setMatchTotalMilliSeconds(long matchTotalMilliSeconds) {
	this.matchTotalMilliSeconds = matchTotalMilliSeconds;
}

public int getStatsId() {
	return statsId;
}

public void setStatsId(int statsId) {
	this.statsId = statsId;
}

public String getStats_type() {
	return stats_type;
}

public void setStats_type(String stats_type) {
	this.stats_type = stats_type;
}

public int getStatsCount() {
	return statsCount;
}

public void setStatsCount(int statsCount) {
	this.statsCount = statsCount;
}

public String getMatchHalves() {
	return matchHalves;
}

public void setMatchHalves(String matchHalves) {
	this.matchHalves = matchHalves;
}

public Team getTeam() {
	return team;
}

public void setTeam(Team team) {
	this.team = team;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

}