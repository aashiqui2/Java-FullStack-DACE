package com.service;

import com.exception.ScaleUpIndiaException;


public interface CalculatorService {
	void divide(Integer... array) throws ScaleUpIndiaException;
}
