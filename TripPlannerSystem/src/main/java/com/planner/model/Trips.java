package com.planner.model;


import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Trips")
@Component
public class Trips {

	@Id   //Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.AUTO)  
	private Integer tripId;
	private String from;
	private String to;
	private String via;	
	private String modeofTravel;//dropdown
	private String type;//oneway,roundtrip - checkbox
	@Lob
	private byte[] ticket;
	private Integer noofPeople;
	private String sponsored;//radio button
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date dateOftravel;
	
	


	public Trips() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Trips(Integer tripId, String from, String to, String via, String modeofTravel,
			String type, Integer noofPeople, String sponsored, Date dateOftravel) {
		super();
		this.tripId = tripId;
		this.from = from;
		this.to = to;
		this.via = via;
		this.modeofTravel = modeofTravel;
		this.type = type;
		this.noofPeople = noofPeople;
		this.sponsored = sponsored;
		this.dateOftravel = dateOftravel;
	}



	public Trips(Integer tripId, String from, String to, String via, String modeofTravel,
			String type, byte[] ticket, Integer noofPeople, String sponsored, Date dateOftravel) {
		super();
		this.tripId = tripId;
		this.from = from;
		this.to = to;
		this.via = via;
		this.modeofTravel = modeofTravel;
		this.type = type;
		this.ticket = ticket;
		this.noofPeople = noofPeople;
		this.sponsored = sponsored;
		this.dateOftravel = dateOftravel;
	}



	public Integer getTripId() {
		return tripId;
	}



	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public String getVia() {
		return via;
	}



	public void setVia(String via) {
		this.via = via;
	}



	public String getModeofTravel() {
		return modeofTravel;
	}



	public void setModeofTravel(String modeofTravel) {
		this.modeofTravel = modeofTravel;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public byte[] getTicket() {
		return ticket;
	}



	public void setTicket(byte[] ticket) {
		this.ticket = ticket;
	}



	public Integer getNoofPeople() {
		return noofPeople;
	}



	public void setNoofPeople(Integer noofPeople) {
		this.noofPeople = noofPeople;
	}



	public String getSponsored() {
		return sponsored;
	}



	public void setSponsored(String sponsored) {
		this.sponsored = sponsored;
	}



	public Date getDateOftravel() {
		return dateOftravel;
	}



	public void setDateOftravel(Date dateOftravel) {
		this.dateOftravel = dateOftravel;
	}



	@Override
	public String toString() {
		return "Trips [tripId=" + tripId + ", from=" + from + ", to=" + to + ", via=" + via + ", modeofTravel="
				+ modeofTravel + ", type=" + type + ", ticket=" + Arrays.toString(ticket) + ", noofPeople=" + noofPeople
				+ ", sponsored=" + sponsored + ", dateOftravel=" + dateOftravel + "]";
	}



	

	


	


	
	
	
}
