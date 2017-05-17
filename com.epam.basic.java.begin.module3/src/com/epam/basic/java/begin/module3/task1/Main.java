package com.epam.basic.java.begin.module3.task1;

public class Main {
	public static void main(String[] args){
		Gamer gamer1 = new Gamer();
		gamer1.level = 1;
		
		Gamer gamer2 = new Gamer();
		gamer2.level = 2;
		
		System.out.println("Step 1");		
		System.out.println("Gamer 1 is on level " + gamer1.level);
		System.out.println("Gamer 2 is on level " + gamer2.level);
		
		gamer1 = gamer2;
		
		System.out.println("Step 2");
		System.out.println("Gamer 1 is on level " + gamer1.level);
		System.out.println("Gamer 2 is on level " + gamer2.level);	
		
		gamer1.level = 1;		
		
		System.out.println("Step 3");
		System.out.println("Gamer 1 is on level " + gamer1.level);
		System.out.println("Gamer 2 is on level " + gamer2.level);
		
		
	}
}
