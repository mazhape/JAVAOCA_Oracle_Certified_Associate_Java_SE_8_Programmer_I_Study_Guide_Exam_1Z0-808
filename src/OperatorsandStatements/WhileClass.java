package OperatorsandStatements;

public class WhileClass {
    public static void main(String[] args) {
        int x=1, y=15;
        while x<10
                y--;
        x++;
        System.out.println(x+", "+y);

    }
}

//Will not compile
//While condition syntax: The while loop needs to have its condition in parentheses. The condition x < 10 is missing the parentheses around it. The correct syntax for a while loop is:
//while (x < 10) { }