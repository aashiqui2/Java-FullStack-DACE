package com.utility;


public class CustomResource {
	public CustomResource() {
		System.out.println("Custom Resource started");
	}

	public void process() {
		System.out.println("Custom Resource processing");
	}

	public void close() {
		System.out.println("Custom Resource finished");
	}
}
