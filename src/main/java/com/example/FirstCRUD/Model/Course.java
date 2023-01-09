package com.example.FirstCRUD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "table_course")
public class Course {
	@Id
	@Column
	private long id;
	@Column
	private String title;
	@Column
	private String descr;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String title, String descr) {
		super();
		this.id = id;
		this.title = title;
		this.descr = descr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getdescr() {
		return descr;
	}

	public void setdescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descr=" + descr + "]";
	}
	
	

}
