package com.phoenix.queues;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class NumDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deque<Integer> deq = new LinkedList<Integer>();
		Deque<Integer> deq = new ArrayDeque<Integer>();
		deq.add(100);
		deq.add(200);
		deq.addFirst(150);
		deq.addFirst(180);
		deq.addLast(120);
		deq.addLast(130);
		System.out.println("Front of deq: "+deq.peek());
		System.out.println("First ele of deq: "+deq.peekFirst());
		System.out.println("Last ele of deq: "+deq.peekLast());
		System.out.println("Polling element: "+deq.poll());
		System.out.println("Polling first element: "+deq.pollFirst());
		System.out.println("Polling last element: "+deq.pollLast());
		
	}

}
