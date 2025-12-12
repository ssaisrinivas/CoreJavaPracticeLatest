package com.sai.core.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersinString {
	
	public static void findDuplicateCharacters(String str) {
		// Create a HashMap to store character counts
		HashMap<Character, Integer> charCounts = new HashMap<>();

		// Convert the string to a character array for easier iteration
		char[] charArray = str.toCharArray();

		// Iterate through the character array and update counts
		for (char c : charArray) {
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}

		// Iterate through the HashMap to find and print duplicate characters
		System.out.println("Duplicate characters in \"" + str + "\":");
		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateCharacters("programming"); // Example usage
		findDuplicateCharacters("hello world");
		findDuplicateCharacters("java");
	}
}
