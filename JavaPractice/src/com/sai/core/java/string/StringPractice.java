package com.sai.core.java.string;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		// String
		String str2 = "Sai Srinivas";
		String str1 = new String("Sai Srinivas");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode());
		System.out.println();
		str2 = " Sammeta";
		System.out.println(str2.hashCode());
		str2 = " Mukkollu";
		System.out.println(str2.hashCode());
		
		System.out.println();

		// StringBuilder
		StringBuilder sb = new StringBuilder("String");
		System.out.println(sb.hashCode());
		sb.append("Builder");
		System.out.println(sb.hashCode());
		System.out.println();

		// StringBuffer
		StringBuffer sbf = new StringBuffer("String");
		System.out.println(sbf.hashCode());
		sbf.append("Buffer");
		System.out.println(sbf.hashCode());
		System.out.println();

		// StringTokenizer
		StringTokenizer st = new StringTokenizer("Durga Software Solutions");

		System.out.println(st.countTokens());
		Iterator<Object> asIterator = st.asIterator();

		System.out.println();
		while (asIterator.hasNext()) {
			System.out.println(asIterator.next());
		}
		System.out.println();

		StringTokenizer st1 = new StringTokenizer("Sai Srinivas Sammeta");

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println();
		StringTokenizer st2 = new StringTokenizer("Rambabu Nagalakshmi Sammeta");

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		String sample = "D:\\Eclipse-23-24\\SpringBoot\\EmbarkX\\JavaPractice\\src\\com\\sai\\core\\java\\string\\StringPractice.java";
		
		StringTokenizer st3 = new StringTokenizer(sample,"\\");

		System.out.println();

		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println();
		
		
		// String Methods 
		
		String str = new String("Rambabu Nagalakshmi Sammeta ");
		
		System.out.println(str.length());
		String str3=str.concat(str1);
		System.out.println(str3);
		
		String str4 = "Sai Srinivas";
		String str5 = "Sai Srinivas";
		String str6 = "SAI SRINIVAS";
		
		System.out.println(str4.equals(str5));
		System.out.println(str4.equalsIgnoreCase(str6));
		System.out.println(str4.startsWith("S"));
		System.out.println(str4.endsWith("s"));
		System.out.println(str4.contains("Sai"));
		System.out.println(str4.replace("Sai","sai"));
		System.out.println(str4.charAt(0));
		System.out.println(str4.indexOf("Sai"));
		System.out.println(str4.lastIndexOf("as"));
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.print(b +" ");
		}
		
		char[] charArray = str.toCharArray();
		System.out.println();
		System.out.println(charArray.length);
		for (char c : charArray) {
			
			System.out.print(c +" ");
		}
		System.out.println();
		String[] splitWithDelimiters = sample.split("\\\\",sample.length()-1);
		System.out.println();
		System.out.println(splitWithDelimiters.length);
		for (String strv : splitWithDelimiters) {
			
			System.out.print(strv +" ");
		}
		System.out.println();
		String str7 =" sai srinivas ";
		System.out.println(str7.trim());
		
		System.out.println(str6.toLowerCase() + "  "+ str6);
		System.out.println(str5.toUpperCase() + "  "+ str5);
		
		//StringBuffer
		
		StringBuffer sb1 = new StringBuffer("Durga Software Solutions ");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb1.delete(0, 5));
		System.out.println(sb1.insert(sb1.length(),"Sai"));
		
		
		
		
	}
	

	

}
