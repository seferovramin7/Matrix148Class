package org.matrix.Lesson_25;

// A Java program to demonstrate
// working of recursion

class GFG {
    static void printFun(int test) {
        if (test < 1) {
            return;
        } else {
            System.out.printf("%d ", test);

            // Statement 2
            printFun(test - 1);

            System.out.printf("%d ", test);
            return;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, 2);
        ListNode l2 = new ListNode(1, 2);

        int val1 = l1.val;
        int val2 = l2.val;

        int next1 = l1.next;
        int next2 = l2.next;


    }
}

