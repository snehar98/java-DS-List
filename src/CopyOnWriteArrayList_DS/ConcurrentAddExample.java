package CopyOnWriteArrayList_DS;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentAddExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // Create and start multiple threads that add elements to the list
        Thread thread1 = new Thread(new Adder(list, 1));
        Thread thread2 = new Thread(new Adder(list, 2));
        Thread thread3 = new Thread(new Adder(list, 3));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final list
        System.out.println("Final list: " + list);
    }
}

class Adder implements Runnable {
    private final CopyOnWriteArrayList<Integer> list;
    private final int value;

    public Adder(CopyOnWriteArrayList<Integer> list, int value) {
        this.list = list;
        this.value = value;
    }

    @Override
    public void run() {
        // Add the value to the list
        list.add(value);
        System.out.println("Added: " + value);
    }
}
