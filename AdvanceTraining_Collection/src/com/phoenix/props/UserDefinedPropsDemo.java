package com.phoenix.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserDefinedPropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("credentials.properties");)
		{
			Properties props = new Properties();
			props.load(fis);
			String uname = props.getProperty("username");
			String passwd = props.getProperty("password","kas111");
			
			System.out.println("Username: "+uname);
			System.out.println("Password: "+passwd);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
