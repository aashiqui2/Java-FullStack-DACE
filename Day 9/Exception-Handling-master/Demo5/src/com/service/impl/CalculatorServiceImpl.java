package com.service.impl;

import java.io.IOException;

import com.service.CalculatorService;


public class CalculatorServiceImpl implements CalculatorService {
	
	@Override
	public void divide(Integer... array) throws IOException  {
		int quotient = 0;
		if (array[1] == 0) {
			throw new IOException();
		}
		quotient = array[0] / array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
	}
}
