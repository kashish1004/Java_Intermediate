package com.phoenix.models;
/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ElectronicProduct extends Product {
	public int Ele_id;
	private String label;
	private ElectronicProduct() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ElectronicProduct(int ele_id, String label) {
		super();
		Ele_id = ele_id;
		this.label = label;
	}



	public int getEle_id() {
		return Ele_id;
	}
	void setEle_id(int ele_id) {
		Ele_id = ele_id;
	}
	String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}	
