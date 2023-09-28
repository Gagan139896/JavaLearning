package testpack;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Override_Super {

	static void add(int a, int b) {
		System.out.println("add "+(a-b));
	}
	public static void main(String[] args) {

	}
}

class Override_Sub extends Override_Super{
	static void add(int a, int b) {
		System.out.println("add "+(a+b));
	}
	public static void main(String[] args) {
		}
}