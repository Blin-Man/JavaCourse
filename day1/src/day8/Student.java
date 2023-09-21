package day8;

import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String city;
	private int age;

	public Student(String firstName, String lastName,int age, String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
        return this.firstName +" "+ this.lastName + " is " + this.age + " years old" ;
    }
	

}
