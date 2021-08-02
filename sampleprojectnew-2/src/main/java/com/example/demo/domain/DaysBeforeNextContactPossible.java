package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DaysBeforeNextContactPossible")
public class DaysBeforeNextContactPossible {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String midnight;
	private String value;
	private String unit;
	
	@OneToOne
	private OfferTiming offerTiming;
	
	public DaysBeforeNextContactPossible() {}

	public DaysBeforeNextContactPossible(String midnight, String value, String unit) {
		super();
		this.midnight = midnight;
		this.value = value;
		this.unit = unit;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public OfferTiming getOfferTiming() {
		return offerTiming;
	}

	public void setOfferTiming(OfferTiming offerTiming) {
		this.offerTiming = offerTiming;
	}

}
