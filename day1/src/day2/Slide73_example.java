package day2;

public class Slide73_example {
	public static void main(String[] args) {
		System.out.println("This is the first example:");
		System.out.println("++++++++++++++++++++++++++");
		firstExample();
		System.out.println();
		
		System.out.println("This is the second example:");
		System.out.println("++++++++++++++++++++++++++");
		secondExample();
		
	}
	
	public static void firstExample() {
		greenEggSam();
		System.out.println("I do not like them on boat,");
		System.out.println("I do not like them with a goat.");
		greenEggSam();
	}
	public static void greenEggSam() {
		System.out.println("I do not like green eggs and ham");
		System.out.println("I do not like them, Sam I am!");
	}
	
	public static void secondExample() {
		lollipop();
		System.out.println();
		lollipop();
		System.out.println("Call my baby lollipop");
	}
	
	public static void lollipop() {
		System.out.println("Lollipop, lollipop");
		System.out.println("Oh, lolli lolli lolli");
	}
}
