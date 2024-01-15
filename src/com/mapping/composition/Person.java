package com.mapping.composition;

public class Person extends Date {
	private Integer id;
	private String name;
	private Date bDate;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer id, String name, Date bDate) {
		super();
		this.id = id;
		this.name = name;
		this.bDate = bDate;
	}
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
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	
	
	
}