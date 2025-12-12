package com.sai.corejava;

import com.sai.core.java.Abstract;
import com.sai.core.java.InterfaceTest;

public class ConcreatTest extends Abstract implements InterfaceTest {
	
	
	public static int ConcreatTestStaticVar = 8000;
	public int ConcreatTestNormalVar = 9000;
	public final int ConcreatTestFinalVar = 10000;

	/*
	 * public static int abstractStaticVar = 11000; public int abstractNormalVar =
	 * 12000; public final int abstractFinalVar = 13000;
	 */

	@Override
	public void intfNormalAbstract() {
		System.out.println("Interface Implemented Class ConcreatTest Method !! ");
	}

	@Override
	public void absAbstract() {
		System.out.println("Abstract Class Extended ConcreatTest Class Method !! ");
	}

	public void concreatTestMethod() {
		System.out.println("ConcreatTest class Owne Concreat Method !! ");

	}

	public final void concreatTestFinal() {

		System.out.println("ConcreatTest class Owne Final Method !!");
	}

	public void concreatTestAccessIntrfDefaultMethod() {
		InterfaceTest.super.intfdDefault();
	}

	public void absNormal() {
		super.absNormal();
		System.out.println("Abstract class Normal Method implemented in ConcreatTest !!");
	}
	

}
