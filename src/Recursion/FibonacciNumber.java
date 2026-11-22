package Recursion;

public class FibonacciNumber {
    public static int fib(int n){

        if(n == 0){                                                //Base case
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fibonacci = fib(n -1) + fib(n - 2);             //Recursive case

        return fibonacci;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(6));
    }
}
