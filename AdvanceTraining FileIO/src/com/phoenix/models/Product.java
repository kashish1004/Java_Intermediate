package com.phoenix.models;

import java.io.Serializable;

import com.phoenix.dates.Date;

/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Product implements Comparable<Product>,Serializable {

	private transient int id; //transient members of the class are not serialized
	private String name;
	private transient String brand;
	private float price;
	private transient Date mfgDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	
	public Product(int id, String name, String brand, float price, Date mfgDate) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.mfgDate = mfgDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", mfgDate=" + mfgDate
				+ "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		return 0;
	}

	@Override
	public int hashCode() {
		return id + name.hashCode() + (int)price;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product))
			return false;
		else {
			Product p = (Product) obj;
			if(this.id == p.id && this.name.equals(p.name) && this.brand.equals(p.brand) && this.price == p.price) 
				return true;
			else
				return false;
		}
	}

}
