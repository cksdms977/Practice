package com.inter.modle.vo;

import java.util.Objects;

public abstract class Animal {
	private String name;
	private String type;
	private double height;
	private double weight;
	private String area;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}


	public Animal(String name, String type, double height, double weight, String area) {
		super();
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.area = area;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}

	// alt + s + h + h + enter
	@Override
	public int hashCode() {
		return Objects.hash(area, height, name, type, weight);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return area == other.area && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
	
	
	
	
	
}
