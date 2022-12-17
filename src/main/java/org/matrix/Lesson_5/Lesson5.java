package org.matrix.Lesson_5;

public class Lesson5 {
    public static void main(String[] args) {

        //1, 2, 7, 9, 14, 77, 99, 13

//        System.out.println(menimArrayim.length);
//        System.out.println(menimArrayim[0]);
//        for (int i = 1; i <= 8; i+=5) {
//            System.out.println(menimArrayim[i]);
//        }


//        int[] menimArrayim = new int[]{43, 999, 234, 94, 14, 77, 99, 13};
//        for (int i : menimArrayim) {
//            System.out.println(i);
//        }

//        System.out.println(menimArrayim[2]);


//        int[] arr;
//        arr = new int[5];
//        arr[0] = 14232;
//        arr[1] = 242323;
//        arr[2] = 3423;
//        arr[3] = 5554;
//        arr[4] = 1477;
//        System.out.println(arr[3]);

        String[] menimArrayim = new String[]{"a","b", "c"};

        Telebe[] menimTelebeArrayim;
        menimTelebeArrayim = new Telebe[3];

        menimTelebeArrayim[0] = new Telebe(12, "Arif");
        menimTelebeArrayim[1] = new Telebe(2312, "Yusif");
        menimTelebeArrayim[2] = new Telebe(76655, "Akif");


        for (Telebe telebe : menimTelebeArrayim) {
            System.out.println(telebe);
        }



    }
}
