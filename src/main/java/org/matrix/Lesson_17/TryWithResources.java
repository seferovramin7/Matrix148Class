package org.matrix.Lesson_17;

import java.io.FileOutputStream;

public class TryWithResources {

    public static void main(String args[]) {
        try (FileOutputStream fileOutputStream =
                     new FileOutputStream("/home/irfan/scala-workspace/java7-new-features/src/abc.txt")) {
            String msg = "Welcome to javaTpoint!";
            byte byteArray[] = msg.getBytes();  // Converting string into byte array
            fileOutputStream.write(byteArray);  // Writing  data into file
            System.out.println("Data written successfully!");
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Finally executes after closing of declared resources.");

        }
    }
}
