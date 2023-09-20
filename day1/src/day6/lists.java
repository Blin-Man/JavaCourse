package day6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class lists {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrayList();
		// listMaker();
		// sumAdjNum();
		// gaussTrick();
		// mergeList();
		// sortList();
		/*
		 * System.out.print("Input a number:"); signFinder(sc.nextInt());
		 */
		// trianglePrinter(sc.nextInt());
		// System.out.println(rectArea(sc.nextInt(),sc.nextInt()));
		// System.out.println(stringPrinter(sc.nextLine(), sc.nextInt()));
		//System.out.println(mathPow(sc.nextInt(), sc.nextInt()));
		/*
		 * int []numRef = {5}; incrementRef(numRef, 15); System.out.println(numRef[0]);
		 * 
		 * int numVal =5; incrementVal(numVal, 15); System.out.println(numVal);
		 */
			
		/*
		 * System.out.println("Input a number: "); int input = Math.abs(sc.nextInt());
		 * System.out.println(getMultipleEvenOdd(getSumEven(input), getSumOdd(input)));
		 */
			ListConst listTest1 = new ListConst("test1",123);
			ListConst listTest2 = new ListConst("test2",321);
			listTest1.displaylist();
			listTest2.displaylist();
            }

	public static void arrayList() {

		List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		nums.remove(2);
		nums.remove(Integer.valueOf(40));
		nums.add(100);
		nums.add(0, -100);
		// adsasd
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
	}

	public static void listMaker() {
		System.out.print("Insert a line of numbers: ");
		String values = sc.nextLine();

		List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < items.size(); i++)
			nums.add(Integer.parseInt(items.get(i)));
		// List<Integer> items = Arrays.stream(values.split("
		// ")).map(Integer::parseInt).collect(Collectors.toList());
		for (int index = 0; index < nums.size(); index++) {
			System.out.printf("arr[%d] = %s%n", index, nums.get(index));
		}
		System.out.println(String.join("; ", items));
	}

	public static void sumAdjNum() {
		System.out.println("Insert a line of numbers: ");
		List<Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble)
				.collect(Collectors.toList());

		for (int i = 0; i < numbers.size() - 1; i++)
			if (numbers.get(i).equals(numbers.get(i + 1))) {
				numbers.set(i, numbers.get(i) + numbers.get(i + 1));
				numbers.remove(i + 1);
				i = -1;
			}

		String output = joinElementsByDelimiter(numbers, " ");
		System.out.println(output);

	}

	static String joinElementsByDelimiter(List<Double> items, String delimiter) {
		String output = " ";
		for (Double item : items)
			output += (new DecimalFormat("0.#").format(item) + delimiter);
		return output;
	}

	public static void gaussTrick() {
		System.out.println("Input a line of numbers: ");
		List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		int size = numbers.size();

		for (int i = 0; i < size / 2; i++) {
			numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
			numbers.remove(numbers.size() - 1);
		}
		System.out.println(numbers.toString().replaceAll("[\\[\\],]", " "));
	}

	public static void mergeList() {
		System.out.println("Input first line of numbers: ");
		List<Integer> num1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println("Input second line of numbers: ");
		List<Integer> num2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> resultNum = new ArrayList<>();

		for (int i = 0; i < Math.min(num1.size(), num2.size()); i++) {
			resultNum.add(num1.get(i));
			resultNum.add(num2.get(i));
		}

		if (num1.size() > num2.size())
			resultNum.addAll(getRemainingElements(num1, num2));
		else if (num2.size() > num1.size())
			resultNum.addAll(getRemainingElements(num2, num1));
		System.out.println(resultNum.toString().replaceAll("[\\[\\],]", ""));
	}

	public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
		List<Integer> nums = new ArrayList<>();
		for (int i = shorterList.size(); i < longerList.size(); i++)
			nums.add(longerList.get(i));
		return nums;
	}

	public static void sortList() {
		List<String> names = new ArrayList<>(Arrays.asList("Peter", "John", "Mary", "Nicholas", "Patrick"));
		Collections.sort(names);
		System.out.println(String.join(",", names));

		Collections.sort(names);
		Collections.reverse(names);
		System.out.println(String.join(",", names));
	}

	public static void signFinder(int number) {
		if (number > 0) {
			System.out.printf("\n%d is a positive number", number);
		} else if (number < 0) {
			System.out.printf("\n%d is a negative number", number);
		} else
			System.out.printf("\n%d is zilch, nada, zero", number);
	}

	public static void trianglePrinter(int n) {
		for (int line = 1; line <= n; line++)
			printLine(1, line);
		for (int line = n - 1; line >= 1; line--)
			printLine(1, line);
	}

	public static void printLine(int start, int end) {
		for (int i = start; i <= end; i++)
			System.out.print(i + " ");

		System.out.println();
	}

	public static double rectArea(double height, double length) {
		return (height * length);
	}

	public static String stringPrinter(String str, int cycle) {
		String result = "";
		for (int i = 0; i < cycle; i++)
			result += str + " ";
		return result;
	}

	public static int mathPow(int number, int pow) {
		int result = 1;
		for (int i = 0; i < pow; i++) {
			result *= number;
		}
		return result;
	}

	public static void incrementVal(int num, int value) {
		num += value;
	}

	public static void incrementRef(int[] nums, int value) {
		nums[0] += value;
	}

	//overloading getMax
	public static int getMax(int num1,int num2) {
		if (num1>num2)
			return num1;
		return num2;
	}
	
	public static String getMax(String str1,String str2) {
		if(str1.compareTo(str2)>0)
			return str1;
		else
			return str2;
	}
	
	public static char getMax(char ch1,char ch2) {
		if(ch1>ch2)
			return ch1;
		else
			return ch2;
	}
	
	public static int getMultipleEvenOdd(int even, int odd) {
		return even*odd;
	}
	
	public static int getSumEven(int num) {
		int sum=0;
		int val = 0;
		while(num!=0) {
			
			//System.out.println(num);
			val=num%10;
		//	System.out.println(num);
			if(val%2==0) {
				sum+=val;
			//	System.out.println("if"+sum);
			}
			num/=10;
			//System.out.println("while"+sum);
			
		}
		return sum;
	}
	
	public static int getSumOdd(int num) {
		int sum = 0;
		int val = 0;
		
		while(num!=0) {
			val=num%10;
			//System.out.println(num);
			if(val%2!=0) {
				sum+=val;
				//System.out.println("if"+sum);
			}
			num/=10;
			//System.out.println("while"+sum);
		}
		return sum;
	}
}
