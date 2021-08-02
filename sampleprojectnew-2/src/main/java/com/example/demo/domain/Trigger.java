package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Trigger")
public class Trigger {
	@Id
	private String triggerId;
	private String type;
	
	private String name;
	private String description;
	private String triggerVersion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="campaign",referencedColumnName="id")
	private Campaign campaign;
	
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public Trigger() {}
	public Trigger(String type, String triggerId, String name, String description, String triggerVersion) {
		super();
		this.type = type;
		this.triggerId = triggerId;
		this.name = name;
		this.description = description;
		this.triggerVersion = triggerVersion;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTriggerId() {
		return triggerId;
	}
	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTriggerVersion() {
		return triggerVersion;
	}
	public void setTriggerVersion(String triggerVersion) {
		this.triggerVersion = triggerVersion;
	}

}
