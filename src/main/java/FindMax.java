package com.generictest;

public class FindMax {
	
	//Function for check Maximum Integer value
	public Integer checkIntmax(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}

	//Function for check Maximum float value
	public Float checkFloatmax(Float firstValue, Float secondValue, Float thirdValue) {
		Float max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}

	//Function for cheking String value
	public String checkStringmax(String firstValue, String secondValue, String thirdValue) {
		String max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}
}

