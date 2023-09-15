package day5;

import java.util.Scanner;

public class ComplexLoop {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//n21();
		//evenPower();
		//nestedForLoop();
		//triangleStar();
		//triangleStarWhile();
		sumDigitCalc();
		
		
	}
	
	//count down from n number to 1
	public static void n21() {
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		for(int i = num;i>=1;i--) {
			if(i < num)
				System.out.print(", ");
			System.out.print(i);
		}
		System.out.println();
	}
	
	//even power of 2
	public static void evenPower() {
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int powNum=1;
		
		for(int i = 0; i <= num; i +=2) {
			if(i>0)
				System.out.print(", ");
			System.out.print(powNum);
			powNum = powNum*2*2;
		}
		System.out.println();
	}
	
	//nested for loop
	public static void nestedForLoop() {
		int n =3 ;
		for (int row = 1; row <= n; row++) {
			for(int col =1; col <= n; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	//prints triangle of stars based on nested for loop
	public static void triangleStar() {
		
		System.out.println("What's the size of the triangle? ");
		System.out.print("->");
		int size = sc.nextInt();
		
		for(int row = 1; row<=size;row++) {
			for(int col =1 ; col < row; col++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//prints triangle of stars based on nested while loop
	public static void triangleStarWhile() {
		System.out.println("What's the size of the triangle? ");
		System.out.print("->");
		int height = sc.nextInt();
		int row =1;
		
		while(row<=height) {
			int col = 0;
			while(col++ < row) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
	}
	
	//Sum of Digits Calculator 
	public static void sumDigitCalc() {
		
		while(true) {
			System.out.println("Enter an integer, END to exit calculator ");
			System.out.print("->");
			String input = sc.nextLine();
			if (input.equals("END"))
				break;
			
			int sum=0;
			int inputNum = Integer.parseInt(input);
			
			for( int num = inputNum; num > 0; num = num/10)
				sum+= num %10;
			System.out.printf("Sum of digits: %d%n",sum);
		}
		System.out.println("Adios");
	}
		

}
