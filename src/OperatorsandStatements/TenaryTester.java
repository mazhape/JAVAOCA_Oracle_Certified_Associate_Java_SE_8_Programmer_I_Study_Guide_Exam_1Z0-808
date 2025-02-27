package OperatorsandStatements;

public class TenaryTester {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x>2?x<4?10:8:7);
    }
}

//8
//Explanation:
//Outer Ternary Expression: The outer ternary operator is:
//
//java
//Copy
//Edit
//x > 2 ? x < 4 ? 10 : 8 : 7
//If x > 2 is true, it will evaluate the second part, which is the nested ternary operator (x < 4 ? 10 : 8).
//If x > 2 is false, it will directly return 7.
//Inner Ternary Expression: The nested ternary operator is:
//
//java
//Copy
//Edit
//x < 4 ? 10 : 8
//If x < 4 is true, it returns 10.
//If x < 4 is false, it returns 8.
//Value of x:
//
//x = 5.
//x > 2 is true.
//So, we proceed to evaluate x < 4 ? 10 : 8.
//Evaluating Inner Ternary:
//
//Since x = 5, x < 4 is false, so the inner ternary expression returns 8.