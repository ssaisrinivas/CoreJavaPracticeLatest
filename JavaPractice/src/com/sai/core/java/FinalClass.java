package com.sai.core.java;

public final class FinalClass {

	public FinalClass() {

		super();
	}

	private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }


	public final void finalFinalMethods() {

		System.out.println("Final Class finalFinalMethods !!!");
	}

	public void finalNormalMethods() {
		System.out.println("Final Class finalNormalMethods !!!");
		
	}

}
