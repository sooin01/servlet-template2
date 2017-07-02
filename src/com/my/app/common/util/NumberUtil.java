package com.my.app.common.util;

public class NumberUtil {

	public static void main(String[] args) {
		String value = null;
		value = "12.2";
		// value = ".2";
		// value = "2.000";
		double d = Double.parseDouble(value);
		int i = (int) d;
		
		if (d == i) {
			System.out.println("integer: " + i);
		} else {
			System.out.println("double: " + d);
		}
	}
	
}
