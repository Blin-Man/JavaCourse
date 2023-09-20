package day7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		HashMap <Integer,BankAccount> acct = new HashMap<>();
		boolean loop = true;
		/*
		 * System.out.print("Input car brand: "); String brand = sc.nextLine();
		 * System.out.print("Input car model: "); String model = sc.nextLine();
		 * System.out.print("Input car horsepower: "); String horsepower =
		 * sc.nextLine(); if (horsepower.equals("")) { Car kereta = new
		 * Car(brand,model); System.out.println(kereta); }else { int hp =
		 * Integer.parseInt(horsepower); Car kereta = new Car(brand,model,hp);
		 * System.out.println(kereta); }
		 */
		
		
		
		while(loop) {
			System.out.println("Input create to create an account: ");
			String []input = sc.nextLine().split(" ");
			
			switch(input[0]) {
			case "create":	BankAccount account = new BankAccount();
							count++;
							acct.put(count,account);
							System.out.printf("Account #%d created\n",count);
							break;
							
			case "deposit": double deposit =Double.parseDouble(input[2]);
							(acct.get(Integer.parseInt(input[1]))).setDeposit(deposit);
							System.out.printf("Deposited %.2f  into Account %d\n",(acct.get(Integer.parseInt(input[1]))).getDeposit(),(acct.get(Integer.parseInt(input[1])).getAccid()));
							break;
							
			case "calc-interest": deposit=(acct.get(Integer.parseInt(input[1]))).getDeposit();
								  double interest = (acct.get(Integer.parseInt(input[1])).getInterest());
								  System.out.printf("Interest: %.2f  acct%d\n", deposit,Integer.parseInt(input[1]));
								  System.out.printf("Interest: %.2f\n", deposit*interest*(Integer.parseInt(input[2])/12.00));
								  break;
								  
			case "set-interest": (acct.get(1)).setInterest(Double.parseDouble(input[1]));
								 System.out.printf("Interest set to: %.2f\n", (acct.get(1)).getInterest());
								 break;
								 
			case "end":	loop=false;
						break;
			}
		}
		
	}
	

	

}
