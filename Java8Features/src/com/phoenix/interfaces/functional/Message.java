package com.phoenix.interfaces.functional;
/*
 * @author kashish.jain@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Message {
	
	private String msg;
	
	public Message() {
		// TODO Auto-generated constructor stub
		System.out.println("D");
	}
	
	public Message(String msg) {
		super();
		this.msg = msg;
		System.out.println("P");
	}
	
	public String getMsg() {
		return msg;
	}
	
}
