package OperatorsandStatements;

public class CastClass {
    public static void main(String[] args) {
        long x=10;
       // int y=2*x;
        //correct way
        int y = (int) (2 * x); // Explicit cast
    }
}

//java: incompatible types: possible lossy conversion from long to int

//Valid Fixes:
//Cast x to int on line 4: int y = 2 * (int) x;  // Explicit cast to int
//Cast 2 * x to int:int y = (int) (2 * x);  // Explicit cast of the whole expression
//Change y to long : long y = 2 * x;  // Now both sides are long
