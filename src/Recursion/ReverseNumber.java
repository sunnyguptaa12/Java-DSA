package Recursion;

public class ReverseNumber {
    public static int reverse(int n, int rev){

        if(n == 0){
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(n/10, rev);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Reverse no is " + reverse(n, 0));
    }
}
