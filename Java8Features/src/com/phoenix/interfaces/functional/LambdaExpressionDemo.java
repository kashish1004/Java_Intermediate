package com.phoenix.interfaces.functional;
/*
 * @author kashish.jain@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @copyright Sterlite Technologies Ltd
 */
public class LambdaExpressionDemo {
	
	public void doMath(Addable ob) {
		System.out.println(ob.add(10, 20));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m = ()->System.out.println("Anonymous object Moves");
		m.move();
		Jumpable j = ()->System.out.println("Anonymous object Jumps");
		j.jump();
		Addable ad = (x,y)-> { return x+y;};//if return is present curly braces are must and also datatype is optional
		System.out.println("Addition is: "+ ad.add(10, 5));
		Addable ad1 = (x,y)-> x+y;//return is also optional
		System.out.println("Addition is: "+ ad1.add(10, 15));
		Greeting g = personName->{return "Hello " + personName;};//parantheses are optional if only one parameter is present 
		System.out.println(g.greet("Kashish"));
		LambdaExpressionDemo l = new LambdaExpressionDemo();
		l.doMath( (c,d)->c+d );//lambda expression can be passed to method as parameter
		//calling default method of interface
		float res = ad.addFloat(2.3f, 5.7f);
		System.out.println("Addition is: " + res);
		//calling static method of interface
		Addable.show();
	}
}