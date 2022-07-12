package com.ashleybattles.models;

public class Item {
//	Member variables
	public String name;
	public double price;
	
	//constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
