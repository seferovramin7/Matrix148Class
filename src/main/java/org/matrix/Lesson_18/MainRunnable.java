package org.matrix.Lesson_18;

import java.time.LocalDateTime;

public class MainRunnable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(LocalDateTime.now());
        Thread.sleep(2000);
        System.out.println(LocalDateTime.now());
    }
}