package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FirstEligibleOffer")
public class FirstEligibleOffer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int random;
	private List<String> criteria=new ArrayList<>();
	private List<String> persistency=new ArrayList<>();
	private boolean offerAccepted;
	private boolean persistencyFlag;
	private boolean sendToExecutionWorkFlow;
	private String appendUpdateOffer;
	
	@OneToOne
	private Methods methods;
	
	public FirstEligibleOffer() {}

	public FirstEligibleOffer(int random, List<String> criteria, List<String> persistency, boolean offerAccepted,
			boolean persistencyFlag, boolean sendToExecutionWorkFlow, String appendUpdateOffer) {
		super();
		this.random = random;
		this.criteria = criteria;
		this.persistency = persistency;
		this.offerAccepted = offerAccepted;
		this.persistencyFlag = persistencyFlag;
		this.sendToExecutionWorkFlow = sendToExecutionWorkFlow;
		this.appendUpdateOffer = appendUpdateOffer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public List<String> getCriteria() {
		return criteria;
	}

	public void setCriteria(List<String> criteria) {
		this.criteria = criteria;
	}

	public List<String> getPersistency() {
		return persistency;
	}

	public void setPersistency(List<String> persistency) {
		this.persistency = persistency;
	}

	public boolean isOfferAccepted() {
		return offerAccepted;
	}

	public void setOfferAccepted(boolean offerAccepted) {
		this.offerAccepted = offerAccepted;
	}

	public boolean isPersistencyFlag() {
		return persistencyFlag;
	}

	public void setPersistencyFlag(boolean persistencyFlag) {
		this.persistencyFlag = persistencyFlag;
	}

	public boolean isSendToExecutionWorkFlow() {
		return sendToExecutionWorkFlow;
	}

	public void setSendToExecutionWorkFlow(boolean sendToExecutionWorkFlow) {
		this.sendToExecutionWorkFlow = sendToExecutionWorkFlow;
	}

	public String getAppendUpdateOffer() {
		return appendUpdateOffer;
	}

	public void setAppendUpdateOffer(String appendUpdateOffer) {
		this.appendUpdateOffer = appendUpdateOffer;
	}

	public Methods getMethods() {
		return methods;
	}

	public void setMethods(Methods methods) {
		this.methods = methods;
	}
}
