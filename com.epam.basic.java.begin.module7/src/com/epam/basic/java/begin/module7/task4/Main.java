package com.epam.basic.java.begin.module7.task4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args){
		Comparator<String> comparator = new StringLengthComparator();
		PriorityQueue<String> queue = new PriorityQueue<String>(5, comparator);
		
		queue.add("short");
		
		queue.add("very long indeed");
		queue.add("medium");
		queue.add("for a long          time");
		while (queue.size() != 0){
			System.out.println(queue.remove());
		}	
		
	}		
		
		

}
