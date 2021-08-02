package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Segment1")
public class Segment1 {
	private String name;
	@Id
	private int segmentId;
	@ManyToOne
	private Action action;
	public Segment1() {}
	public Segment1(String name, int segmentId) {
		super();
		this.name = name;
		this.segmentId = segmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(int segmentId) {
		this.segmentId = segmentId;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}

}
