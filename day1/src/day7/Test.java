package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Input things to add to an arraylist: ");
		String things = sc.nextLine();
		
		List<String> list_strings = Arrays.stream(things.split(" ")).collect(Collectors.toList());
		
		List<Integer>nums = new ArrayList<>();
		
		for(int i = 0; i<list_strings.size();i++)
			nums.add(Integer.parseInt(list_strings.get(i)));
		
		System.out.println(list_strings);
		Collections.shuffle(list_strings);
		System.out.println(list_strings);
		
		

	}

}
