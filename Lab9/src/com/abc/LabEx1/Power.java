package com.abc.LabEx1;

@FunctionalInterface
interface Intf {
	int a(int x, int y);
}

public class Power {

	Intf a = (x, y) -> {
		return (int) (Math.pow(x,y));
	};
	
	public static void main(String[] args) {
		Intf i = (x, y) -> {
			return (int) (Math.pow(x,y));
		};
		System.out.println(i.a(2, 3));
	}
}