package com.epam.basic.java.begin.module3.task2;

public class Main {
	
	public static void main(String[] args){
	Horse horse1 = new Horse();
	horse1.name = "Gnedaya";
	horse1.color = "Rizhiy";
	horse1.score = 1;
		
	Horse horse2 = new Horse();
	horse2.name = "Gnedaya";
	horse2.color = "Rizhiy";
	horse2.score = 2;
	
	
	System.out.println(horse1.name + " is on place " + horse1.score + " and " +  horse2.name + " is on place " + horse2.score );
	System.out.println("Horse of Owner 1 is faster than horse of Owner 2");
	System.out.println(horse1.score < horse2.score);
	}
}
