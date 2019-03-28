package com.Exceptions;

import java.io.IOException;

public class ThrowException extends Demo {

	public int sum(int a, int b, int c) throws IOException {
		a = b + c;

		return a;
	}

	public ThrowException() {

		System.out.println("oiuoiu");
	}

	void mymethod(int num) throws Exception {
		if (num == 1)

			throw new IOException("Exception message1");

		else
			try {
				throw new ClassNotFoundException("Exception message2");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void main(String[] args) {
		try {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("lokesh");
		
		Demo.inst();

	}

}
