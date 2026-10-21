package String;

import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Strings: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                result.append(ch);
            }
        }
        System.out.println("String without space: " + result);
    }
}
