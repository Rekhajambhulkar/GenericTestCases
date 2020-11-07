package com.generictest;

public class FindMax<T extends Comparable<T>> {

	// Function for check Maximum values
	public static <T extends Comparable> T checkmax(T firstValue, T secondValue, T thirdValue) {
		T max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}

}

