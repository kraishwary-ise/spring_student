package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Criteria")
public class Criteria {

	@Id
	private int sortableId;
	private String name;
	private String type;
	private String label;
	private String source;
	
	@OneToMany
	@JoinColumn(name="operator",referencedColumnName="sortableId")
	private List<Operator> operators=new ArrayList<>();
	private String priorityId;
	
	//@ManyToOne
	//@JoinTable()
	//private SubSegment subSegment;

	public Criteria() {}
	
	public Criteria(int sortableId, String name, String type, String label, String source, List<Operator> operators,
			String priorityId) {
		super();
		this.sortableId = sortableId;
		this.name = name;
		this.type = type;
		this.label = label;
		this.source = source;
		this.operators = operators;
		this.priorityId = priorityId;
	}

	public int getSortableId() {
		return sortableId;
	}

	public void setSortableId(int sortableId) {
		this.sortableId = sortableId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Operator> getOperators() {
		return operators;
	}

	public void setOperators(List<Operator> operators) {
		this.operators = operators;
	}

	public String getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}

//	public SubSegment getSubSegment() {
//		return subSegment;
//	}
//
//	public void setSubSegment(SubSegment subSegment) {
//		this.subSegment = subSegment;
//	}
}
