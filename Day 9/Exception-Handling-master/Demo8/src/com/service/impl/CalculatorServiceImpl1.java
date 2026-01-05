package com.service.impl;

import com.exception.ScaleUpIndiaException;
import com.service.CalculatorService;


public class CalculatorServiceImpl1 implements CalculatorService {
	@Override
	public void divide(Integer... array) throws ScaleUpIndiaException {
		int quotient = 0;
		if (array[1] == 0) {
			throw new ScaleUpIndiaException("Cannot divide " + array[0] + " by " + array[1]);
		}
		quotient = array[0] / array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
	}
}
