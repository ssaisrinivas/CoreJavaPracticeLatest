package com.sai.core.java.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println(add(10, 20));
		} catch (CustomException e) {

			e.printStackTrace();
		}

	}

	public static int add(int a, int b) {
		int c = 0;

		c = a + b;
		int d = c / 0;
		if (true) {
			throw new CustomException("Invalid Arthemetic Operation !!! Divide/0");
		}
		return c;

	}

}
