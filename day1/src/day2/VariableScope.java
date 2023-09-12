package day2;

import java.util.Scanner;

public class VariableScope {
	public static void main(String[] args) {
		String outer = "I'm inside the main()";
		for (int i=0; i < 10; i++) {
			String inner = "I'm inside the loop";
		}
		System.out.println(outer);
		
		//centuriesExample();
		//intOverflow();
		
		//intInput();
		centuryConvert();
		
		
		
		
	}
	
	//This method shoes the diff example of integer type values
	public static void centuriesExample() {
		byte centuries = 20;
		short years = 2000;
		int days = 730484;
		long hours = 17531616;
		
		System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries,years,days, hours);
	}
	
	//This method demonstrates the integer overflow problem
	//counter stops at 127, and then continues with negative value as byte supports only 256, 127 -> -128
	public static void intOverflow() {
		byte counter = 0;
		for (int i = 0; i < 130; i++) {
			counter++;
			System.out.println(counter);
			if (i==129) {
				System.out.println();
			}
		}
		
	}
	
	public static void intInput() {
		int hexa = 0xFFFFFFFF;
		long number = 1L;
		System.out.println(hexa);
		System.out.println(number + '\n');
		
		System.out.println("Insert value to convert to km:");
		Scanner scanner = new Scanner(System.in);
		
		int meters = Integer.parseInt(scanner.nextLine());
		double kilometers = meters /1000.0;
		System.out.printf("%.2f", kilometers);
	}
	
	//Method to convert centuries to years, days, hours
	public static void centuryConvert() {
		
		System.out.println("Insert century to convert:");
		Scanner scanner = new Scanner(System.in);
		
		int century = Integer.parseInt(scanner.nextLine());
		
		double years = century*100.00;
		double days = century*36500.00;
		double hours = century*876000.00;
		
		System.out.printf("%d Centuries is" + '\n',century);
		System.out.printf("%.1f Years" + '\n',years);
		System.out.printf("%.1f Days" + '\n',days);
		System.out.printf("%.1f Hours" + '\n',hours);
		
		
	}
}
