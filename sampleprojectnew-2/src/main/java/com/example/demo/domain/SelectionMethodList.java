package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SelectionMethodList")
public class SelectionMethodList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToOne
	@JoinColumn(name="methods",referencedColumnName="id")
	private Methods methods;
	@OneToOne
	private Campaign campaign;
	public SelectionMethodList() {}
	public SelectionMethodList(Methods methods) {
		super();
		this.methods = methods;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Methods getMethods() {
		return methods;
	}
	public void setMethods(Methods methods) {
		this.methods = methods;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
