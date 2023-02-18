package org.matrix.Lesson_19;

public class HwSolution {

    static int numberOfDigits = 10000;
    volatile int counter = 1;

    public static void main(String[] args) {

        HwSolution mt = new HwSolution();

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                try {
                    mt.printEvenNumber();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    mt.printOddNumber();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }

    public void printOddNumber() throws InterruptedException {
        synchronized (this) {
            while (counter < numberOfDigits) {
                while (counter % 2 == 0) {
                    wait();
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() throws InterruptedException {
        synchronized (this) {
            while (counter < numberOfDigits) {
                while (counter % 2 == 1) {
                    wait();
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
}

