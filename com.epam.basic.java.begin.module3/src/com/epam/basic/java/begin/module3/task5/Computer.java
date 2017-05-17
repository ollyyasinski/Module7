package com.epam.basic.java.begin.module3.task5;

public class Computer {

	private String name;
	private int ram;
	private int hdd;
	private double weight;
	private int facoryNumber;
	private int cpuNumber;
	private int height;
	private int width;
	private boolean error;
	private boolean adminComp;
	private  Computer[] userComps;  
	int compIndex = 0;
	
	public Computer(String name, boolean adminComp) {		 
        this.name = name;
        this.adminComp = adminComp; 
       }
	

	public String getName() {
		return name;
	}
	
	public void setName(String name){
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Name can not be null or empty");
		}		
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram){
		if (ram > 15) {
			this.ram = ram;
		} else {
			System.out.println("Ram should be greater than 15");
		}		
	}

	public double getWeight() {
		return weight;
	}

	public void setWight(double weight) {
		if (weight >= 0){
		this.weight = weight;
		} else {
			System.out.println("Weight should be greater than 0");
		}
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		if (hdd >= 20){
		this.hdd = hdd;
		} else {
			System.out.println("Hdd should be greater than 20");
		}
	}

	public int getFacoryNumber() {
		return facoryNumber;
	}

	public void setFacoryNumber(int facoryNumber) {
		if (facoryNumber != 0) {
		this.facoryNumber = facoryNumber;
		} else {
			System.out.println("Factory number can not be null");
		}
	}

	public int getCpuNumber() {
		return cpuNumber;
	}

	public void setCpuNumber(int cpuNumber) {
		if (cpuNumber >= 1){
		this.cpuNumber = cpuNumber;
		} else {
			System.out.println("CPU number should be greater than 1");
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height >= 0) { 
		this.height = height;
		} else {
			System.out.println("Height should be greater than 0");
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width >= 0) {
		this.width = width;
		} else {
			System.out.println("Width should be greater than 0");
		}
	}
	
	
	public static void main(String[] args){
		Computer[] userComps; 
		ScannerRunner scan = new ScannerRunner();
		scan.scanner();
		userComps = new Computer[scan.compCount]; 
		System.out.println(userComps.length);
		
		Computer adminComp = new Computer("Admin Computer", true);
		adminComp.on();
		
	}
	
	
	
	public void on(){
		Computer[] userComps;
		ScannerRunner scan = new ScannerRunner();
		userComps = new Computer[scan.compCount];
		int compIndex = 1;	
		System.out.println("Computer " + userComps[compIndex] + " is on.");
		
	  }
	
	public void off(){
		  System.out.println("Turn off");
	  }
	public void load(){
		  System.out.println("Load");
	  }

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public boolean isAdminComp() {
		return adminComp;
	}

	public void setAdminComp(boolean adminComp) {
		this.adminComp = adminComp;
	}


	public Computer[] getUserComps() {
		return userComps;
	}


	public void setUserComps(Computer[] userComps) {
		this.userComps = userComps;
	}
	
}
