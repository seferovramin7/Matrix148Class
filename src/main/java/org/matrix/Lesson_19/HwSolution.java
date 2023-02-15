package org.matrix.Lesson_19;

public class HwSolution {

    static int numberOfDigits = 10000;
    volatile int counter = 1;

    public static void main(String[] args) {

        String name = "Ramin";
        name = "Ramin Seferov";


        HwSolution mt = new HwSolution();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });

        t1.start();
        t2.start();
    }

    public void printOddNumber() {
        synchronized (this) {
            while (counter < numberOfDigits) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < numberOfDigits) {

                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
}

