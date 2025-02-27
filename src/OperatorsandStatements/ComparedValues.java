package OperatorsandStatements;

public class ComparedValues {
    public static void main(String[] args) {
        int x =0;
        while(x++ <10){}
       // String message = x>10? "GREATER THAN": false;
        //correct answer
        String message = x>10? "GREATER THAN": "false";
        System.out.println(message+","+x);
    }
}

// incompatible types: bad type in conditional expression
//    boolean cannot be converted to java.lang.String
//Java does not allow mixing String and boolean types like this.