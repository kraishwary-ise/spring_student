package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	@Id
	private Integer t_id;
	private String t_name;
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id")
	private Student student;
	public Teacher() {}
	public Teacher(Integer t_id, String t_name) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getT_id() {
		return t_id;
	}
	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
}
