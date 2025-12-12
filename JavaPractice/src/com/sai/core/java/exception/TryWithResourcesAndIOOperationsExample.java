package com.sai.core.java.exception;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.sai.corejava.Employee;
import com.sai.corejava.EmployeeService;

public class TryWithResourcesAndIOOperationsExample {

	public static void main(String[] args) {

		try {
			byteOrientationStream();
			characterOrentationStream();
			byteOrientationStreamObject();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void byteOrientationStream() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("byteexamplein.txt");
		FileOutputStream fow = new FileOutputStream("byteexampleout.txt");

		BufferedInputStream read = new BufferedInputStream(fis);
		BufferedOutputStream write = new BufferedOutputStream(fow);

		try {
			try (fis; fow; read; write) {

				int line;

				while ((line = read.read()) != -1) {

					write.write(line);

				}

				System.out.println("byteOrientationStream File Writing Completed !!");

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {

			System.out.println("byteOrientationStream File Writing completed exampleout.txt is the file data !!!!!!!!");
		}

	}

	public static void characterOrentationStream() throws IOException {

		FileReader fr = new FileReader("charexamplein.txt");
		FileWriter fw = new FileWriter("charexampleout.txt");
		BufferedReader reader = new BufferedReader(fr);
		BufferedWriter writer = new BufferedWriter(fw);

		// Before Java 9
		// try (FileReader fr = new FileReader("example.txt"); BufferedReader reader =
		// new BufferedReader(fr);) {

		// Java 9
		try (fr; reader; fw; writer) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.append(line);
				writer.newLine();

			}
			System.out.println("characterOrentationStream File Writing Completed !!");
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}

		finally {

			System.out.println(
					"characterOrentationStream File Writing completed exampleout.txt is the file data !!!!!!!!");
		}
	}

	public static void byteOrientationStreamObject() throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("byteexampleobject.txt", false);
		ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);

		// Before Java 9
		// try (FileReader fr = new FileReader("example.txt"); BufferedReader reader =
		// new BufferedReader(fr);) {

		// Java 9
		try (fileOutputStream; objOutputStream) {

			List<Employee> allEmployees = EmployeeService.getAllEmployees();
			objOutputStream.writeObject(allEmployees);

			System.out.println("characterOrentationStream File Writing Completed !!");
		} catch (Exception e) {
			System.err.println("Error reading file: " + e.getMessage());
		}

		finally {

			System.out.println(
					"characterOrentationStream File Writing completed exampleout.txt is the file data !!!!!!!!");
		}

		FileInputStream fileInputputStream = new FileInputStream("byteexampleobject.txt");
		ObjectInputStream objInputStream = new ObjectInputStream(fileInputputStream);

		try (fileInputputStream; objInputStream) {
			Object obj = objInputStream.readObject();

			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}