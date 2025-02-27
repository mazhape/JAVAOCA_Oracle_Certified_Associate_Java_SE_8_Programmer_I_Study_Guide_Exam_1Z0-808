package OperatorsandStatements;

public class CompareClass {
    public static void main(String[] args) {
        int x =4;
        long y= x*4-x++;
        if(y<10)System.out.println("Too Low");
        else System.out.println("Just Right");

        //else System.out.println("Too High");
    }
}

//code will not compile becoz of line 9
//Extra else: The second else statement does not have a corresponding if, which causes a compile-time error.