package org.matrix.Lesson_10;

// Java code for stack implementation

import java.util.Stack;

class Test {
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {

        //              //
        //              //
        //     15       //
        //      5       //
        //      1        //
        ////////////////


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(15);


        //                      //
        //                      //
        //     15.000EURO       //
        //      5.000AZN       //
        //    10.000$        //
        //////////////////////

        Stack<Pul> pulStack = new Stack<>();
        pulStack.push(new Pul(10000, "$"));
        pulStack.push(new Pul(5000, "AZN"));
        pulStack.push(new Pul(15000, "EURO"));





//        pulStack.forEach(System.out::println);
        pulStack.pop();
        pulStack.pop();

//        System.out.println(pulStack.pop());
//        System.out.println(pulStack.pop());

        System.out.println(pulStack.peek());

//        stack_push(stack);
//        stack_pop(stack);
//        stack_push(stack);
//        stack_peek(stack);
//        stack_search(stack, 2);
//        stack_search(stack, 6);
    }

    static class Pul {
        int amount;
        String currency;

        public Pul(int amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "Pul{" +
                    "amount=" + amount +
                    ", currency='" + currency + '\'' +
                    '}';
        }
    }

    class a {
    }
}
