package com.epam.basic.java.begin.module7.task4;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String x, String y) {
		if(x.length() < y.length()){
			return -1;
		}
		if(x.length() > y.length()){
			return 1;
		}
		return 0;
	}
}
