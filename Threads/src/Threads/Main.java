package Threads;


class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Apple - " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Banana - " + i);
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Grape - " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}