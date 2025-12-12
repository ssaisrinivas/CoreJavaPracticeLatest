package com.sai.core.java.programms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPrograms {

	public static void main(String[] args) {

		System.out.println(reverseString("Sai Srinivas"));
		System.out.println(stringContainsVowels("plktjdu"));
		checkPalindromeString("ABCDCBA");
		checkPalindromeString("ABCDCBA123");
		System.out.println(primeOrNot(24));
		printFibonacciSequence(20);
		System.out.println(onlyOddNumbers(List.of(97, 30, 24, 7, 20, 5, 3, 84)));
		sortMapByValue();
		distinctCharacterCount();
		System.out.println(characterSequesnceCount("aaabbbbbccccccdddddddrrrrgggggsssss"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		reverseStringandEachWordInAString("Object-oriented programming is a programming paradigm based on the concept");
	}

	static String primeOrNot(int val) {

		if (val == 0 || val == 1) {

			return "please send a valid number";
		}

		if (val == 2) {

			return "Prime Number !";
		}

		if (val % 2 == 0) {

			return "Prime Number !";
		}

		return "Not A Prime Number";
	}

	public static boolean stringContainsVowels(String str) {

		return str.toLowerCase().matches(".*[aeiou].*");

	}

	public static String reverseString(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Using String Builder : " + sb);

		String str1 = "";

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

			str1 = str1 + charArray[i];

		}

		return str1;
	}

	static void printFibonacciSequence(int digit) {

		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 0; i <= digit; i++) {

			System.out.print(a + ", ");

			a = b;
			b = c;
			c = a + b;

		}

	}

	public static List<Integer> onlyOddNumbers(List<Integer> list) {
		System.out.println();
		return list.parallelStream().filter(x -> x % 2 != 0).toList();
	}

	static void checkPalindromeString(String input) {

		StringBuilder sb = new StringBuilder(input);

		sb.reverse();

		if (input.equalsIgnoreCase(sb.toString())) {
			System.out.println("Palindrom String");
		} else {
			System.out.println("Not a Palindrom String");
		}
	}

	public static void sortMapByValue() {

		LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

		System.out.println(scores);

		Map<String, Integer> collect = scores.entrySet().stream().sorted((x, y) -> x.getValue().compareTo(y.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(collect);

	}

	public static void distinctCharacterCount() {

		String str1 = "abcdABCDabcd";

		char[] chars = str1.toCharArray();

		Map<Character, Integer> charsCount = new HashMap<>();

		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}

		System.out.println(charsCount);

	}

//"aaabbbbbccccccdddddddrrrrgggggsssss"
	public static String characterSequesnceCount(String input) {

		StringBuilder sb = new StringBuilder();

		char[] charArray = input.toCharArray();

		int count = 1;

		for (int i = 1; i < charArray.length; i++) {

			if (charArray[i] == charArray[i - 1]) {

				count++;
			}

			else {

				sb.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		sb.append(input.charAt(input.length() - 1)).append(count);
		return sb.length() < input.length() ? sb.toString() : input;
	}

	// "abcabcbb"
	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0, start = 0;
		Map<Character, Integer> charIndexMap = new HashMap<>();
		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (charIndexMap.containsKey(c)) {
				start = Math.max(start, charIndexMap.get(c) + 1);
			}
			charIndexMap.put(c, end);
			maxLen = Math.max(maxLen, end - start + 1);
		}
		return maxLen;
	}

	// Object-oriented programming is a programming paradigm based on the concept
	public static void reverseStringandEachWordInAString(String str) {

		String[] splitStrings = str.split("\s");
		
		System.out.println(splitStrings.length);
		
		String stringArray = "";

		for (int i = splitStrings.length - 1; i >= 0; i--) {

			char[] charSequence = splitStrings[i].toCharArray();

			for (int j = charSequence.length - 1; j >= 0; j--) {

				stringArray = stringArray + charSequence[j];
			}
			stringArray = stringArray + " ";
		}

		System.out.println(stringArray);
	}

}
