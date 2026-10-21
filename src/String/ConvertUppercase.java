package String;

import java.util.Scanner;

public class ConvertUppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.toUpperCase();


        System.out.println("Original String : " + str);
        System.out.println("UpperCase string : " + result);
    }
}
