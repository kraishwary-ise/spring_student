package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Methods")
public class Methods {
	
	@Id
	private String id;
	private boolean random;
	@OneToOne
	@JoinColumn(name="firstoffer",referencedColumnName="id")
	private FirstEligibleOffer firstEligibleOffer;
	private String nboModel;
	private String nboModelWithBalanceCheck;
	private String randomSelectionMethod;
	private String highestPriorityOfferByParent;
	private String highestPriorityOfferMultiple;
	@OneToOne
	private SelectionMethodList selectionMethodList;
	
	public Methods() {}
	
	public Methods(String id, boolean random, FirstEligibleOffer firstEligibleOffer, String nboModel,
			String nboModelWithBalanceCheck, String randomSelectionMethod, String highestPriorityOfferByParent,
			String highestPriorityOfferMultiple) {
		super();
		this.id = id;
		this.random = random;
		this.firstEligibleOffer = firstEligibleOffer;
		this.nboModel = nboModel;
		this.nboModelWithBalanceCheck = nboModelWithBalanceCheck;
		this.randomSelectionMethod = randomSelectionMethod;
		this.highestPriorityOfferByParent = highestPriorityOfferByParent;
		this.highestPriorityOfferMultiple = highestPriorityOfferMultiple;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isRandom() {
		return random;
	}
	public void setRandom(boolean random) {
		this.random = random;
	}
	public FirstEligibleOffer getFirstEligibleOffer() {
		return firstEligibleOffer;
	}
	public void setFirstEligibleOffer(FirstEligibleOffer firstEligibleOffer) {
		this.firstEligibleOffer = firstEligibleOffer;
	}
	public String getNboModel() {
		return nboModel;
	}
	public void setNboModel(String nboModel) {
		this.nboModel = nboModel;
	}
	public String getNboModelWithBalanceCheck() {
		return nboModelWithBalanceCheck;
	}
	public void setNboModelWithBalanceCheck(String nboModelWithBalanceCheck) {
		this.nboModelWithBalanceCheck = nboModelWithBalanceCheck;
	}
	public String getRandomSelectionMethod() {
		return randomSelectionMethod;
	}
	public void setRandomSelectionMethod(String randomSelectionMethod) {
		this.randomSelectionMethod = randomSelectionMethod;
	}
	public String getHighestPriorityOfferByParent() {
		return highestPriorityOfferByParent;
	}
	public void setHighestPriorityOfferByParent(String highestPriorityOfferByParent) {
		this.highestPriorityOfferByParent = highestPriorityOfferByParent;
	}
	public String getHighestPriorityOfferMultiple() {
		return highestPriorityOfferMultiple;
	}
	public void setHighestPriorityOfferMultiple(String highestPriorityOfferMultiple) {
		this.highestPriorityOfferMultiple = highestPriorityOfferMultiple;
	}
	public SelectionMethodList getSelectionMethodList() {
		return selectionMethodList;
	}
	public void setSelectionMethodList(SelectionMethodList selectionMethodList) {
		this.selectionMethodList = selectionMethodList;
	}

}
