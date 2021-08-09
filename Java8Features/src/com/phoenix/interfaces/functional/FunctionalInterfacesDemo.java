package com.phoenix.interfaces.functional;
/*
 * @author kashish.jain@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Predicate Functional Interface
		Predicate<Integer> p = n1->n1>10;
		System.out.println(p.test(12));
		System.out.println(p.test(1));
		Predicate<String> p1 = s->s.equals("HELLO");
		System.out.println(p1.test("HELLO"));
		
		//Consumer Functional Interface
		Consumer<String> c1 = s->System.out.println(s);
		c1.accept("Welcome to Functional Programming in Java");
		
		Consumer<Integer> c2 = i->System.out.println(i);
		c2.accept(200);
		
		//Supplier Functional Interface
		Supplier<String> s = ()->"Hello! this is get method of Supplier";
		System.out.println(s.get());
		
		Supplier<Double> s1 = ()-> 1000.45;
		System.out.println(s1.get());
		
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> nums = s3.get();
		System.out.println(nums.size());
		
		Consumer<Integer> c4 = a-> nums.add(a);
		c4.accept(15);
		c4.accept(18);
		c4.accept(90);
		c4.accept(100);
		c4.accept(180);
		System.out.println(nums.size());
		
		Function<String, Integer> f = st->Integer.valueOf(st);
		System.out.println(f.apply("485"));
		
		
		Supplier<Product> s5 = ()->new Product(105, "Laptop", "Acer", 50000.0f);
		Product pr = s5.get();
		
		Consumer<Product> c5 = pr1->System.out.println(pr1);
		c5.accept(pr);
		
		Function<Product, Float> f1 = product -> product.getPrice();
		System.out.println(f1.apply(pr));
		
		Function<Product, String> f2 = product -> product.getBrand();
		System.out.println(f2.apply(pr));
		
		BiPredicate<Integer, Double> b = (i,d)-> i>=d;
		System.out.println(b.test(50, 50.0));
		System.out.println(b.test(50, 50.001));
		
		BiConsumer<Integer, String> bc = (i,str)->System.out.println(i+ " "+ str);
		bc.accept(100, "Hello");
		bc.accept(pr.getId(), pr.getName());
		
		BiFunction<String, Integer, Boolean> bf = (st1,i)->st1.equals(i);
		System.out.println(bf.apply("100", 100));
		
		BiFunction<String, Integer, Boolean> bf1 = (st1,i)->i == Integer.parseInt(st1);
		System.out.println(bf1.apply("100", 100));
		
		UnaryOperator<String> u1  = ss->ss.toUpperCase();
		System.out.println(u1.apply("hiii"));
		System.out.println(u1.apply(pr.getName()));
		
		BinaryOperator<String> b1 = (sr,sr1)->sr+sr1;
		System.out.println(b1.apply("Hello"," Kashish"));
		System.out.println(b1.apply(pr.getBrand()," "+pr.getName()));
		
	}

}
