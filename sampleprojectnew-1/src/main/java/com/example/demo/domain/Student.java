package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private Integer id;
	private String name;
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="id",referencedColumnName="id")
	private List<Subject> subjects=new ArrayList<>();
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="id",referencedColumnName="id")
	private List<Teacher> teachers=new ArrayList<>();
	@OneToOne(cascade= {CascadeType.ALL})
	private Marks marks;
	public Student(Integer id, String name, List<Subject> subjects, List<Teacher> teachers, Marks marks) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.teachers = teachers;
		this.marks = marks;
	}

	public Student() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
}
