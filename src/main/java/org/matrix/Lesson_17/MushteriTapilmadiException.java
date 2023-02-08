package org.matrix.Lesson_17;

public class MushteriTapilmadiException extends RuntimeException{
    public String getMessage(int a) {
        return "Mushteri tapilmadi : " + a;
    }
}
