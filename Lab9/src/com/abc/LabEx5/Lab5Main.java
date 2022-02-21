package com.abc.LabEx5;
interface Factorial {
	int factorial(int i);


}
public class Lab5Main {

	static Factorial fact;

	public static void main(String[] args) {
		
		fact = (n) -> {
			if (n == 0)
				return 1;
			else {
				return n * (fact.factorial(n - 1));
			}
		};
		int i = fact.factorial(7);
		System.out.println(i);
	}
	}
