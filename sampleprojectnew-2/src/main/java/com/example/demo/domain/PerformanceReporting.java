package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PerformanceReporting")
public class PerformanceReporting {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String baselinePeriod;
	private String reportingPeriod;
	
	@OneToOne
	private Campaign campaign;

	public PerformanceReporting() {}
	
	public PerformanceReporting(String baselinePeriod, String reportingPeriod) {
		super();
		this.baselinePeriod = baselinePeriod;
		this.reportingPeriod = reportingPeriod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBaselinePeriod() {
		return baselinePeriod;
	}

	public void setBaselinePeriod(String baselinePeriod) {
		this.baselinePeriod = baselinePeriod;
	}

	public String getReportingPeriod() {
		return reportingPeriod;
	}

	public void setReportingPeriod(String reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
