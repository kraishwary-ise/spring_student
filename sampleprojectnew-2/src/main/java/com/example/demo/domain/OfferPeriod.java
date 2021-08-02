package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OfferPeriod")
public class OfferPeriod {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String midnight;
	private int value;
	private String unit;
	private String time;
	
	@OneToOne
	private OfferTiming offerTiming;

	public OfferPeriod() {}
	public OfferPeriod(String midnight, int value, String unit, String time) {
		super();
		this.midnight = midnight;
		this.value = value;
		this.unit = unit;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMidnight() {
		return midnight;
	}

	public void setMidnight(String midnight) {
		this.midnight = midnight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public OfferTiming getOfferTiming() {
		return offerTiming;
	}

	public void setOfferTiming(OfferTiming offerTiming) {
		this.offerTiming = offerTiming;
	}
}
