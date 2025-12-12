package com.sai.core.java;

public abstract class Abstract {
	
	public  Abstract() {
		
		super();
	}

	public static int abstractStaticVar = 5000;
	public int abstractNormalVar = 6000;
	public final int abstractFinalVar = 7000;

	public static void absStatic() {
		System.out.println("Abstract class Static Method !!");
	}

	public abstract void absAbstract();
	
	public final void absFinal() {
		
		System.out.println("Abstract class Final Method !!");
	}

	public void absNormal() {
		System.out.println("Abstract class Normal Method !!");
	}
	
}
