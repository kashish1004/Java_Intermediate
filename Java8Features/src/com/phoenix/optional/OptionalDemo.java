package com.phoenix.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.phoenix.models.Product;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Integer> o = Optional.empty();
		if(o.isPresent())
			System.out.println(o.get());
		else
			System.out.println("No value");
		
		Optional<Integer> opi = Optional.of(100);
		if(opi.isPresent())
			System.out.println(opi.get());
		else
			System.out.println("No value");
		
		Consumer<Integer> c = n-> System.out.println(n);
		opi.ifPresent(c);
		opi.ifPresent(n-> System.out.println(n));
		
		Optional<String> ops = Optional.ofNullable("Hello");
		System.out.println(ops.get());
		
		System.out.println(o.orElse(200));
		System.out.println(opi.orElse(200));
		
		System.out.println(o.orElseGet(()->300));//if o is empty supplier will invoke so here 300 is printed
		System.out.println(opi.orElseGet(()->300));
		
		Optional<Product> opp = Optional.of(new Product(1004,"laptop","acer",50000f));
		if(opp.isPresent())
			System.out.println(opp.get());
		
		Supplier<Exception> sx = ()->new Exception("No value");
		Exception e = sx.get();
		
		System.out.println(o.orElseThrow(()->new ArithmeticException("Error")));
		
		
		
	}

}
