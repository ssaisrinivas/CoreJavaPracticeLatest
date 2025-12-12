package com.sai.core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sai.corejava.ConcreatTest;
import com.sai.corejava.Employee;
import com.sai.corejava.ProjectService;

public class Sample {

	private Sample() {

		System.out.println("From Sample Constructor !!");
	}

	public static void main(String[] args) throws InterruptedException {

		// ConcreatTest test = new ConcreatTest();

		
		  //interface Test
		  
		  InterfaceTest itest = new ConcreatTest(); ConcreatTest ctest = new
		  ConcreatTest();
		  
		  itest.intfdDefault(); System.out.println();
		  
		  System.out.println("with concreat referance"); ctest.intfdDefault();
		  
		  System.out.println(); itest.intfNormal();
		  
		  System.out.println(); System.out.println("with concreat referance");
		  ctest.intfNormal();
		  
		  System.out.println(); InterfaceTest.intfStatic(); System.out.println();
		  
		  //vars // cannot re assign access interface final variable
		  
		  System.out.println(InterfaceTest.interfaceFinalVar);
		  //itest.interfaceFinalVar =10; System.out.println();
		  
		  System.out.println(InterfaceTest.interfaceNormalVar);
		  //itest.interfaceNormalVar=10; System.out.println();
		  
		  System.out.println(InterfaceTest.interfaceStaticVar);
		  //itest.interfaceStaticVar=10; System.out.println();
		  
		 

		
		  //abstract class Test
		  
		  Abstract atest = new ConcreatTest();
		  ConcreatTest ctest1 = new ConcreatTest();
		  
		  atest.absAbstract(); System.out.println();
		  
		  System.out.println("with concreat referance"); ctest.absAbstract();
		  System.out.println();
		  
		  
		  atest.absFinal(); System.out.println();
		  
		  System.out.println("with concreat referance"); ctest.absFinal();
		  System.out.println();
		  
		  atest.absNormal(); System.out.println();
		  
		  System.out.println("with concreat referance"); ctest.absNormal();
		  System.out.println();
		  
		  System.out.println("with ConcreatTest Class Name"); ConcreatTest.absStatic();
		  System.out.println();
		  
		  System.out.println("with Abstract Class Name"); Abstract.absStatic();
		  System.out.println();
		  
		  
		  //vars //
		  
		  //System.out.println(atest.abstractFinalVar); System.out.println();
		  
		  //atest.abstractFinalVar=1100; final not able to reassign
		  System.out.println();
		  
		  
		  
		  System.out.println(atest.abstractNormalVar);
		  
		  System.out.println();
		  
		  atest.abstractNormalVar=1100; System.out.println(atest.abstractNormalVar);
		  System.out.println();
		  
		  ConcreatTest.abstractStaticVar=1300;
		  System.out.println(ConcreatTest.abstractStaticVar); System.out.println();
		  System.out.println(Abstract.abstractStaticVar);
		  
		  System.out.println(Abstract.abstractStaticVar); System.out.println();
		  Abstract.abstractStaticVar=1200;
		  System.out.println(Abstract.abstractStaticVar); System.out.println();
		  
		  //System.out.println(ctest.abstractFinalVar); System.out.println();
		  
		  System.out.println(ctest.abstractNormalVar); System.out.println();
		  
		  System.out.println(ConcreatTest.abstractStaticVar); System.out.println();
		  
		  
		  //final Class
		  
		  FinalClass fc = new FinalClass();
		  
		 // fc.finalNormalMethods(); 
		  fc.finalFinalMethods();
		  
		  
		  Sample samp = new Sample();
		  
		 

		FinalClass fc1 = new FinalClass();
		Runnable r1 = () -> {
			for (int i = 0; i < 20; i++) {
				fc.increment();
				System.out.println(fc.getCount());
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			for (int i = 0; i < 20; i++) {

				fc.increment();
				System.out.println(fc.getCount());
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t2 = new Thread(r2);
		t2.start();

		t1.join();
		t2.join();
		
		
		ProjectService ps = new ProjectService();
		
		
		Employee employee=	new Employee(500, "Sai", 12000.33, "Devloper",
				ps.getProjectByTitles(new String[] { "CSE project", "Cloud project" }), "Hyderabad", 5);
		
		
		 try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

	            out.writeObject(employee);
	            System.out.println("employee object serialized successfully to employee.ser");

	        } catch (IOException i) {
	            i.printStackTrace();
	        }
		 
		 
		 
		 try (FileInputStream fileIn = new FileInputStream("employee.ser");
	             ObjectInputStream in = new ObjectInputStream(fileIn)) {

			 employee = (Employee) in.readObject();
	            System.out.println("employee object deserialized successfully.");
	            System.out.println(employee);

	        } catch (IOException i) {
	            i.printStackTrace();
	        } catch (ClassNotFoundException c) {
	            System.out.println("employee class not found.");
	            c.printStackTrace();
	        }
		 
	}

}
