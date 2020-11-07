package com.generictest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenericTestClass {

	//Test case for greatest Integer FirstValue
	@Test
	public void FirstMaximumValueFirstPosition() {
		Integer firstValue = 40, secondValue = 30, thirdValue = 25;
		FindMax main = new FindMax();
		Integer max = main.checkIntmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	//Test case for greatest Integer SecondValue
	@Test
	public void FirstMaximumValueSecondValue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 25;
		Integer max = main.checkIntmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);

	}

	//Test case for greatest Integer ThirdValue
	@Test
	public void FirstMaximumValueThirddValue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 35;
		Integer max = main.checkIntmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);

	}

	// Test case for greatest Float FirstValue
	@Test
	public void FirstMaximumFloatValue_FirstPosition() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 2.5f, thirdValue = 3.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	// Test case for greatest Float Second
	@Test
	public void secondMaximumFloatValue_SecondtPosition() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 6.5f, thirdValue = 3.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);
	}

	// Test case for greatest Float ThirdValue
	@Test
	public void thirdMaximumFloatValue_ThirdPosition() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 6.5f, thirdValue = 7.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);
	}

}
