package OperatorsandStatements;

public class DoWhile {
    public static void main(String[] args) {
        int y =1;
        do{
            //int y =1;
            System.out.println(y++ + "");
        } while(y <= 10);
    }
}


//The code you've provided will not compile because the variable y is declared inside the do block, and it is out of scope for the while condition check. In Java, variables declared inside a block are not accessible outside that block.

//Solution:
//Declare y outside the loop: To fix this, you should declare y before the do block, so it's accessible both inside the loop and for the condition check.
//Corrected Code:

//public class DoWhile {
//    public static void main(String[] args) {
//        int y = 1;  // Declare y before the loop
//        do {
//            System.out.println(y++ + "");
//        } while (y <= 10);  // Use y in the condition here
//    }
//}
//Explanation:
//Variable Declaration: The variable y is declared before the loop starts, so it's accessible both inside the loop and for the condition check in the while.
//Loop Behavior:
//The do loop executes at least once, printing the value of y and then incrementing it (y++).
//The condition while (y <= 10) is checked after each iteration, so the loop continues until y becomes greater than 10.