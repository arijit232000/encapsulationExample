package com.arijit.watchpack;

public class Watch {
	private String name;
	private double price;
	private String color;
	
	public Watch(String name, double price, String color) {
	
		this.name = name;
		this.price = price;
		this.color = color;
	}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void displayDetails() {
		System.out.println("Model Name of Watch: "+name);
		System.out.println("price have to Pay: "+price);
		System.out.println("Color: "+color);
	}

}
