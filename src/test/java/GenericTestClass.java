package com.generictest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenericTestClass {

	//Test case for greatest FirstValue
	@Test
	public void FirstMaximumValueFirstPosition() {
		Integer firstValue = 40, secondValue = 30, thirdValue = 25;
		FindMax main = new FindMax();
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	//Test case for greatest SecondValue
	@Test
	public void FirstMaximumValueSecondValue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 25;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);

	}

	//Test case for greatest ThirdValue
	@Test
	public void FirstMaximumValueThirddValue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 35;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);

	}

}
