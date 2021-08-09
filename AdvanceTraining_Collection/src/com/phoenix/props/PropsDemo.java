package com.phoenix.props;

import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("username", "kashish");
		props.setProperty("password", "hello123");
		
		String uname = props.getProperty("username");
		String passwd = props.getProperty("password","kas111");
		
		System.out.println(uname);
		System.out.println(passwd);
	}

}
