package com.epam.java.basic.java.begin.module3.task3;

public class Main {
	
	public static void main(String[] args){
		int n = 9;
  		 for (int i = 1; i < 9; i++){
  			 for (int j = 1; j <= n - i + 1; j++){
			System.out.print(j + " ");
			}	
  			System.out.println();
		}		
	}
}
