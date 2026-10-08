package com.boxing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Column;

@Entity
@Table(name = "Players")
public class Player implements Comparable<Player>
{

  @Id
  @Column(name = "PLAYERID")
  private Integer playerId;
  
  @Column(name = "JERSEYNUMBER")
  private Integer jersey_number;
	
  @Column(name = "FullName")
  private String full_name;

  @Column(name = "FirstName")
  private String firstname;

  @Column(name = "Surname")
  private String surname;
  
  @Column(name = "TICKERNAME")
  private String ticker_name;

  @Column(name = "ROLE")
  private String role;
  
  @Column(name = "TEAMID")
  private Integer teamId;
  
  @Column(name = "Age")
  private String age;
  
  @Column(name = "Height")
  private String height;
  
  @Column(name = "Weight")
  private String weight;
  
  @Column(name = "Category")
  private String category;
  
  @Column(name = "Nationality")
  private String nationality;
  
  @Column(name = "PhotoName")
  private String photoName;
 
  @Transient
  private Integer playerPosition;

  @Transient
  private String captainGoalKeeper;

  @Transient
  private String player_type;

  public Player() {
	 super();
  }

  public Player(Integer playerId, Integer playerPosition, String player_type) {
	super();
	this.playerId = playerId;
	this.playerPosition = playerPosition;
	this.player_type = player_type;
  }

public String getCaptainGoalKeeper() {
	return captainGoalKeeper;
}

public void setCaptainGoalKeeper(String captainGoalKeeper) {
	this.captainGoalKeeper = captainGoalKeeper;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getTicker_name() {
	return ticker_name;
}

public void setTicker_name(String ticker_name) {
	this.ticker_name = ticker_name;
}

public Integer getPlayerId() {
	return playerId;
}

public void setPlayerId(Integer playerId) {
	this.playerId = playerId;
}

public Integer getJersey_number() {
	return jersey_number;
}

public void setJersey_number(Integer jersey_number) {
	this.jersey_number = jersey_number;
}

public String getFull_name() {
	return full_name;
}

public void setFull_name(String full_name) {
	this.full_name = full_name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public Integer getTeamId() {
	return teamId;
}

public void setTeamId(Integer teamId) {
	this.teamId = teamId;
}

public Integer getPlayerPosition() {
	return playerPosition;
}

public void setPlayerPosition(Integer playerPosition) {
	this.playerPosition = playerPosition;
}

public String getPlayer_type() {
	return player_type;
}

public void setPlayer_type(String player_type) {
	this.player_type = player_type;
}
public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getHeight() {
	return height;
}

public void setHeight(String height) {
	this.height = height;
}

public String getWeight() {
	return weight;
}

public void setWeight(String weight) {
	this.weight = weight;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public String getPhotoName() {
	return photoName;
}

public void setPhotoName(String photoName) {
	this.photoName = photoName;
}

@Override
public String toString() {
	return "Player [playerId=" + playerId + ", jersey_number=" + jersey_number + ", full_name=" + full_name
			+ ", firstname=" + firstname + ", surname=" + surname + ", ticker_name=" + ticker_name + ", role=" + role
			+ ", teamId=" + teamId + ", age=" + age + ", height=" + height + ", weight=" + weight + ", category="
			+ category + ", nationality=" + nationality + ", photoName=" + photoName + ", playerPosition="
			+ playerPosition + ", captainGoalKeeper=" + captainGoalKeeper + ", player_type=" + player_type + "]";
}

@Override
public int compareTo(Player pm) {
	return (int) (this.getPlayerPosition()-pm.getPlayerPosition());
}


}