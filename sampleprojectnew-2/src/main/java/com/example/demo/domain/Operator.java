package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Operator")
public class Operator {

	@Id
	private int sortableId;
	private String name;
	private String value;
	private String SelectedVal;
	private String expression;
	private String type;
	private String prirityId;
	@ManyToOne
	private Criteria criteria;
	public Operator() {}
	public Operator(int sortableId, String name, String value, String selectedVal, String expression, String type,
			String prirityId) {
		super();
		this.sortableId = sortableId;
		this.name = name;
		this.value = value;
		SelectedVal = selectedVal;
		this.expression = expression;
		this.type = type;
		this.prirityId = prirityId;
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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSelectedVal() {
		return SelectedVal;
	}
	public void setSelectedVal(String selectedVal) {
		SelectedVal = selectedVal;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrirityId() {
		return prirityId;
	}
	public void setPrirityId(String prirityId) {
		this.prirityId = prirityId;
	}
	public Criteria getCriteria() {
		return criteria;
	}
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
}
