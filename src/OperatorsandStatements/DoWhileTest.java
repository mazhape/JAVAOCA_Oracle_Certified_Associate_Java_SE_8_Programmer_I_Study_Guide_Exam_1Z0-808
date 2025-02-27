package OperatorsandStatements;

public class DoWhileTest {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, i =10;
        do{
            i--;
            if(i==8)keepGoing = false;
            result -= 2;
        }while(keepGoing);
        System.out.println(result);
    }
}

// 11

//First Iteration (i = 10):
//
//i--: i becomes 9.
//if(i == 8) keepGoing = false;: This condition is not true yet, so the loop continues.
//result -= 2;: result becomes 13.
//Second Iteration (i = 9):
//
//i--: i becomes 8.
//if(i == 8) keepGoing = false;: Now i is 8, so keepGoing is set to false, terminating the loop.
//result -= 2;: result becomes 11.
//Exit Condition:
//
//The loop terminates because keepGoing is false.
//Final Value:
//i = 8 (after the second iteration).
//result = 11 (after the second iteration).
//Output:
//After the loop terminates, the result is printed to the console, which is 11