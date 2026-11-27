package Recursion;

public class PrintNumber1ToN {
    public static void print(int n){

        if(n > 5){
            return;
        }
        System.out.println(n);

        print(n + 1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
