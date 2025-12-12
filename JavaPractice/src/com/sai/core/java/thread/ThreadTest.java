package com.sai.core.java.thread;

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        // Create two threads that will access the same Counter object
        IncrementThread thread1 = new IncrementThread(sharedCounter, "Thread-1");
        IncrementThread thread2 = new IncrementThread(sharedCounter, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            //thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count: " + sharedCounter.getCount());
    }
}