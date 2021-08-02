package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Trigger1")
public class Trigger1 {

	private String type;
	@Id
	private String triggerid;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="subsegment")
	private SubSegment subsegment;
	
	@ManyToOne
	@JoinColumn(name="action_id")
	private Action action;

	public Trigger1() {}
	public Trigger1(String type, String triggerid, String name) {
		super();
		this.type = type;
		this.triggerid = triggerid;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTriggerid() {
		return triggerid;
	}

	public void setTriggerid(String triggerid) {
		this.triggerid = triggerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubSegment getSubsegment() {
		return subsegment;
	}

	public void setSubsegment(SubSegment subsegment) {
		this.subsegment = subsegment;
	}
}
