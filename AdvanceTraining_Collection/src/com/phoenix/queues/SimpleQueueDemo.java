package com.phoenix.queues;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> q = new LinkedList<Integer>();
		//Queue<Integer> q = new PriorityQueue<Integer>();
		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(100);
		q.add(49);
		q.add(80);
		q.offer(73);
		q.offer(49);
		System.out.println("Head of queue: "+q.peek());
		System.out.println("Removing head: "+q.poll());
		System.out.println("Head of queue: "+q.peek());
		
		while(!q.isEmpty()) {
			System.out.println("Polling Element: "+q.poll());
		}
		System.out.println("Head of queue: "+q.peek());
		//System.out.println("Head of queue: "+q.element());
		System.out.println("Polling element: "+q.poll());
		//System.out.println("Polling element: "+q.remove());
		
	}
}
