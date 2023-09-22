package day7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * System.out.println("Input things to add to an arraylist: "); String things =
		 * sc.nextLine();
		 * 
		 * List<String> list_strings =
		 * Arrays.stream(things.split(" ")).collect(Collectors.toList());
		 * 
		 * List<Integer>nums = new ArrayList<>();
		 * 
		 * for(int i = 0; i<list_strings.size();i++)
		 * nums.add(Integer.parseInt(list_strings.get(i)));
		 * 
		 * System.out.println(list_strings); Collections.shuffle(list_strings);
		 * System.out.println(list_strings);
		 */
		// linkedListSwap();
		// linkedListJoin();
//		hashMapIterate();
//		treeMapCount();
//		wordSynonym();
//		streamAPI();
//		wordFilter();
//		sortLarge3();
//		randWord();
//		bigFactor();

		BigDecimal initialAmount = new BigDecimal(sc.next()); 
		BigDecimal interestRate = new BigDecimal(sc.next());
		BigDecimal hundred = new BigDecimal(100); 
		BigDecimal total = initialAmount.add(
		initialAmount.multiply(interestRate.divide(hundred)));
		// total = initialAmount + (initialAmount * (interestRate / 100))
		System.out.println(total);
	}

	private static String repeatStr(String str, int length) {
		String replacement = "";
		for (int i = 0; i < length; i++) {
			replacement += str;
		}
		return replacement;
	}

	public static void linkedListSwap() {
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");
		System.out.println("The Original linked list: " + l_list);
		Collections.swap(l_list, 0, 2);
		System.out.println("The New linked list after swap: " + l_list);
	}

	public static void linkedListJoin() {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Ali");
		c1.add("Abu");
		c1.add("Atan");
		System.out.println("List of first linked list: " + c1);
		LinkedList<String> c2 = new LinkedList<String>();
		c2.add("test");
		c2.add("vain");
		System.out.println("List of second linked list:" + c2);
		LinkedList<String> a = new LinkedList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New linked list: " + a);
	}

	public static void hashMapIterate() {
		Map<String, Double> fruits = new LinkedHashMap<>();
		fruits.put("banana", 2.20);
		fruits.put("kiwi", 4.50);
		for (Map.Entry<String, Double> entry : fruits.entrySet()) {
			System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
		}
	}

	public static void treeMapCount() {

		double[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		Map<Double, Integer> counts = new TreeMap<>();

		for (double num : nums) {
			if (!counts.containsKey(num))
				counts.put(num, 0);
			counts.put(num, counts.get(num) + 1);
		}

		for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}
	}

	public static void wordSynonym() {

		int n = Integer.parseInt(sc.nextLine());
		Map<String, ArrayList<String>> words = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();
			String synonym = sc.nextLine();
			words.putIfAbsent(word, new ArrayList<>());
			words.get(word).add(synonym);
		}
		for (Entry<String, ArrayList<String>> entry : words.entrySet()) {
			System.out.printf("%s -> %s" + "\n", entry.getKey(), entry.getValue());
		}
	}

	public static void streamAPI() {
		int min = Arrays.stream(new int[] { 15, 25, 35 }).min().getAsInt();
		System.out.println(min + " min()");
		// if no value in array, prints whatever is in orElse(here)
		int minElse = Arrays.stream(new int[] { 15, 25, 35 }).min().orElse(2);
		System.out.println(minElse + " orElse()");

		int max = Arrays.stream(new int[] { 15, 25, 35 }).max().getAsInt();
		System.out.println(max + " max()");

		int sum = Arrays.stream(new int[] { 15, 25, 35 }).sum();
		System.out.println(sum + " sum()");

		double avg = Arrays.stream(new int[] { 15, 25, 35 }).average().getAsDouble();
		System.out.println(avg + " average()\n");

		// In array perspective
		ArrayList<Integer> nums = new ArrayList<>() {
			{
				add(15);
				add(25);
				add(35);
			}
		};
		int minArr = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println(minArr + " Array min()");
		// alternative way, if value is of same datatype
		int minArr2 = nums.stream().min(Integer::compareTo).get();
		System.out.println(minArr2 + " Array min(), alternative");

		int maxArr = nums.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(maxArr + " Array max()");
		// alternative way, if value is of same datatype
		int maxArr2 = nums.stream().max(Integer::compareTo).get();
		System.out.println(maxArr2 + " Array max(), alternative");

		int sumArr = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumArr + " Array sum()");

		double avgArr = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avgArr + " Array average()\n");

		// maps string input {because of nextLine()} into integer via mapToInt with
		// Integer.parseInt
		int[] numsArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		System.out.println(Arrays.toString(numsArr) + " Array, mapped string{nextLine()} into int ");

		String[] words = { "abc", "def", "geh", "yyy" };
		words = Arrays.stream(words).map(w -> w + "yyy").toArray(String[]::new);
		System.out.println(Arrays.toString(words) + "  mapped yyy to each element");

	}

	// filters only words that are even, prints it out
	public static void wordFilter() {
		String[] words = Arrays.stream(sc.nextLine().split(" ")).filter(w -> w.length() % 2 == 0)
				.toArray(String[]::new);
		for (String word : words) {
			System.out.println(word);
		}

	}

	// sorts the value of an array, then shows the largest 3 number in a string of
	// numbers
	public static void sortLarge3() {
		List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e))
				.sorted((n1, n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());
		for (int num : nums) {
			System.out.print(num + " ");
		}
		// prints the whole list value
		System.out.println("\n" + nums.toString());
	}

	// randomize order of words
	public static void randWord() {

		String[] words = sc.nextLine().split(" ");
		Random rnd = new Random();
		for (int pos1 = 0; pos1 < words.length; pos1++) {
			int pos2 = rnd.nextInt(words.length);
			String temp = words[pos1];
			words[pos1] = words[pos2];
			words[pos2] = temp;
		}
		System.out.println(String.join(System.lineSeparator(), words));

	}

	public static void bigFactor() {

		int n = Integer.parseInt(sc.nextLine());
		BigInteger f = new BigInteger(String.valueOf(1));
		for (int i = 1; i <= n; i++) {
			f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
		}
		System.out.println(f);

	}
}
