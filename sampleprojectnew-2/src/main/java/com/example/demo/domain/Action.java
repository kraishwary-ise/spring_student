package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Action")
public class Action {
	
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
	private String category;
	private String subCategory;
	private String permissionCategory;
	private String userFriendlyExpression;
	private List<String> criteria=new ArrayList<>();
	@OneToMany
	@JoinColumn(name="trig",referencedColumnName="triggerid")
	private List<Trigger1> triggers=new ArrayList<>();
	@OneToMany
	@JoinColumn(name="seg",referencedColumnName="id")
	private List<Segment1> segments=new ArrayList<>();
	private String actionSchedule;
	@OneToOne
	private OfferTiming offerTiming;
	private List<String> channels=new ArrayList<>();
	private String quotas;
	private String boostedControl;
	private List<String> appendFields=new ArrayList<>();
	private List<String> subAction=new ArrayList<>();
	private String qualifyingEffortExpression;
	private String priorityId;
	@ManyToOne
	private Campaign campaign;
	public Action() {}
	public Action(boolean updatable, boolean deletable, boolean archivable, boolean versionable, boolean copyable,
			boolean publishable, boolean renamable, boolean availabileInLibrary, String id, String name,
			String description, String category, String subCategory, String permissionCategory,
			String userFriendlyExpression, List<String> criteria, List<Trigger1> triggers, List<Segment1> segements,
			String actionSchedule, OfferTiming offerTiming, List<String> channels, String quotas, String boostedControl,
			List<String> appendFields, List<String> subAction, String qualifyingEffortExpression, String priorityId) {
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
		this.category = category;
		this.subCategory = subCategory;
		this.permissionCategory = permissionCategory;
		this.userFriendlyExpression = userFriendlyExpression;
		this.criteria = criteria;
		this.triggers = triggers;
		this.segments = segements;
		this.actionSchedule = actionSchedule;
		this.offerTiming = offerTiming;
		this.channels = channels;
		this.quotas = quotas;
		this.boostedControl = boostedControl;
		this.appendFields = appendFields;
		this.subAction = subAction;
		this.qualifyingEffortExpression = qualifyingEffortExpression;
		this.priorityId = priorityId;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getPermissionCategory() {
		return permissionCategory;
	}
	public void setPermissionCategory(String permissionCategory) {
		this.permissionCategory = permissionCategory;
	}
	public String getUserFriendlyExpression() {
		return userFriendlyExpression;
	}
	public void setUserFriendlyExpression(String userFriendlyExpression) {
		this.userFriendlyExpression = userFriendlyExpression;
	}
	public List<String> getCriteria() {
		return criteria;
	}
	public void setCriteria(List<String> criteria) {
		this.criteria = criteria;
	}
	public List<Trigger1> getTriggers() {
		return triggers;
	}
	public void setTriggers(List<Trigger1> triggers) {
		this.triggers = triggers;
	}
	public List<Segment1> getSegments() {
		return segments;
	}
	public void setSgements(List<Segment1> segements) {
		this.segments = segements;
	}
	public String getActionSchedule() {
		return actionSchedule;
	}
	public void setActionSchedule(String actionSchedule) {
		this.actionSchedule = actionSchedule;
	}
	public OfferTiming getOfferTiming() {
		return offerTiming;
	}
	public void setOfferTiming(OfferTiming offerTiming) {
		this.offerTiming = offerTiming;
	}
	public List<String> getChannels() {
		return channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}
	public String getQuotas() {
		return quotas;
	}
	public void setQuotas(String quotas) {
		this.quotas = quotas;
	}
	public String getBoostedControl() {
		return boostedControl;
	}
	public void setBoostedControl(String boostedControl) {
		this.boostedControl = boostedControl;
	}
	public List<String> getAppendFields() {
		return appendFields;
	}
	public void setAppendFields(List<String> appendFields) {
		this.appendFields = appendFields;
	}
	public List<String> getSubAction() {
		return subAction;
	}
	public void setSubAction(List<String> subAction) {
		this.subAction = subAction;
	}
	public String getQualifyingEffortExpression() {
		return qualifyingEffortExpression;
	}
	public void setQualifyingEffortExpression(String qualifyingEffortExpression) {
		this.qualifyingEffortExpression = qualifyingEffortExpression;
	}
	public String getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
