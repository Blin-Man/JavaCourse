package day4;

import java.util.Scanner;

public class LoopExample {
	static Scanner sc = new Scanner(System.in);
	//static Scanner sci = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		//latinLetters();
		//infiniteLoopStop();
		//multiTable();
		//biggestNum();
		//vowelSum();
		//rollercoaster();
		//marketplace();
		biggest3();
	}
	
	public static void latinLetters() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first letter:");
		char startAlpha = sc.nextLine().charAt(0);
		System.out.println("Insert second letter:");
		char endAlpha = sc.nextLine().charAt(0);
		for( char i = startAlpha; i<= endAlpha; i++) {
			System.out.println(i + " " + (int)i);
		}
	}
	
	//sum inputted values until exit
	public static void infiniteLoopStop() {
		long sum =0;
		for(;;) {
			System.out.println("Insert 0 to sum up values");
			System.out.println("Insert a value: ");
			int num = sc.nextInt();
			
			if(num==0)
				break;
			sum+=num;
			System.out.println("Summation of your values: " + sum + '\n');
		}
		System.out.println("adios");
	}
	//to create a x10 multiplication table
	public static void multiTable() {
		
		System.out.println("Insert a value: ");
		int n = sc.nextInt();
		for(int i = 1; i<=10;i++) {
			int result = n*i;
			System.out.println( n + " x " + i + " = " + result);
		}
		
	}
	//to find the largest number among the inputted
	public static void biggestNum() {
		System.out.println("How many values?: ");
		int n = sc.nextInt();
		int maxNo = Integer.MIN_VALUE;
		
		for(int i = 1; i <=n; i++) {
			System.out.printf("Insert value no %d :",i);
			int currentNo = sc.nextInt();
			
			if(currentNo > maxNo) 
				maxNo=currentNo;	
			}
		System.out.println("Biggest value is: " + maxNo);
	}
	//sum of vowel
	public static void vowelSum() {
		System.out.println("How many characters? :");
		int n =sc.nextInt();
		int sumVowel =0;
		//sc.close();
		for(int i = 0; i <n;i++) {
			System.out.printf("Insert letter no %d:",i);
			char ch = sc.next().charAt(0);
			
			switch  (ch) {
				case 'a': sumVowel += 1;
						  break;
				case 'e': sumVowel += 2;
						  break;
				case 'i': sumVowel += 3;
						  break;
				case 'o': sumVowel += 4;
					      break;
				case 'u': sumVowel += 5;
				 		  break;
				
			}
			
		}
		System.out.println("Summation of the vowels is: " + sumVowel);
	}
	//to fit queue of a rollercoaster by seat, minimum age
	public static void rollercoaster() {
		System.out.print("Seats: ");
		int seat = sc.nextInt();
		System.out.print("Minimum age: ");
		int minAge = sc.nextInt();
		System.out.print("People in queue: ");
		int queue =sc.nextInt();
		
		int peopleCount = 0;
		
		for(int i = 0; i < queue;i++) {
			System.out.printf("Enter age of person %d : ",i+1);
			int personAge = sc.nextInt();
			if(personAge>=minAge) //&& seat>peopleCount)
				peopleCount++;
			}
		if(peopleCount==seat)
			System.out.print("Let's go");
		else if(peopleCount>seat)
			System.out.printf("%d people need to wait || %d people can depart ",(peopleCount-seat),seat);
		else
			System.out.print("Waiting...");
		}
	//to print out price based on selection
	public static void marketplace() {
		System.out.print("Select product to buy: 1)Banana 2)Apple 3)Kiwi ");
		int product = sc.nextInt();
		System.out.print("Select day: 1)Weekend 2)Weekday ");
		int day = sc.nextInt();
		
		if(product==1) {
			if(day==1)
				System.out.print("2.70");
			else if(day==2)
				System.out.print("2.50");
		}
		else if (product==2) {
			if(day==1)
				System.out.print("1.60");
			else if(day==2)
				System.out.print("1.30");
		}
		else if (product==3) {
			if(day==1)
				System.out.print("3.00");
			else if(day==2)
				System.out.print("2.20");
		}
	}
	//find the biggest number out of three values
	public static void biggest3() {
		System.out.print("Input first number: ");
		int first = sc.nextInt();
		System.out.print("Input second number: ");
		int second = sc.nextInt();
		System.out.print("Input third number: ");
		int third = sc.nextInt();
		
		if(first>second)
			if(first>third)
				System.out.printf("Biggest number is %d ",first);
			else 
				System.out.printf("Biggest number is %d ",third);
		else if(second>third)
			System.out.printf("Biggest number is %d ",second);
			else
			System.out.printf("Biggest number is %d ",third);


	}
}
