package com.sai.core.java.builder.collectors;

import java.util.Arrays;
import java.util.List;

public class Person {
    String name;
    String city;
    int age;

    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
        
}


class Test{

static List<Person> people = Arrays.asList(
    new Person("Alice", "New York", 28),
    new Person("Bob", "London", 35),
    new Person("Charlie", "New York", 40),
    new Person("David", "London", 35),
    new Person("Eve", "Tokyo", 28),
    new Person("Sai", "Tokyo", 34)
);

}