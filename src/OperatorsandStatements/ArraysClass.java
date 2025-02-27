package OperatorsandStatements;

import java.util.ArrayList;

public class ArraysClass {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);   // Adds 10 to the list
        list.add(14);   // Adds 14 to the list

        for(int x : list){  // Enhanced for loop to iterate through the list
            System.out.println(x +",");  // Prints the value of x followed by a comma
            break;  // Exits the loop after the first iteration
        }
    }
}

//10,
//Line 9: The enhanced for loop starts iterating over the list.
//On the first iteration, x will be 10, and 10, will be printed.
//Line 10 contains a break statement, which will immediately exit the loop after the first iteration, so the loop does not proceed to the second element (14).