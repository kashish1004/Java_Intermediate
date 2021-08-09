package com.phoenix.stacks;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Stack;

public class NumStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(40);
		st.push(20);
		st.push(70);
		st.push(10);
		st.push(80);
		System.out.println("Top of Stack: "+st.peek());
		int idx = st.search(70);
		System.out.println("Element 70 is at index: " +idx);
		System.out.println("Pop the top: "+ st.pop());
		while(!st.empty()) {
			System.out.println("Pop the top: "+ st.pop());
		}
	}

}
