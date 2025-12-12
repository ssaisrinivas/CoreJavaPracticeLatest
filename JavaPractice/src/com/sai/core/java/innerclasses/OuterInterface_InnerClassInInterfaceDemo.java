package com.sai.core.java.innerclasses;

public interface OuterInterface_InnerClassInInterfaceDemo {

	public void interfaceAbstractMethod();

	default void innerInterfaceDefaultMethod() {

		System.out.println("Interface Default Method !!");
	}

	public static void innerInterfaceStaticMethod() {

		System.out.println("Interface Static Method !!");
	}
	
	public class InterfaceInnerClass {

	public static void interfaceinnerClassStaticMethod() {

		System.out.println("Interface Inner Class Static Method !!");
	}

	public final void interfaceinnerClassFinalMethod() {

		System.out.println("Interface Inner Class Final Method !!");
	}

	public void interfaceinnerInterfaceConcreateMethod() {
		System.out.println("Interface Inner Class Concreate Method !! ");
		
	}

}

}
