package com.sai.core.java;

public interface InterfaceTest {

	int interfaceStaticVar = 2000;
	int interfaceNormalVar = 3000;
	int interfaceFinalVar = 4000;

	public void intfNormal();

	public static void intfStatic() {

		System.out.println("Interface Static Method !!");
	}

	default void intfdDefault() {

		System.out.println("Interface Default Method !!");
	}
	
	private void intfdPrivate() {

		System.out.println("Interface Default Method !!");
	}

}
