package com.boxing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import jakarta.persistence.Column;

@Entity
@Table(name = "Fixtures")
public class Fixture {

  @Id
  @Column(name = "MATCHNUMBER")
  private Integer matchnumber;
  
  @Column(name = "Bout")
  private String bout;
  
  @Column(name = "WeightCategory")
  private Integer weightCategory;

  @Column(name = "HomePlayer")
  private Integer homeplayerid;

  @Column(name = "AwayPlayer")
  private Integer awayplayerid;
  
  @Transient
  private Player home_Player;
  
  @Transient
  private Player away_Player;

public Fixture() {
	super();
}

public Integer getMatchnumber() {
	return matchnumber;
}

public void setMatchnumber(Integer matchnumber) {
	this.matchnumber = matchnumber;
}

public Integer getWeightCategory() {
	return weightCategory;
}

public void setWeightCategory(Integer weightCategory) {
	this.weightCategory = weightCategory;
}

public Integer getHomeplayerid() {
	return homeplayerid;
}

public void setHomeplayerid(Integer homeplayerid) {
	this.homeplayerid = homeplayerid;
}

public Integer getAwayplayerid() {
	return awayplayerid;
}

public void setAwayplayerid(Integer awayplayerid) {
	this.awayplayerid = awayplayerid;
}

public String getBout() {
	return bout;
}

public void setBout(String bout) {
	this.bout = bout;
}

public Player getHome_Player() {
	return home_Player;
}

public void setHome_Player(Player home_Player) {
	this.home_Player = home_Player;
}

public Player getAway_Player() {
	return away_Player;
}

public void setAway_Player(Player away_Player) {
	this.away_Player = away_Player;
}

}