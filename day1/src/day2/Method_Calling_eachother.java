package day2;

public class Method_Calling_eachother {
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	public static void method1() {
		System.out.println("A patridge in a pear tree.");
	}
	public static void method2() {
		System.out.println("Two turtle doves, and");
		method1();
	}
}
