package com.phoenix.stacks;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayDeque;

public class NumStackArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		System.out.println("Top of Stack: "+ stack.peekLast());
		System.out.println("pop the element:"+ stack.pollLast());
		System.out.println("Top of Stack: "+ stack.peekLast());
		while(!stack.isEmpty()) {
			System.out.println("pop the element:"+ stack.pollLast());
		}
	}

}
