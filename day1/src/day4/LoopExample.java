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
		//biggest3();
		//bonusPt();
		//foodDrink();
		//fruitVeg();
		//notLogical();
		//day2Name();
		//vowelConsonant();
		//prodNoSign();
		//numberWhatSort();
		//cinemaTicket();
		//numOp();
		//atm();
		//big5();
		//decreaseNo();
		numRange();
		
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
	//shows usage of logical &&
	public static void bonusPt() {
		System.out.print("Insert a point value: ");
		int point = sc.nextInt();
		
		if (point >= 0 && point <=3)
			point += 5;
		else if(point >=4&& point <=6)
			point += 15;
		else if(point >=7 && point <= 9)
			point += 20;
		
		System.out.printf("Bonus point is %d ",point);
	}
	
	//shows usage of logical ||. refer slide 268
	public static void foodDrink() {
		System.out.print("Input food or drink: ");
		String st = sc.nextLine();
		
		if(st.equals("curry")|| st.equals("noodles")||st.equals("sushi")||st.equals("spaghetti"))
			System.out.print("It's a food");
		else if(st.equals("tea")||st.equals("water")||st.equals("coffee"))
			System.out.print("It's a drink");
		else
			System.out.print("unknown");
	}
	//shows usage of ! logical
	public static void notLogical() {
		
		int num = sc.nextInt();
		boolean isValid = (num>= 100 && num<=200)|| num == 0;
				
				if(!isValid)
					System.out.print("number invalid");

	}
	//shows usage of multi label switch
	public static void fruitVeg() {
		
		System.out.print("Input fruit or vege: ");
		String st = sc.nextLine();
		
		switch(st) {
		case "banana":
		case "apple":
		case "kiwi":
		case "cherry":
		case "lemon":
		case "grapes":
			System.out.print("It's a fruit");
			break;
		case "cucmber":
		case "pepper":
		case "carrot":
			System.out.print("It's a vege");
			break;
		default:
			System.out.print("Unknown");
			break;

		}

	}
	
	//using switch to display day no as day name
	public static void day2Name() {
		System.out.print("Input day number: ");
		int dayno = sc.nextInt();
		
		switch(dayno) {
			case 1: 		System.out.print("Monday");
							break;
			case 2:			System.out.print("Tuesday");
							break;
			case 3:			System.out.print("Wednesday");
							break;
			case 4:			System.out.print("Thursday");
							break;
			case 5: 		System.out.print("Friday");
							break;
			case 6:			System.out.print("Saturday");
							break;
			case 7:			System.out.print("Sunday");
							break;
			default:		System.out.print("Error");
							break;

		}
	}
	//using if to sort vowel or consonant
	public static void vowelConsonant() {
		System.out.print("Enter a character: ");
		char ch = sc.nextLine().charAt(0);
		int chInt=ch;
		ch= Character.toLowerCase(ch);
		if(ch == 'a'|| ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u')
			System.out.print("Vowel");
		else if(chInt>=65&&chInt<=122)
			System.out.print("Consonant");
		else
			System.out.print("Not an alphabet");
	}
	
	//using if to calculate the sign of the product of 3 number
	public static void prodNoSign() {
		System.out.print("Enter value number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter value number 2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter value number 3: ");
		int num3 = sc.nextInt();
		
		if(num1==0||num2==0||num3==0)
			System.out.print("Zilch");
		else {
			int negativeCount=0;
			if(num1<0)
				negativeCount++;
			if(num2<0)
				negativeCount++;
			if(num3<0)
				negativeCount++;
			if(negativeCount%2==0)
				System.out.print("Positive");
			else
				System.out.print("Negative");
			}
	}
	
	//shows what sort is the inputted numbers
	public static void numberWhatSort() {
		System.out.print("Enter value number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter value number 2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter value number 3: ");
		int num3 = sc.nextInt();
		
		if(num1<num2&&num2<num3)
			System.out.print("Ascending");
		else if (num3<num2&&num2<num1)
			System.out.print("Descending");
		else
			System.out.print("Not Sorted");
	}
	
	//calculate price of movie tickets, refer slide 288
	public static void cinemaTicket() {
		
		System.out.print("Enter movie type: 1)Premiere 2)Normal 3)Discount \n");
		int type = sc.nextInt();
		System.out.print("Enter amount of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter amount of seats per row: ");
		int seat = sc.nextInt();
		
		double totalprice=0;
		switch(type) {
			case 1: totalprice= (seat*row)*12.00;
					break;
			case 2: totalprice = (seat*row)*7.50;
					break;
			case 3: totalprice = (seat*row)*5.00;
					break;
			default: System.out.print("Invalid type");
					break;
		}
		System.out.printf("Total price of the tickets is: %.2f",totalprice);
	}
	
	//evaluate operations based on numbers and operator inputted
	public static void numOp() {
		System.out.print("Enter value number 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter value number 2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter operator: ");
		char chOp = sc.next().charAt(0);
		
		double total=0.0;
		
		switch(chOp) {
		
		case '+': 	total = num1 + num2;
					System.out.printf("%.2f + %.2f = %.2f",num1,num2,total);
					break;
		
		case '-':	total = num1 - num2;
					System.out.printf("%.2f - %.2f = %.2f",num1,num2,total);
					break;
		
		case '*':	total = num1 * num2;
					System.out.printf("%.2f * %.2f = %.2f",num1,num2,total);
					break;
					
		case '/':	total= num1/num2;
					System.out.printf("%.2f / %.2f = %.2f",num1,num2,total);
					break;
					
		case '%': 	total= num1%num2;
					System.out.printf("%.2f %% %.2f = %.2f",num1,num2,total);
					break;
					
		default:	System.out.println("no operator input");
					break;
		}
	}
	
	//simple atm with balance,withdraw,limit
	public static void atm() {
		System.out.print("Enter balance amount: ");
		int balance = sc.nextInt();
		System.out.print("Enter withdraw amount: ");
		int withdraw = sc.nextInt();
		System.out.print("Enter limit amount: ");
		int limit = sc.nextInt();
		
		if(withdraw<balance&&withdraw<limit)
			System.out.print("Withdraw Successful");
		else if (withdraw>=limit)
			System.out.print("Exceeded withdraw limit");
		else if (withdraw>=balance)
			System.out.print("Insufficient Balance");
	}
	
	//identifies biggest among 5 input numbers
	public static void big5() {
		
		int bigNo = 0;
		for(int i=1;i<=5;i++) {
			
			System.out.printf("Enter value of integer no %d : ",i);
			int currentNo = sc.nextInt();
			if(currentNo>bigNo)
				bigNo=currentNo;
		}
		System.out.printf("The biggest number among 5 inputted number is: %d",bigNo);
	}
	
	//prints every no in decreasing order of a number
	public static void decreaseNo() {
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int i = 0;
		while(i < n) {
			System.out.println(n-i);
			i++;
		}
	}
	
	//method requires input that is within 1...100, will only stop when input is in range
	public static void numRange() {
		
		System.out.print("Enter a number (1 ->100): ");
		int num = sc.nextInt();
		
		while(num <1 || num >100) {
			System.out.println("Invalid Number!!");
			System.out.print("Enter a number: ");
			num = sc.nextInt();
		}
		System.out.println("\nVALID!");
		System.out.println(num);
	}
}
