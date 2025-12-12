package com.sai.corejava;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		// How to Create Optional object and types
		
		ArrayList<String> al = new ArrayList<String>();
		String str =null;
		
		al.add("cat");
		al.add("apple");
		al.add("ball");
		//al=null;
		//create empty optional object
		//Optional<ArrayList<String>> opt = Optional.empty();
		
		//if the object is not null the use othere wise throws nullpointer
		//Optional<ArrayList<String>> opt1 = Optional.of(al);
		
		//If object is null then return empty or return Optional object
		Optional<ArrayList<String>> opt2 = Optional.ofNullable(al);
		//Optional<String> opt2 = Optional.ofNullable(str);		
		//System.out.println(opt2);
		
		
		// get object from the optional object 
		//System.out.println(opt2.get());
		
		
		
		// filter
		//ifPresent
		
		opt2.filter(c -> c.contains("cat")).ifPresent(l -> System.out.println(l));
		
		//isPresent()
	boolean ispresent	= opt2.filter(c -> c.contains("cat")).isPresent();
	
	if(ispresent)
	System.out.println("cat is present");
	else
		System.out.println("cat not present");
		
		//map()
	System.out.println("map()");
	System.out.println(opt2.filter(c -> c.contains("cat")).map(m -> "Cat is present in the List from map").get());
	System.out.println();
	
	//orElse()
	System.out.println("orElse()");
	System.out.println(opt2.filter(l -> l.contains("ball")).map(k -> "The ball is present in the List").orElse("The ball is Not present in the List"));
	System.out.println();
	
	//orElseGet()
	System.out.println("orElseGet()");
	System.out.println(opt2.filter(l -> l.contains("bal")).map(k -> "The ball is present in the List").orElseGet(() -> getDefault()));
	System.out.println();
	
	
	//orElseThrow()
	System.out.println("orElseThrow()");
	System.out.println(opt2.filter(l -> l.contains("ball")).map(k -> "The ball is present in the List").orElseThrow());
	System.out.println();
	
	
	//ifPresentOrElse()
	System.out.println("ifPresentOrElse()");
	opt2.filter(l -> l.contains("ball")).ifPresentOrElse(r ->{System.out.println("The ball is present in the List");}, () -> {System.out.println("The ball is Not present in the List");});
	System.out.println();
	}
	
public static String getDefault() {
		
		return "Default Method String";
	}
}
