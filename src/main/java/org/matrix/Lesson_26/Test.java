package org.matrix.Lesson_26;

interface Square {
    int power(int x);
}

class Test {
    public static void main(String args[]) {

        Square s = (int x) -> x * 10;


        int ans = s.power(5);


        System.out.println(ans);
    }
}
