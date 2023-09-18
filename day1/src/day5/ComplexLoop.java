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
		//sumDigitCalc();
		//apartmentBuilder();
		//travelSavings();
		letterComb();
		
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

	public static void apartmentBuilder() {
		  
		System.out.print("Input amount of floors:");
		int floor = sc.nextInt();
		System.out.print("Input amount of rooms:");
		int room = sc.nextInt();
		
		for(int row=floor;row>=1;row--) {
			for(int column = 0; column<room;column++) {
				if(row == floor)
					System.out.printf("L%d%d ",row,column);
				else if(row %2 == 0)
					System.out.printf("O%d%d ",row,column);
				else
					System.out.printf("A%d%d ",row,column);
			}
			System.out.println();
		}
	}
	
	public static void travelSavings() {
		System.out.print("Input your destination: ");
		String destination;
		
		while(!(destination=sc.nextLine()).equals("END")) {
			System.out.printf("\nInput your travel budget for %s: ",destination);
			double budget = Double.parseDouble(sc.nextLine());
			double sum = 0;
			while(sum < budget) {
				System.out.printf("\nBudget not reached,need %.2f input additional funds: ",(budget-sum));
				sum += Double.parseDouble(sc.nextLine());
				System.out.printf("Collected: %.2f\n",sum);
			}
			System.out.printf("Budget reached. Pack your bags. You're going to %s",destination);
		}
		System.out.println("Ended");
	}
	
	public static void letterComb() {
		
		System.out.println("Enter a starting letter: ");
		char start = sc.nextLine().charAt(0);
		System.out.println("Enter an ending letter: ");
		char end = sc.nextLine().charAt(0);
		System.out.println("Exclude what letter?: ");
		char exclude = sc.nextLine().charAt(0);
		
		int count = 0;
		
		for(char letter1 = start;letter1 <= end; letter1++) {
			for(char letter2  = start; letter2 <= end;letter2++)
				for(char letter3 = start; letter3 <= end; letter3++)
					if(letter1 != exclude && letter2 != exclude && letter3 != exclude) {
						if(count%2==0) {
						System.out.printf("\n|| %c %c %c ||",letter1,letter2,letter3);
						count++;
						}
						else {
							System.out.printf("|| %c %c %c ||",letter1,letter2,letter3);
							count++;
						}
						
					}
		}
		System.out.printf("\n\n%d combination(s)",count);
		
	}

}
