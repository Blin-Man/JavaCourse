package day3;

import java.util.Scanner;

public class CharacterUnicode {
	public static void main(String[] args) {
		
		char cha ='a';
		System.out.printf("The code of |%c| is  %d%n",cha,(int)cha);
		char chA ='A';
		System.out.printf("The code of |%c| is  %d%n",chA,(int)chA);
		
		charLiteral();
		//unicodeFinder();
		//reverseChar();
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
}
