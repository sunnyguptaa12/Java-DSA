package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

        String str = "abcddabcbb";

        HashSet <Character> set = new HashSet<>();

        int left = 0;                                                    //starting index of current substring
        int maxLength = 0;                                               //Store max length
        int start = 0;                                                   //Starting index of longest substring

        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);


            while(set.contains(ch)){                                     //check duplicate character
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);                                                 //Add current character

            if(right - left + 1 > maxLength){                            //calculate max length
                maxLength = right - left + 1;
                start = left;
            }
        }

        String Longest = str.substring(start, start + maxLength);        //find longest substring

        System.out.println("Longest substring: " + Longest);
        System.out.println("length: " + maxLength);
    }
}
