package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SubSegement")
public class SubSegment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@OneToMany
	@JoinColumn(name="trigger")
	private List<Trigger1> triggers=new ArrayList<>();
	@OneToMany
	@JoinColumn(name="criteria")
	private List<Criteria> criterias=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="segment")
	private Segment segments;
	
	@ManyToOne
	@JoinColumn(name="criteria",referencedColumnName="sortableId")
	private Criteria criteria;

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public SubSegment() {}
	
	public SubSegment(List<Trigger1> triggers, List<Criteria> criterias) {
		super();
		this.triggers = triggers;
		this.criterias = criterias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Trigger1> getTriggers() {
		return triggers;
	}

	public void setTriggers(List<Trigger1> triggers) {
		this.triggers = triggers;
	}

	public List<Criteria> getCriterias() {
		return criterias;
	}

	public void setCriterias(List<Criteria> criterias) {
		this.criterias = criterias;
	}

	public Segment getSegments() {
		return segments;
	}

	public void setSegments(Segment segments) {
		this.segments = segments;
	}

}
