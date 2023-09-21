package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		String line = "start";

		while (!line.equals("end")) {
			System.out.println("Input first name, last name, age and city respectively: ");
			String[] input = sc.nextLine().split(" ");
			if(input.equals("end")|| input.length!=4) {
				line="end";
				continue;
			}
			String firstName = input[0];
			String lastName = input[1];
			int age = Integer.parseInt(input[2]);
			String city = input[3];

			Student existingStudent = getStudent(students, firstName, lastName);
			if (existingStudent != null) {
				existingStudent.setAge(age);
				existingStudent.setCity(city);
				System.out.println("age n city set");
			} else {
				Student student = new Student(firstName, lastName, age, city);
				students.add(student);
				System.out.println("added student");
			}
			//System.out.println("type end to end program");
			
		}
		//System.out.println(students.toString());
		System.out.print("Input a city to find students:");
		String city = sc.nextLine();
		for(Student s: students) {
			if(s.getCity().equals(city))
				System.out.println(s);
		}
		/*
		 * for(int i = 0; i< students.size();i++) { System.out.println(
		 * students.get(i).toString()); }
		 */
	}

	static Student getStudent(List<Student> students, String firstName, String lastName) {
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
				return student;
		}
		return null;
	}

}
