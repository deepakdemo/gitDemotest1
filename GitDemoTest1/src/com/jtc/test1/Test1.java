package com.jtc.test1;

public class Test1 {
	public static void main(String[] args) {
		String str = "Hello how are you?";
		String st1[] = str.split(" ");
		for (int i = st1.length - 1; i >= 0; i--) {
			System.out.println(st1[i]);
		}
	}
}
