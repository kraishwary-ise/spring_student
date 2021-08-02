package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AppendField")
public class AppendField {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String value;
	private List<String> appendTos=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="campaign_id")
	private Campaign campaign;
	
	public AppendField() {}

	public AppendField(String name, String value, List<String> appendTos) {
		super();
		this.name = name;
		this.value = value;
		this.appendTos = appendTos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<String> getAppendTos() {
		return appendTos;
	}

	public void setAppendTos(List<String> appendTos) {
		this.appendTos = appendTos;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
