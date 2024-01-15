package com.mapping.inheritance.horizontal;
public class Disc {
	
	int Id;
	String Name;
	int Price;
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disc(int id, String name, int Price) {
		super();
		Id = id;
		Name = name;
		this.Price = Price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	@Override
	public String toString() {
		return "Disc [Id=" + Id + ", Name=" + Name + ", Price=" + Price + "]";
	}}
