package OperatorsandStatements;

public class IfClass {
    public static void main(String[] args) {
        int x =0;
        String s=null;
        if(x==s)System.out.println("Success");
        else System.out.println("Failure");
    }
}

//compile error line 7 error: incomparable types: int and String
//java: bad operand types for binary operator '=='
//  first type:  int
//  second type: java.lang.String
//To fix this issue, you need to either:

//Compare x with a numeric value, or
//Compare s with null to check if it is empty.

//Option 1: Compare x with 0 (if you intend to check for a number)

//public class IfClass {
//    public static void main(String[] args) {
//        int x = 0;
//        String s = null;
//        if (x == 0)  // Compare x with a number
//            System.out.println("Success");
//        else
//            System.out.println("Failure");
//    }
//}

//Option 2: Check if s is null
//public class IfClass {
//    public static void main(String[] args) {
//        int x = 0;
//        String s = null;
//        if (s == null)  // Check if s is null
//            System.out.println("Success");
//        else
//            System.out.println("Failure");
//    }
//}