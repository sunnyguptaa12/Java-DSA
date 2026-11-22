package Recursion;

public class FactorialOfNumber {
    public static int fact(int n){

        if(n == 0 || n == 1){                          //Base case
            return  1;
        }

        int factorial = n * fact(n- 1);            //Recursive case
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
}
