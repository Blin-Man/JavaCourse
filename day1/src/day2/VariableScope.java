package day2;

import java.math.BigDecimal;
import java.util.Scanner;

public class VariableScope {
	public static void main(String[] args) {
		String outer = "I'm inside the main()";
		for (int i=0; i < 10; i++) {
			String inner = "I'm inside the loop";
		}
		System.out.println(outer);
		
		//centuriesExample();
		intOverflow();
		
		//intInput();
		//centuryConvert();
		//piPrecision();
		//pound2US();
		//incorrectFloat();
		//exactSum();
		//specialNum();
		
		
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
	public static void piPrecision() {
		float floatPI = 3.141592653589793238f;
		double doublePI = 3.141592653589793238;
		System.out.println("Float PI is: " + floatPI);
		System.out.println("Double PI is: " + doublePI);
	}
	public static void pound2US() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert value in Pounds: ");
		double num = Double.parseDouble(scanner.nextLine());
		double result = num *1.31;
		System.out.printf("%.3f pound is $%.3f",num,result);
	}
	public static void incorrectFloat() {
		double a = 1.0f;
		double b = 0.33f;
		double sum = 1.33d;
		double c = a+b;
		System.out.println(c);
		System.out.printf("a+b = %f  sum = %f  equal = %b \n", c,sum, (a+b == sum));
		
		double num = 0;
		for (int i = 0; i < 10000; i++) num+=0.0001;
			System.out.println(num);
		
	}
	
	public static void exactSum() {
		
		System.out.println("Insert how many values you want to sum up:");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		BigDecimal sum = new BigDecimal(0);
		
		for(int i = 0; i < n;i++) {
			System.out.println("Input value no " + (i+1)+ ":");
			BigDecimal number = new BigDecimal(sc.nextLine());
			sum = sum.add(number);
		}
		
		System.out.println("The sum is: " + sum);
	}
	public static void specialNum() {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int num = 1; num <= n; num++) {
			int sumOfDigits = 0;
			int digits = num;
			while(digits >0) {
				sumOfDigits += digits %10;
				//System.out.println("sumOfDigits: " + sumOfDigits);
				digits = digits /10;
				//System.out.println("Digits: " + digits);
			}
			boolean check = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11 );
			System.out.println(num + " is " + check );
		}
		
	}
}
