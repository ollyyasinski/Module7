package com.epam.basic.java.begin.module3.task5;

import java.util.Scanner;

public class ScannerRunner {
	private static Scanner scanner;
	int compCount;

	public void scanner(){
		scanner = new Scanner(System.in);
        System.out.print("¬ведите количество компьютеров: ");  
        compCount = scanner.nextInt();
	}

}
