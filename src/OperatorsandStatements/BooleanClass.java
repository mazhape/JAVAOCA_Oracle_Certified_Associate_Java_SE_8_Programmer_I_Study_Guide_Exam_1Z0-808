package OperatorsandStatements;

public class BooleanClass {
    public static void main(String[] args) {
        boolean x = true, z = true;
        int y =20;
        x=(y != 10)^(z=false);
        System.out.println(x+", "+y+", "+z);
    }
}

//true 20 false

//Evaluating the Expression:
//The expression we need to evaluate is: x = (y != 10) ^ (z = false);
//Part 1: (y != 10)
//y = 20, so y != 10 is true (because 20 is not equal to 10).
//Part 2: (z = false)
//This is an assignment, not a comparison. The assignment z = false sets the value of z to false and the result of the assignment expression is false.
//Part 3: true ^ false
//The ^ operator is the bitwise XOR (exclusive OR) operator for boolean values. The XOR operation results in true if and only if the operands are different.
//true ^ false results in true.
//Therefore, the value of x becomes true.
//Final Values of Variables:
//x is now true.
//y remains 20 (because it wasn't modified).
//z is now false (since it was set to false by the assignment z = false).