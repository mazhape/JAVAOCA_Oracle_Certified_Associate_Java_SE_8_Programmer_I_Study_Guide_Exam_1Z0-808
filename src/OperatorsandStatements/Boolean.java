package OperatorsandStatements;

public class Boolean {
    public static void main(String[] args) {
        int x1=50, x2=75;
        boolean b =x1>=x2;
        if(b = true)System.out.println("Success");
        else System.out.println("Fail");
    }
}

//compilation error on line 7
//Problem:
//In the condition if(b = true), you are using the assignment operator (=) instead of the comparison operator (==).

//b = true is an assignment statement that assigns true to b, and the result of the assignment (which is true) is then evaluated in the if statement. This means that the condition will always evaluate to true, regardless of the value of b before the assignment.