package OperatorsandStatements;

public class While {
    public static void main(String[] args) {
        int m =9, n=1,x=0;
        while (m > n) {
            m--;
            n += 2;
            x += m+n;
        }
        System.out.println(x);
    }
}

//36

//Inside the loop:
//Decrement m: m-- — Each time the loop runs, the value of m is decremented by 1.
//Increment n: n += 2 — The value of n is incremented by 2 on each iteration.
//Update x: x += m + n — The sum of m and n is added to x on each iteration.
//Iterations:
//1st Iteration:
//Initial values: m = 9, n = 1, x = 0
//m-- → m = 8
//n += 2 → n = 3
//x += m + n → x += 8 + 3 → x = 11
//2nd Iteration:
//m = 8, n = 3, x = 11
//m-- → m = 7
//n += 2 → n = 5
//x += m + n → x += 7 + 5 → x = 23
//3rd Iteration:
//m = 7, n = 5, x = 23
//m-- → m = 6
//n += 2 → n = 7
//x += m + n → x += 6 + 7 → x = 36