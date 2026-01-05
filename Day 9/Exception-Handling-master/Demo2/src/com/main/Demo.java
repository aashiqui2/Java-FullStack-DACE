package com.main;

import com.service.CalculatorService;
import com.service.impl.CalculatorServiceImpl;

public class Demo {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		System.out.println("---SCENARIO 1---");
		calculatorService.divide(10, 2);
		System.out.println("---SCENARIO 2---");
		calculatorService.divide(10);
	}
}
