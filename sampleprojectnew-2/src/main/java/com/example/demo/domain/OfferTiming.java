package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OfferTiming")
public class OfferTiming {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToOne
	private OfferPeriod offerPeriod;
	@OneToOne
	private OptInPeriod optInPeriod;
	@OneToOne
	private OptInPeriod reminderPeriod;
	@OneToOne
	private DaysBeforeNextContactPossible daysBeforeNextContactPossible;
	@OneToOne
	private DaysBeforeNextContactPossible daysBeforeOfferCanBeRepeated;
	@OneToOne
	private DaysBeforeNextContactPossible persistencyPeriod;
	@OneToOne
	private Action action;
	public OfferTiming() {}
	public OfferTiming(OfferPeriod offerPeriod, OptInPeriod optInPeriod, OptInPeriod reminderPeriod,
			DaysBeforeNextContactPossible daysBeforeNextContactPossible,
			DaysBeforeNextContactPossible daysBeforeOfferCanBeRepeated,
			DaysBeforeNextContactPossible persistencyPeriod) {
		super();
		this.offerPeriod = offerPeriod;
		this.optInPeriod = optInPeriod;
		this.reminderPeriod = reminderPeriod;
		this.daysBeforeNextContactPossible = daysBeforeNextContactPossible;
		this.daysBeforeOfferCanBeRepeated = daysBeforeOfferCanBeRepeated;
		this.persistencyPeriod = persistencyPeriod;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OfferPeriod getOfferPeriod() {
		return offerPeriod;
	}
	public void setOfferPeriod(OfferPeriod offerPeriod) {
		this.offerPeriod = offerPeriod;
	}
	public OptInPeriod getOptInPeriod() {
		return optInPeriod;
	}
	public void setOptInPeriod(OptInPeriod optInPeriod) {
		this.optInPeriod = optInPeriod;
	}
	public OptInPeriod getReminderPeriod() {
		return reminderPeriod;
	}
	public void setReminderPeriod(OptInPeriod reminderPeriod) {
		this.reminderPeriod = reminderPeriod;
	}
	public DaysBeforeNextContactPossible getDaysBeforeNextContactPossible() {
		return daysBeforeNextContactPossible;
	}
	public void setDaysBeforeNextContactPossible(DaysBeforeNextContactPossible daysBeforeNextContactPossible) {
		this.daysBeforeNextContactPossible = daysBeforeNextContactPossible;
	}
	public DaysBeforeNextContactPossible getDaysBeforeOfferCanBeRepeated() {
		return daysBeforeOfferCanBeRepeated;
	}
	public void setDaysBeforeOfferCanBeRepeated(DaysBeforeNextContactPossible daysBeforeOfferCanBeRepeated) {
		this.daysBeforeOfferCanBeRepeated = daysBeforeOfferCanBeRepeated;
	}
	public DaysBeforeNextContactPossible getPersistencyPeriod() {
		return persistencyPeriod;
	}
	public void setPersistencyPeriod(DaysBeforeNextContactPossible persistencyPeriod) {
		this.persistencyPeriod = persistencyPeriod;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
}
