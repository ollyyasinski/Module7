package com.epam.basic.java.begin.module7.task3;

class Comp implements Comparable {
	String str;
	int number;

	Comp(String str, int number) {
		this.str = str;
		this.number = number;
	}
	
	@Override
		public int compareTo(Object obj) {
			Comp entry = (Comp)obj;
			//непонятно
			int result = entry.str.compareTo(str);
			if(result != 0) {
				return result;
			}
			result = entry.number - number;
			if(result != 0) {
					return (int) result / Math.abs( result );
			}
			return 0;
			}
}


