package com.sai.corejava;

import java.util.Arrays;
import java.util.List;

public class ArraysPractice {

	public static void main(String[] args) {

		int[] intVal = new int[] { 10, 30, 6, 80, 2, 90, 1, 45, 0, 30, 7 };

		int[][] multiD = new int[][] { { 40, 70 }, { 20, 40 } };

		int length = intVal.length;
		System.out.println("Array Lenght: " + length);

		Arrays.stream(intVal).sorted().forEach(System.out::println);

		System.out.println();
		int max =0;
		int value=0;
		for (int i = 0; i <= multiD.length - 1; i++) {

			for (int j = 0; j <= multiD.length - 1; j++) {

				int x = multiD[i][j];
				System.out.println(x);
				max = Math.max(value,  multiD[i][j]);
				

			}
			
			value=max;
		}
		System.out.println("Maximum Value in the Matrix is :" + max);
		int index = Arrays.binarySearch(intVal, 90);

		System.out.println("This is 90 : " + index);
		System.out.println();

		List<Integer> list = Arrays.asList(10, 20, 50, 3, 80, 40, 7, 3, 70, 8);
		System.out.println("List Size :" + list.size());

		for (Integer integer : list) {
			System.out.print(integer + " " + "\s");
		}

		Arrays.parallelSort(intVal);
		System.out.println();
		for (Integer integer : intVal) {
			System.out.print(integer + " " + "\s");
			
			
		}
	}

}
