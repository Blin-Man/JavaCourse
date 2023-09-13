package day3;

import java.util.Scanner;

public class CharacterUnicode {
	public static void main(String[] args) {
		
		char cha ='a';
		System.out.printf("The code of |%c| is  %d%n",cha,(int)cha);
		char chA ='A';
		System.out.printf("The code of |%c| is  %d%n",chA,(int)chA);
		
		int a = 5;
		int b = 6;
		
		//System.out.println(a<b);
		//System.out.println(a>29);
		
		String d = "Ali";
		String c = "ali";
		System.out.println(c.equals(d));
		String dc = "Softuni";
		//substring (array no of the string)
		String cd = "#Softuni".substring(1);
		System.out.println(dc.equals(cd));
		System.out.println(dc == cd);
		
		//charLiteral();
		//unicodeFinder();
		//reverseChar();
		//concatName();
		//modBig();
		//condStateDemo();
	}
	//Reads the input and gives the unicode value
	public static void unicodeFinder() {
		System.out.printf("Input a character:");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.printf("The code of |%c| is  %d%n",ch,(int)ch);
	}
	
	//This method takes 3 input (characters), outputs them in one line, in reverse order with respective unicode value
	public static void reverseChar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input first character: ");
		char firstChar = sc.nextLine().charAt(0);
		System.out.printf("Input second character: ");
		char secondChar = sc.nextLine().charAt(0);
		System.out.printf("Input third character: ");
		char thirdChar = sc.nextLine().charAt(0);
		
		System.out.printf("%c %c %c " + '\n',thirdChar,secondChar,firstChar);
		System.out.printf("%d %d %d", (int)thirdChar,(int)secondChar,(int)firstChar);
	}
	
	public static void charLiteral() {
		char symbol = '\u006F';
		System.out.println(symbol);
	}
	//Method that combines strings
	public static void concatName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first name:");
		String firstName = sc.nextLine();
		System.out.println("Insert middle name:");
		String middle = sc.nextLine();
		System.out.println("Insert last name:");
		String secondName = sc.nextLine();
		System.out.printf("Insert your age:");
		int age = Integer.parseInt(sc.nextLine());
		
		String fullname = String.format("%s %s %s ", firstName,middle,secondName);
		System.out.printf("Your full name is %s."+ '\n',fullname);
		System.out.printf("Your age is %d years old",age);

	}
	
	//method that demo how to use mod % to single out digits of a number
	public static void modBig() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a value:");
		int value = Integer.parseInt(sc.nextLine());
		//obtain last digit of a num
		System.out.printf("Last digit is %d" + '\n', value%10);
		//obtain second last digit of a num
		//value=value%100;
		//value= value/10;
		System.out.printf("Second last digit is %d" + '\n', value%100/10);
	}
	
	public static void condStateDemo() {
		
		System.out.println("Insert a value:");
		Scanner sc = new Scanner(System.in);
		int humidity = Integer.parseInt(sc.nextLine());
		
		if(humidity>90) {
			System.out.println("It's wet");
		}else {
			System.out.println("Can be dry");
		}
		
		
			
		
	}
}
