package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> proList = new ArrayList<Product>();
		proList.add(new Product(108, "Laptop", "Acer", 50000.0f));
		proList.add(new Product(102, "Laptop", "HP", 45000.0f));
		proList.add(new Product(107, "Mobile", "Samsung", 15000.0f));
		proList.add(new Product(104, "LED TV", "Sony", 57000.0f));
		proList.add(new Product(101, "Refrigerator", "Whirlpool", 57000.0f));
		
		Collections.sort(proList);
		System.out.println("\nSort by id in asc");
		proList.forEach(System.out::println);
		System.out.println();
		
		//Java 8
		proList.sort(Comparator.naturalOrder());
		System.out.println("\nSort by id in asc using comparator");
		proList.forEach(System.out::println);
		System.out.println();
		
		System.out.println("\nSort by id in desc using comparator");
		proList.sort(Comparator.reverseOrder());
		proList.forEach(System.out::println);
		
		//using stream
		System.out.println("\nSorting Using Stream");
		proList.stream().sorted().forEach(System.out::println);
		
		System.out.println("\nSorting Using Stream in desc order");
		proList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("\nSort by name Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);
		
		System.out.println("\nSort by name Using Stream in desc order");
		proList.stream().sorted(Comparator.comparing(Product::getName).reversed()).forEach(System.out::println);
		
		System.out.println("\nSort by brand Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getBrand)).forEach(System.out::println);
		
		System.out.println("\nSort by brand Using Stream in desc order");
		proList.stream().sorted(Comparator.comparing(Product::getBrand).reversed()).forEach(System.out::println);
		
		System.out.println("\nSort by price Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
		
		System.out.println("\nSort by price Using Stream in desc order");
		proList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);
		
		System.out.println("\nSort by name and if name same then brand in asc order Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand)).forEach(System.out::println);
		
		System.out.println("\nSort by name in asc and if name same then brand in desc Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand,(brand1,brand2)->brand2.compareTo(brand1))).forEach(System.out::println);
		
		System.out.println("\nSort by name in desc and if name same then brand in asc Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getName).reversed().thenComparing(Product::getBrand)).forEach(System.out::println);
		
		System.out.println("\nSort by name in desc and if name same then brand in desc Using Stream");
		proList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand).reversed()).forEach(System.out::println);
		
	}

}
