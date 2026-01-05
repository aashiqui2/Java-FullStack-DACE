package com.service.impl;

import java.io.IOException;

import com.service.CalculatorService;
import com.utility.CustomResource;
import com.utility.CustomResource2;


public class CalculatorServiceImpl1 implements CalculatorService {
	@Override
	public void divide(Integer... array) throws IOException {
		int quotient = 0;
		CustomResource customResource = new CustomResource();
		CustomResource2 customResource2 = new CustomResource2();
		try (customResource; customResource2) {
			if (array[1] == 0) {
				throw new IOException("Cannot divide " + array[0] + " by " + array[1]);
			}
			customResource.process();
			customResource2.process();
			quotient = array[0] / array[1];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (Exception exception) {
			System.out.println("Exception handled in " + this.getClass() + " is " + exception.getMessage());
			throw exception;
		}
	}
}
