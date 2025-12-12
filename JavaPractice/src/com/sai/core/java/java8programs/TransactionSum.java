package com.sai.core.java.java8programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sai.corejava.Transaction;

public class TransactionSum {
 
	public static void main(String[] args) throws ParseException {
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse("12-10-2011"); // for example, today's date
		Date d2 = df.parse("01-01-1900");
		Date d3 = df.parse("01-01-1900");
		Date d4 = df.parse("12-10-2011");
		Date d5 = df.parse("13-12-2018");
		Date d6 = df.parse("13-12-2018");
		
		List<Transaction> transactionList = Arrays.asList(
				
				new Transaction(101,d1, 34568.456),
				new Transaction(102,d2, 76543.456),
				new Transaction(102,d3, 98765.456),
				new Transaction(101,d4, 23456.456),
				new Transaction(105,d5, 765443.456),		
				new Transaction(105,d6, 345678.456)				
				);
		
		
		Map<Integer, Double> collect = transactionList.stream()
		.collect(Collectors.groupingBy(Transaction::getTransactionDate,
				Collectors.summingDouble(Transaction::getTransactionAmount)));
		
		
		collect.forEach((t, u) -> {
			
			System.out.println("Date is:  " +t + "  Amount is: " +u);
			
			
			});
		
		
	}
	
	
}
