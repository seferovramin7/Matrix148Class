package org.matrix.Lesson_18;


public class MainThread extends Thread {

    public static void main(String[] args) {
        MainThread tr1 = new MainThread();
        tr1.run();
    }

    @Override
    public void run() {
        System.out.println("Thread Started Running...");
    }
}
