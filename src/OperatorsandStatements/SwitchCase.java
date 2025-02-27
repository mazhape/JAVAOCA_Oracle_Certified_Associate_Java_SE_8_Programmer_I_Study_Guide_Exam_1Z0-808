package OperatorsandStatements;

public class SwitchCase {
    public static void main(String[] args) {
        final char a='A', d='D';
        char grade = 'B';

        switch(grade){
            case a:
            case 'B': System.out.println("great");
            case 'C':System.out.println("good");
            break;
            case d:
            case'F':System.out.println("not good");

        }
    }
}

//great good

//Case Breakdown:
//case a: — This refers to a, which is the constant 'A'. Since grade is 'B', this case won't be executed.
//
//case 'B': — Since grade is 'B', this case is executed.
//
//It prints "great".
//There is no break statement after this case, so the program continues executing the next case.
//case 'C': — Since there is no break after case 'B':, this case is also executed, even though grade is 'B'. It prints "good".
//
//break; — The break statement here causes the program to exit the switch block after printing "good".
//
//case d: — This case is skipped because the switch statement has already broken out after printing "good".
//
//case 'F': — This case is also skipped for the same reason as case d: