package org.matrix.Lesson_3;

public class TestLeet {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            String str = strs[i];
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix ;
    }

    public static void main(String[] args){
//        String a = "200";
//        String b = "200";
//
        Object a = new Object();
        Object b = new Object();
//        b.

            System.out.println(a.hashCode() + "\n" + b.hashCode());


    }
}
