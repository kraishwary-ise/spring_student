package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Segment")
public class Segment {
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
	private String status;
	@OneToMany
	@JoinColumn(name="subseg",referencedColumnName="id")
	private List<SubSegment> subsegments=new ArrayList<>();
	
	private String sortableId;
	private List<String> appendFields=new ArrayList<>();
	private String priorityId;
	
	@ManyToOne
	private Campaign campaign;
	
	public Segment() {}

	public Segment(boolean updatable, boolean deletable, boolean archivable, boolean versionable, boolean copyable,
			boolean publishable, boolean renamable, boolean availabileInLibrary, String id, String name,
			String description, String status, List<SubSegment> subsegments, String sortableId,
			List<String> appendFields, String priorityId) {
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
		this.status = status;
		this.subsegments = subsegments;
		this.sortableId = sortableId;
		this.appendFields = appendFields;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public List<SubSegment> getSubsegments() {
		return subsegments;
	}

	public void setSubsegments(List<SubSegment> subsegments) {
		this.subsegments = subsegments;
	}


	

	public String getSortableId() {
		return sortableId;
	}

	public void setSortableId(String sortableId) {
		this.sortableId = sortableId;
	}

	public List<String> getAppendFields() {
		return appendFields;
	}

	public void setAppendFields(List<String> appendFields) {
		this.appendFields = appendFields;
	}

	public String getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}
	

}
