package org.matrix.Lesson_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File myObj = new File("src/main/java/org/matrix/Lesson_17/filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                int i = myReader.nextInt();
                System.out.println(100 / i);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Nese sehvlik var!");
             throw new MushteriTapilmadiException();
        }
    }
}
