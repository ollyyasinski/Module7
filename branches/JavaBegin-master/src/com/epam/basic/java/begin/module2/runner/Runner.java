package com.epam.basic.java.begin.module2.runner;

import com.epam.basic.java.begin.module2.organization.NetDeveloper;
import com.epam.basic.java.begin.module2.organization.QaSpecialist;

public class Runner {
	
	public static void main(String[] args){
		NetDeveloper nd1 = new NetDeveloper();
		nd1.name = "Stan";
		nd1.qualification = "awesome code creator";
		nd1.specialization = "Java";
		
		QaSpecialist qa1 = new QaSpecialist();
		qa1.name = "Olya";
		qa1.qualification = "awesome tester";
		qa1.specialization = "A11y";
		
		
		System.out.println("Developer " + nd1.name + " with specialization in " + nd1.specialization + " and qaulification of " + nd1.qualification + " says: ");
		nd1.implement();
		System.out.println("QA " + qa1.name + " with specialization in " + qa1.specialization + " and qaulification of " + qa1.qualification + " says: ");
		qa1.test();
	}
	
}
