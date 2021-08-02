package com.example.demo.domain;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Campaign")
public class Campaign {

	private boolean updatable;
	private boolean deletable;
	private boolean archivable;
	private boolean versionable;
	private boolean copyable;
	private boolean publishable;
	private boolean renamable;
	private boolean availabileInLibrary;
	@Id
	private String id;
	private String name;
	private String description;
	@OneToMany
	@JoinColumn(name="ap_fields",referencedColumnName="id")
	private List<AppendField> apeendFields=new ArrayList<>();
	private Date startDate;
	private Date endDate;
	private double version;
	private String state;
	private String status;
	@OneToOne
	private PerformanceReporting performanceReporting;
	private String environment;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="triggers",referencedColumnName="triggerId")
	private List<Trigger> triggers=new ArrayList<>();
	@OneToMany
	@JoinColumn(name="segments",referencedColumnName="id")
	private List<Segment> segments=new ArrayList<>();
	@OneToMany
	@JoinColumn(name="actions",referencedColumnName="id")
	private List<Action> actions=new ArrayList<>();
	@OneToOne
	private SelectionMethodList selectionMethodList;
	private List<String> executionWorkFlowList=new ArrayList<>();
	private String label;
	private int restoreVersion;
	private String category;
	private ZonedDateTime createdDateAndTime;
	private ZonedDateTime updatedDateAndTime;
	private String createdBy;
	private String modifiedBy;
	private String usecaseVersion;
	private int micro;
	private String dateChanged;
	private int usecaseId;
	public Campaign() {}
	public Campaign(boolean updatable, boolean deletable, boolean archivable, boolean versionable, boolean copyable,
			boolean publishable, boolean renamable, boolean availabileInLibrary, String id, String name,
			String description, List<AppendField> apeendFields, Date startDate, Date endDate, double version,
			String state, String status, PerformanceReporting performanceReporting, String environment,
			List<Trigger> triggers, List<Segment> segments, List<Action> actions,
			SelectionMethodList selectionMethodList, List<String> executionWorkFlowList, String label,
			int restoreVersion, String category, ZonedDateTime createdDateAndTime, ZonedDateTime updatedDateAndTime,
			String createdBy, String modifiedBy, String usecaseVersion, int micro, String dateChanged, int usecaseId) {
		super();
		this.updatable = updatable;
		this.deletable = deletable;
		this.archivable = archivable;
		this.versionable = versionable;
		this.copyable = copyable;
		this.publishable = publishable;
		this.renamable = renamable;
		this.availabileInLibrary = availabileInLibrary;
		this.id = id;
		this.name = name;
		this.description = description;
		this.apeendFields = apeendFields;
		this.startDate = startDate;
		this.endDate = endDate;
		this.version = version;
		this.state = state;
		this.status = status;
		this.performanceReporting = performanceReporting;
		this.environment = environment;
		this.triggers = triggers;
		this.segments = segments;
		this.actions = actions;
		this.selectionMethodList = selectionMethodList;
		this.executionWorkFlowList = executionWorkFlowList;
		this.label = label;
		this.restoreVersion = restoreVersion;
		this.category = category;
		this.createdDateAndTime = createdDateAndTime;
		this.updatedDateAndTime = updatedDateAndTime;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.usecaseVersion = usecaseVersion;
		this.micro = micro;
		this.dateChanged = dateChanged;
		this.usecaseId = usecaseId;
	}
	public boolean isUpdatable() {
		return updatable;
	}
	public void setUpdatable(boolean updatable) {
		this.updatable = updatable;
	}
	public boolean isDeletable() {
		return deletable;
	}
	public void setDeletable(boolean deletable) {
		this.deletable = deletable;
	}
	public boolean isArchivable() {
		return archivable;
	}
	public void setArchivable(boolean archivable) {
		this.archivable = archivable;
	}
	public boolean isVersionable() {
		return versionable;
	}
	public void setVersionable(boolean versionable) {
		this.versionable = versionable;
	}
	public boolean isCopyable() {
		return copyable;
	}
	public void setCopyable(boolean copyable) {
		this.copyable = copyable;
	}
	public boolean isPublishable() {
		return publishable;
	}
	public void setPublishable(boolean publishable) {
		this.publishable = publishable;
	}
	public boolean isRenamable() {
		return renamable;
	}
	public void setRenamable(boolean renamable) {
		this.renamable = renamable;
	}
	public boolean isAvailabileInLibrary() {
		return availabileInLibrary;
	}
	public void setAvailabileInLibrary(boolean availabileInLibrary) {
		this.availabileInLibrary = availabileInLibrary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<AppendField> getApeendFields() {
		return apeendFields;
	}
	public void setApeendFields(List<AppendField> apeendFields) {
		this.apeendFields = apeendFields;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PerformanceReporting getPerformanceReporting() {
		return performanceReporting;
	}
	public void setPerformanceReporting(PerformanceReporting performanceReporting) {
		this.performanceReporting = performanceReporting;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public List<Trigger> getTriggers() {
		return triggers;
	}
	public void setTriggers(List<Trigger> triggers) {
		this.triggers = triggers;
	}
	public List<Segment> getSegments() {
		return segments;
	}
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	public List<Action> getActions() {
		return actions;
	}
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
	public SelectionMethodList getSelectionMethodList() {
		return selectionMethodList;
	}
	public void setSelectionMethodList(SelectionMethodList selectionMethodList) {
		this.selectionMethodList = selectionMethodList;
	}
	public List<String> getExecutionWorkFlowList() {
		return executionWorkFlowList;
	}
	public void setExecutionWorkFlowList(List<String> executionWorkFlowList) {
		this.executionWorkFlowList = executionWorkFlowList;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getRestoreVersion() {
		return restoreVersion;
	}
	public void setRestoreVersion(int restoreVersion) {
		this.restoreVersion = restoreVersion;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ZonedDateTime getCreatedDateAndTime() {
		return createdDateAndTime;
	}
	public void setCreatedDateAndTime(ZonedDateTime createdDateAndTime) {
		this.createdDateAndTime = createdDateAndTime;
	}
	public ZonedDateTime getUpdatedDateAndTime() {
		return updatedDateAndTime;
	}
	public void setUpdatedDateAndTime(ZonedDateTime updatedDateAndTime) {
		this.updatedDateAndTime = updatedDateAndTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getUsecaseVersion() {
		return usecaseVersion;
	}
	public void setUsecaseVersion(String usecaseVersion) {
		this.usecaseVersion = usecaseVersion;
	}
	public int getMicro() {
		return micro;
	}
	public void setMicro(int micro) {
		this.micro = micro;
	}
	public String getDateChanged() {
		return dateChanged;
	}
	public void setDateChanged(String dateChanged) {
		this.dateChanged = dateChanged;
	}
	public int getUsecaseId() {
		return usecaseId;
	}
	public void setUsecaseId(int usecaseId) {
		this.usecaseId = usecaseId;
	}
	
}
