package com.boxing.model;

public class Clock {

	private String matchHalves;
	private String matchTimeStatus;
	private long matchTotalMilliSeconds;
  
public Clock(long matchTotalMilliSeconds) {
	super();
	this.matchTotalMilliSeconds = matchTotalMilliSeconds;
}
public Clock() {
	super();
}
public String getMatchHalves() {	
	return matchHalves;
}
public void setMatchHalves(String matchHalves) {
	this.matchHalves = matchHalves;
}
public String getMatchTimeStatus() {
	return matchTimeStatus;
}
public void setMatchTimeStatus(String matchTimeStatus) {
	this.matchTimeStatus = matchTimeStatus;
}
public long getMatchTotalMilliSeconds() {
	return matchTotalMilliSeconds;
}
public void setMatchTotalMilliSeconds(long matchTotalMilliSeconds) {
	this.matchTotalMilliSeconds = matchTotalMilliSeconds;
}


}