package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
	@Id
	@Column(nullable=false)
	private String id;
	private String sub_name;
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="set_id")
	private Student student;
	public Subject(String id, String sub_name) {
		super();
		this.id = id;
		this.sub_name = sub_name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Subject(){}
	
	
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
