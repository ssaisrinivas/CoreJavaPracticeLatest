package com.sai.core.java.builder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestBuilder {

	public static void main(String[] args) {

		User user1 = User.builder().firstName("John").lastName("Doe").build();

		System.out.println(user1.getFirstName());

//Create a User with all optional fields
		User user2 = User.builder().firstName("Jane").lastName("Smith").age(25).phone("555-1234").address("123 Main St")
				.build();

//The builder can also be used to create an object step-by-step
		User.Builder userBuilder = User.builder();
		userBuilder.firstName("Peter");
		userBuilder.lastName("Jones");
		User user3 = userBuilder.build();

		// Product Buildr Test
		ProductBuilder productBuilde = ProductBuilder.builder().name("Iphone").description("Iphone 14").build();
		System.out.println(productBuilde.getName());
		System.out.println(productBuilde.getDescription());

		List<Integer> list1 = Arrays.asList(90, 20, 40, 80, 80, 90, 20, 20, 20, 20);
		Integer[]  array = new  Integer[] {90, 20, 40, 80, 80, 90, 20, 20, 20, 20};
		List<Integer> list2 = List.of(90, 20, 40, 80);
		List<Integer> list3 = Collections.singletonList(90);

		Set<String> uniqueItems = new HashSet<>();
		Set<Integer> uniqueList = new HashSet<>();
		uniqueItems.add("Item A");
		uniqueItems.add("Item B");

		Map<String, String> myMap = new HashMap<>();
		myMap.put("key1", "apple");
		myMap.put("key2", "banana");
		myMap.put("key8", "banana");
		myMap.put("key3", "apple");
		myMap.put("key4", "orange");
		myMap.put("key9", "orange");
		myMap.put("key7", "banana");
		myMap.put("key6", "apple");
		myMap.put("key10", "apple");

		Map<Integer, Long> collect = list1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
		Map<String, Long> collect2 = myMap.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		Map<String, Long> collect3 = collect2.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
		System.out.println(collect3);
		
		
		Map<Integer, Long> collect4 = Stream.of(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect4);
	}

}