package com.boxing.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Configurations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configurations {
	
	@XmlElement(name="broadcaster")
	private String broadcaster;

	@XmlElement(name="primaryIpAddress")
	private String primaryIpAddress;
	
	@XmlElement(name="primaryPortNumber")
	private int primaryPortNumber;
	
	@XmlElement(name="secondaryIpAddress")
	private String secondaryIpAddress;
	
	@XmlElement(name="secondaryPortNumber")
	private int secondaryPortNumber;
	
	public Configurations() {
		super();
	}

	public Configurations(String broadcaster, String primaryIpAddress, int primaryPortNumber, String secondaryIpAddress,
			int secondaryPortNumber) {
		super();
		this.broadcaster = broadcaster;
		this.primaryIpAddress = primaryIpAddress;
		this.primaryPortNumber = primaryPortNumber;
		this.secondaryIpAddress = secondaryIpAddress;
		this.secondaryPortNumber = secondaryPortNumber;
	}

	public String getBroadcaster() {
		return broadcaster;
	}

	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}

	public String getPrimaryIpAddress() {
		return primaryIpAddress;
	}

	public void setPrimaryIpAddress(String primaryIpAddress) {
		this.primaryIpAddress = primaryIpAddress;
	}

	public int getPrimaryPortNumber() {
		return primaryPortNumber;
	}

	public void setPrimaryPortNumber(int primaryPortNumber) {
		this.primaryPortNumber = primaryPortNumber;
	}

	public String getSecondaryIpAddress() {
		return secondaryIpAddress;
	}

	public void setSecondaryIpAddress(String secondaryIpAddress) {
		this.secondaryIpAddress = secondaryIpAddress;
	}

	public int getSecondaryPortNumber() {
		return secondaryPortNumber;
	}

	public void setSecondaryPortNumber(int secondaryPortNumber) {
		this.secondaryPortNumber = secondaryPortNumber;
	}
}
