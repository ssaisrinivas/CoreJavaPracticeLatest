package com.sai.core.java.builder.collectors;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectorsExamples extends Test {

	public static void main(String[] args) throws FileNotFoundException {

		// Collectors.toList
		System.out.println();
		people.stream().collect(Collectors.toList()).forEach(System.out::println);

		// Collectors.toSet
		System.out.println();
		people.stream().map(Person::getCity).collect(Collectors.toSet()).forEach(System.out::println);

		// Collectors.toMap
		System.out.println();
		people.stream().collect(Collectors.toMap(Person::getName, Person::getAge)).entrySet().stream()
				.forEach(System.out::println);

		// Collectors.groupingBy()
		System.out.println();
		people.stream().collect(Collectors.groupingBy(Person::getCity)).entrySet().stream()
				.forEach(System.out::println);

		// Collectors.groupingBy(),downstream collector Collectors.counting()

		System.out.println();
		people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);

		// Collectors.joining()
		System.out.println();
		System.out.println(people.stream().map(Person::getName).collect(Collectors.joining(",")));

		// Collectors.summingInt()
		System.out.println();
		System.out.println(people.stream().collect(Collectors.summingInt(Person::getAge)));

		// Collectors.partitioningBy()
		System.out.println();

		people.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 30)).entrySet().stream()
				.forEach(System.out::println);

		// Collectors.collectingAndThen()
		System.out.println();

		people.stream().map(Person::getName)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList))
				.forEach(System.out::println);

				
	}

}
