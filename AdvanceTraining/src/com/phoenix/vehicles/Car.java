package com.phoenix.vehicles;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.annotations.CopyrightInfo;

@CopyrightInfo(author = "kashish.jain@stltech.in")
public class Car {
	private int id;
	@CopyrightInfo(author = "kashish.jain@stltech.in")
	private String model;
	private float price;
	public static int count;
	public Car() {
		// TODO Auto-generated constructor stub
		count++;
	}
	//@CopyrightInfo(author = "kashish.jain@stltech.in")// this gives error bcoz it can only be used on class or interface
	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}

	
	@Override 
	public int hashCode() {
		return id + model.hashCode()+(int)price;
	}
	 
	 

	@Override//overriding equals method
	public boolean equals(Object obj) {
		Car car = (Car) obj;
		if (this.id == car.id && this.model == car.model && this.price == car.price)
			return true;
		else
			return false;
	}
	 
	
}
