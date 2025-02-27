package OperatorsandStatements;

public class Result {
        public static void main(String[] args) {
            int c =7;
            int result = 4;
            result += ++c;
            System.out.println(result);
        }
}

//12
//Explanation:
//Initialization:
//
//int c = 7; initializes c to 7.
//int result = 4; initializes result to 4.
//Increment Operation:
//
//result += ++c;:
//The ++c is the pre-increment operator. This means c will be incremented first, and then its new value will be added to result.
//Since c was initially 7, after ++c, c becomes 8.
//So, result += 8; will effectively add 8 to the current value of result, which is 4.
//After this, result becomes 4 + 8 = 12.
//Printing the Result:
//
//System.out.println(result); will print the updated value of result, which is 12.