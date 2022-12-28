package org.matrix.Lesson_3;


public class App {
    public static void main(String[] args) {

         if (5==5 && 11==10){
             System.out.println("Ikisi de odendi");
         } else if (2==3 || 3>5) {
             System.out.println("Hech olmasa biri odendi");
         } else {
             System.out.println("Her variantda yaz");
         }

         int a = 10, b = 15, max;

         max = (a<b) ? a : b;


//        if (a>b){
//            max = a;
//        }else {
//            max = b;
//        }

        System.out.println(max);

    }
}