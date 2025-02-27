package OperatorsandStatements;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10;){
            i = i++;
            System.out.println("Hello World");

        }
    }
}

//infinite loop

//Analysis:

//Initialization:
//int i = 0;
//The loop counter i is initialized to 0.
//Condition:
//i < 10;
//The loop will continue executing as long as i is less than 10.
//Update (or lack thereof):
//There is no i++ or any other operation in the loop header to increment i. However, inside the loop, the statement i = i++; is executed. Let's break down this statement:
//Expression i = i++;:
//The i++ is a post-increment operator, meaning it first uses the value of i and then increments it. However, since the result of i++ is assigned back to i, the increment is effectively discarded. In other words, i will remain the same after the statement is executed.
//So, even though i is incremented internally by i++, the assignment i = i++ will cause i to stay the same value throughout the loop.
//Infinite Loop:
//Since i never changes (it stays 0), the loop condition i < 10 is always true. This results in an infinite loop, and the program will keep printing "Hello World" indefinitely.

//fixing the code
//for (int i = 0; i < 10; i++) {  // Increment i after each iteration
//        System.out.println("Hello World");
//}
