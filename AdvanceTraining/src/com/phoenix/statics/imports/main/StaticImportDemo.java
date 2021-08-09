package com.phoenix.statics.imports.main;
import static java.lang.Integer.parseInt;
import static com.phoenix.vehicles.Car.count;
import com.phoenix.vehicles.Car;
/*
 * @author kashish.jain@stltech.in
 * @creation date 13-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = parseInt("20");//bcoz of import statement we can directly access this method unlike Integer.parseInt()
		System.out.println(a);
		int b = parseInt("500");
		System.out.println(b);
		System.out.println("No. of car object: "+ count);
		Car c1 = new Car();
		Car c2 = new Car(100, "Lamborgini", 5000000.00f);
		System.out.println("No. of car object: "+ count);
	}

}
