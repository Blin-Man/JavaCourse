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
		
		byte i = 100;

		// Automatic type conversion
		// Integer to long type
		float l = i;

		// Automatic type conversion
		// long to float type
		double f = l;

		// Print and display commands
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		
		//charLiteral();
		//unicodeFinder();
		//reverseChar();
		//concatName();
		//modBig();
		//condStateDemo();
		//freezeWeather();
		//numberCheck();
		//condElseIf();
		//covfefe();
		//validTriangle();
		//postPreFix();
		//sumNumber();
		loopnum7();
		
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
	public static void freezeWeather() {
		
		Scanner sc = new Scanner (System.in);
		double temp = sc.nextDouble();
		
		if(temp <-0) 
			System.out.println("It's freezing time");
		//System.out.println("It's freezing time again?");
		else System.out.println("It's not freezing time ");
		System.out.println("It's morbin time"+'\n');
		
		int num = sc.nextInt();
		if(num %2 == 0) {
			System.out.println("even steven");
		}else {
			System.out.println("odd jarod");
		}
	}
	//outputs number as words, only 1...9
	public static void numberCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a value:");
		int val = sc.nextInt();
		
		if(val<10 && val>0) {
			if(val==9)
				System.out.println("NINE");
			else if(val==8)
				System.out.println("EIGHT");
			else if(val==7)
				System.out.println("SEVEN");
			else if(val==6)
				System.out.println("SIX");
			else if(val==5)
				System.out.println("FIVE");
			else if(val==4)
				System.out.println("FOUR");
			else if(val==3)
				System.out.println("THREE");
			else if(val==2)
				System.out.println("TWO");
			else if(val==1)
				System.out.println("ONE");
		}else
			System.out.println("It's not in the range of 1 ... 9");
	}
	
	public static void condElseIf() {
		Scanner sc = new Scanner(System.in);
		/*String pass = sc.nextLine();
		
		if(pass.equals("s3cr3t!"))
			System.out.println("My man");
		else
			System.out.println("Get off this program");*/
		
		//area of figure
		System.out.println("What shape is it?");
		String figure = sc.nextLine();
		double area;
		
		if(figure.equals("square")) {
			
			System.out.println("Side length? : ");
			int side = sc.nextInt();
			area = side*side;
			System.out.printf("Area of square is %.2f",area);
			
		}else if(figure.equals("rectangle")) {
			
			System.out.println("Side length? : ");
			int side = sc.nextInt();
			System.out.println("width length? : ");
			int width = sc.nextInt();
			area = side*width;
			System.out.printf("Area of rectangle is %.2f",area);
		}else if(figure.equals("circle")) {
			
			System.out.println("Radius? : ");
			int radius = sc.nextInt();
			area = 2*3.142*radius;
			System.out.printf("Area of circle is %.2f",area);
		}else
			System.out.println("Doesn't look like anything to me");
	}
	public static void covfefe() {
		Scanner sc = new Scanner(System.in);
		double price = 0;
		
		System.out.println("Coffee or tea? :");
		String drink = sc.nextLine();
		System.out.println("Sugar? :");
		String extra = sc.nextLine();
		if(drink.equals("coffee"))
			price = 1.00;
		else if(drink.equals("tea"))
			price = 0.60;
		else
			System.out.println("We got none of that");
		
		if(extra.equals("yes"))
			price+=0.40;
		System.out.printf("Final Price: %.2f",price);	
	}
	public static void validTriangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Side 1 unit: ");
		int side1 = sc.nextInt();
		System.out.println("Side 2 unit: ");
		int side2 = sc.nextInt();
		System.out.println("Side 3 unit: ");
		int side3 = sc.nextInt();
		
		if(side1+side2 <= side3 || side1+side3 <= side2 || side2+side3 <= side1)
			System.out.println("Not a valid triangle");
		else
			System.out.println("It's a valid triangle");
			
	}
	
	public static void postPreFix() {
		int a=1;
		System.out.println(--a);
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);
	}//
	
	public static void sumNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		int sum=1;
		
		for(int i=2;i<=number;i++) {
			System.out.printf("%d + %d"+'\n',sum,i);
			sum+=i;
		}
		System.out.printf("The sum of numbers pertaining to %d is %d ",number,sum);
	}
	public static void loopnum7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int n = sc.nextInt();

		for(int i = 7; i<=n;i+=10) {
			System.out.printf("%d \n",i);
		}
	}
	
	
}
