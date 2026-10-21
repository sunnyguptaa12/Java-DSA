package String;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "silent";

        str1 = str1.replace(" ", "").toLowerCase();       //remove space and convert into lowercase
        str2 = str2.replace(" ", "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
        }

        char[] arr1 = str1.toCharArray();                                  //covert both string into character arrays
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        }  else {
            System.out.println("Not anagrams");
        }
    }
}
