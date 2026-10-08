package com.boxing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "MatchTypes")
public class MatchType {

  @Id
  @Column(name = "MatchTypeID")
  private int matchTypeId;
	
  @Column(name = "MatchTypeName")
  private String matchTypeName;

public int getMatchTypeId() {
	return matchTypeId;
}

public void setMatchTypeId(int matchTypeId) {
	this.matchTypeId = matchTypeId;
}

public String getMatchTypeName() {
	return matchTypeName;
}

public void setMatchTypeName(String matchTypeName) {
	this.matchTypeName = matchTypeName;
}

@Override
public String toString() {
	return "MatchType [matchTypeId=" + matchTypeId + ", matchTypeName=" + matchTypeName + "]";
}

}