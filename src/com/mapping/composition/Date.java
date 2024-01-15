package com.mapping.composition;

public class Date {
	private Integer date;
	private Integer year;
	private String month;
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date(Integer date, Integer year, String month) {
		super();
		this.date = date;
		this.year = year;
		this.month = month;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "Date [date=" + date + ", year=" + year + ", month=" + month + "]";
	}
	
	
	
}